package com.jlook.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {

	@Autowired
	CodeGroupService service;
//	CodeGroupService codeGroupService;
	@RequestMapping(value = "/codeGroupXdmList")
	public String codeGroupXdmList(Model model) throws Exception {
		
//		List<CodeGroupDto> codeGroupDtos = service.selectList();
//		model.addAttribute("list", codeGroupDtos);
//		// list = codeGroupDtos;
//		
//		for(CodeGroupDto a : codeGroupDtos) {
//			System.out.println(a.getName());
//		}
		
		model.addAttribute("list", service.selectList());
		
		return "codeGroupXdmList";
		
	}
	
	
	
	@RequestMapping(value = "/codeGroupView")
	public String codeGroupView(CodeGroupDto dto, Model model) throws Exception {
		
		System.out.println("dto.getseq() : " + dto.getSeq());
		System.out.println("dto.getName() : " + dto.getName());
		System.out.println("dto.geModDatetime() : " + dto.getModDatetime());
		model.addAttribute("item", service.selectOne(dto));
		return "codeGroupView";
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
		
		service.insert(dto);
		return "redirect:/codeGroupXdmList";
	}

	@RequestMapping(value = "/codeGroupUpdate")
	public String codeGroupUpdate(CodeGroupDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString());
		service.update(dto);
		return "redirect:/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/codeGroupUelete")
	public String codeGroupUelete(CodeGroupDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString()+"---------------------------");
	
		service.uelete(dto);
		return "redirect:/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/codeGroupDelete")
	public String codeGroupDelete(CodeGroupDto dto) throws Exception {
		
		//System.out.println("dto.getName() : " + dto.getName());
		System.out.println(dto.toString());
		service.delete(dto);
		return "redirect:/codeGroupXdmList";
	}
}
