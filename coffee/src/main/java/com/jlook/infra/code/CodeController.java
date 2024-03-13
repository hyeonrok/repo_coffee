package com.jlook.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired
	CodeService service;
	
	@RequestMapping(value = "/CodeXdmList")				
	public String codeXdmList(Model model) throws Exception{		
	
		model.addAttribute("list", service.selectList());
	System.out.println(model.toString());
		
		return "xdm/infra/CodeXdmList";
	}
	
	@RequestMapping(value = "/CodeForm")
	public String form() throws Exception {
		
		return "xdm/infra/CodeForm";
		
	}
	@RequestMapping(value = "/CodeView")
	public String CodeView(CodeDto dto, Model model) throws Exception{
		
		model.addAttribute("item", service.selectOne(dto));
		return "xdm/infra/CodeView";
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



