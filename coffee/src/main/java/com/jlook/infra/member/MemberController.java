package com.jlook.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/MemberXdmList")
	public String memberXdmList(@ModelAttribute("vo") MemberVo vo, Model model) {
		System.out.println(vo.toString()+ " -------------------------");
		
		model.addAttribute("list", service.selectList(vo));
		
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
	
	@RequestMapping(value = "/usrInsert")
	public String usrInsert(MemberDto dto) {
		
		service.insert(dto);
		return "redirect:/index";
	}
}
