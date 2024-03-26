package com.jlook.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jlook.infra.codegroup.CodeGroupService;

@Controller
public class CodeController {
	
	@Autowired
	CodeService service;
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/CodeXdmList")				
	public String codeXdmList(@ModelAttribute("vo") CodeVo vo, Model model) throws Exception{
		model.addAttribute("list", service.selectList(vo));
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



