package com.jlook.infra.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jlook.common.base.BaseVo;
import com.jlook.common.constants.Constants;
import com.jlook.common.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	public void setSearch(BaseVo vo) throws Exception {
		/* 최초 화면 로딩시에 세팅은 문제가 없지만 */
		/*이후 전체적으로 데이터를 조회를 하려면 null 값이 넘어 오는 관계로 문제가 전체 데이터 조회가 되지 못한다.*/
		/*해서 BaseVo.java 에서 기본값을 주어서 처리*/
//		vo.setShUseNy(vo.getShUseNy() == null ? 1 : vo.getShUseNy());
//		vo.setShDelNy(vo.getShDelNy() == null ? 0 : vo.getShDelNy());
//		vo.setShOptionDate(vo.getShOptionDate() == null ? 2 : vo.getShOptionDate());
		
		/* 초기값 세팅이 있는 경우 사용 */
		vo.setShDateStart(vo.getShDateStart() == null
		    ? UtilDateTime.calculateDayReplace00TimeString(UtilDateTime.nowLocalDateTime(), Constants.DATE_INTERVAL)
		    : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null
		    ? UtilDateTime.nowString()
		    : UtilDateTime.addNowTimeString(vo.getShDateEnd()));		
		
//		/* 초기값 세팅이 없는 경우 사용 */
//		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
//		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		
		
	}
	
	@RequestMapping(value = "/MemberXdmList")
	public String memberXdmList(@ModelAttribute("vo") MemberVo vo, Model model) throws Exception {
		System.out.println(vo.toString()+ " -------------------------");
		
		model.addAttribute("list", service.selectList(vo));
		
		setSearch(vo);

		model.addAttribute("count", service.selectOneCount(vo));
		vo.setParamsPaging(service.selectOneCount(vo));
		
		if(vo.getTotalRows() >0 ) {
			model.addAttribute("list", service.selectList(vo));
		}
		
		return "xdm/infra/MemberXdmList";
	}
	
	@RequestMapping(value = "/MemberXdmReg")
	public String memberXdmReg() {

		return "xdm/infra/MemberXdmReg";
	}
	
	@RequestMapping(value = "/MemberXdmForm")
	public String memberXdmForm(Model model, MemberDto dto) {

		model.addAttribute("item", service.selectOne(dto));
		return "xdm/infra/MemberXdmForm";
	}
	
	@RequestMapping(value = "/MemberInsert")
	public String memberInsert(MemberDto dto) {
		
		dto.setMemberPwd(encodeBcrypt(dto.getMemberPwd(), 10));
		service.insert(dto);
		return "redirect:/MemberXdmList";
	}
	
	@RequestMapping(value = "/MemberUpdate")
	public String memberUpdate(MemberDto dto) {
		
		service.update(dto);
		return "redirect:/MemberXdmList";
	}
	
	@RequestMapping(value = "/MemberUelete")
	public String memberUelete(MemberDto dto) {
		
		service.uelete(dto);
		return "redirect:/MemberXdmList";
	}
	
	@RequestMapping(value = "/MemberDelete")
	public String memberDelete(MemberDto dto) {
		
		service.delete(dto);
		return "redirect:/MemberXdmList";
	}
	
	
//	-------------------------- usr --------------------------------
	
	@RequestMapping(value = "/register")
	public String register() {

		return "usr/infra/register";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		
		return "usr/infra/index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/signinXdmProc")
	public Map<String, Object> signinXdmProc(MemberDto dto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();

		// 아이디, 패스워드를 통해서 회원인지 아닌지 여부 조회
		MemberDto dtos = service.selectLogin(dto);
		dtos.getMemberId();
		System.out.println(dtos.getMemberId()+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		/*
		 * dto.getMemberId().equals(service.selectLogin(dto).getMemberId());
		 */		System.out.println(dto.getMemberId() + dto.getMemberPwd()+"-----------------------------------");
        returnMap.put("rt", "success");
       
		return returnMap ;
	}
	
	@RequestMapping(value = "/login")
	public String signin(MemberDto dto) {

		return "usr/infra/login";
	}
	
	@RequestMapping(value = "/usrInsert")
	public String usrInsert(MemberDto dto) {
		
		dto.setMemberPwd(encodeBcrypt(dto.getMemberPwd(), 10));
		service.insert(dto);
		return "redirect:/index";
	}
	
	

	
	public String encodeBcrypt(String planeText, int strength) {
		  return new BCryptPasswordEncoder(strength).encode(planeText);
	}

			
	public boolean matchesBcrypt(String planeText, String hashValue, int strength) {
	  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(strength);
	  return passwordEncoder.matches(planeText, hashValue);
	}
	
	
}
