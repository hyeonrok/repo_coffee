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
	public String memberList(@ModelAttribute("vo") MemberVo vo, Model model) {
		
		model.addAttribute("list", service.selectList(vo));
		
		return "xdm/infra/MemberXdmList";
	}
}
