package com.jlook.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jlook.common.base.BaseVo;
import com.jlook.common.constants.Constants;
import com.jlook.common.util.UtilDateTime;
import com.jlook.infra.codegroup.CodeGroupService;

@Controller
public class CodeController {
	
	@Autowired
	CodeService service;
	
	@Autowired
	CodeGroupService codeGroupService;
	
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
	
	@RequestMapping(value = "/CodeXdmList")				
	public String codeXdmList(@ModelAttribute("vo") CodeVo vo, Model model) throws Exception{

		model.addAttribute("list", service.selectList(vo));
		
		setSearch(vo);
		
		model.addAttribute("count", service.selectOneCount(vo));
		vo.setParamsPaging(service.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", service.selectList(vo));
		}

	System.out.println(vo.toString());
		
		return "xdm/infra/CodeXdmList";
	}
	
	@RequestMapping(value = "/CodeForm")
	public String codeForm(CodeDto dto, Model model) throws Exception {
		
		System.out.println(dto.toString()+"===============================");
		model.addAttribute("item", service.selectOne(dto));
		return "xdm/infra/CodeForm";
		
	}
	
	@RequestMapping(value = "/CodeReg")
	public String codeReg(Model model) throws Exception {
		
		model.addAttribute("codeGroupList", codeGroupService.selectListWithoutPaging());
		
		return "xdm/infra/CodeReg";
		
	}
	
	@RequestMapping(value = "/CodeInsert")
	public String CodeInsert(CodeDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		
		service.insert(dto);
		return "redirect:/CodeXdmList";
	}

	@RequestMapping(value = "/CodeUpdate")
	public String CodeUpdate(CodeDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString());
		service.update(dto);
		return "redirect:CodeXdmList";
	}
	
	@RequestMapping(value = "/CodeUelete")
	public String CodeUelete(CodeDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString()+"---------------------------");
	
		service.uelete(dto);
		return "redirect:/CodeXdmList";
	}
	
	@RequestMapping(value = "/CodeDelete")
	public String CodeDelete(CodeDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString());
		service.delete(dto);
		return "redirect:/CodeXdmList";
	}
	
	
}



