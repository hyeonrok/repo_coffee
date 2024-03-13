package com.jlook.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jlook.common.constants.Constants;
import com.jlook.common.util.UtilDateTime;

import templates.xdm.infra.CodeGroupVo;

@Controller
public class CodeGroupController {

	@Autowired
	CodeGroupService service;
//	CodeGroupService codeGroupService;

	@RequestMapping(value = "/productTableList")
	public String codeGroupXdmList(@ModelAttribute("vo") CodeGroupVo vo, Model model) throws Exception{
			model.addAttribute("list", service.selectList(vo));
//			model.addAttribute("vo", vo);

			System.out.println(vo.toString()+"==================================");
        return "xdm/infra/productTableList";
  	}
	
	
	@RequestMapping(value = "/CodeGroupView")
	public String codeGroupView(CodeGroupDto dto, Model model) throws Exception {
		
		System.out.println("dto.getseq() : " + dto.getSeq());
		System.out.println("dto.getName() : " + dto.getName());
		System.out.println("dto.geModDatetime() : " + dto.getModDatetime());
		model.addAttribute("item", service.selectOne(dto));
		return "xdm/infra/CodeGroupView";
	}
	
	@RequestMapping(value = "/CodeGroupForm")
	public String CodeGroupForm(CodeGroupDto dto, Model model) throws Exception {
		
		System.out.println(dto.toString());
		model.addAttribute("item", service.selectOne(dto));

		return "CodeGroupForm";
	}
	
	@RequestMapping(value = "/CodeGroupReg")
	public String CodeGroupReg(CodeGroupDto dto, Model model) throws Exception {
		
		//System.out.println("dto.getSeq() : " + dto.getSeq());

		return "CodeGroupReg";
	}
	
	@RequestMapping(value = "/codeGroupInsert")
	public String CodeGroupInsert(CodeGroupDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		
		System.out.println(dto.toString());
		service.insert(dto);
		return "redirect:/productTableList";
	}

	@RequestMapping(value = "/codeGroupUpdate")
	public String codeGroupUpdate(CodeGroupDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString()+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		service.update(dto);
		return "redirect:productTableList";
	}
	
	
	@RequestMapping(value = "/codeGroupUelete")
	public String codeGroupUelete(CodeGroupDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString()+"---=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=------------------");
	
		service.uelete(dto);
		return "redirect:/productTableList";
	}
	
	@RequestMapping(value = "/codeGroupDelete")
	public String codeGroupDelete(CodeGroupDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString()+"+++++++++++++++++++++++++++++++________________+++++++++++++++++++++");
		service.delete(dto);
		return "redirect:/productTableList";
	}
	
	@RequestMapping(value = "/Form2")
	public String form() throws Exception {
		
		return "xdm/infra/Form2";
		
	}
	
	@RequestMapping(value = "/Form3")
	public String form3(CodeGroupDto dto, Model model) throws Exception {
		
		System.out.println(dto.toString()+"===============================");
		model.addAttribute("item", service.selectOne(dto));
		return "xdm/infra/Form3";
		
		
		
	}
	
	@RequestMapping(value = "/Login")
	public String login() throws Exception {
		
		
		return "xdm/infra/Login";
		
	}
	
	public void setSearch(CodeGroupVo vo) throws Exception {
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
	
	
}