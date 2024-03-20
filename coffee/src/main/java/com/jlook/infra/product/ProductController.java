package com.jlook.infra.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping(value = "/ProductXdmList")
	public String productXdmList(@ModelAttribute("vo") ProductVo vo, Model model) {
		
		model.addAttribute("list", service.selectList(vo));
		
		return "xdm/infra/ProductXdmList";
	}
	
	
	@RequestMapping(value = "/ProductXdmReg")
	public String productXdmReg() {

		return "xdm/infra/ProductXdmReg";
	}
	
	@RequestMapping(value = "/ProductXdmForm")
	public String productXdmForm(Model model, ProductDto dto) {

		model.addAttribute("item", service.selectOne(dto));
		return "xdm/infra/ProductXdmForm";
	}
	
	@RequestMapping(value = "/ProductInsert")
	public String productInsert(ProductDto dto) {
		
		service.insert(dto);
		return "redirect:/ProductXdmList";
	}
	
	@RequestMapping(value = "/ProductUpdate")
	public String productUpdate(ProductDto dto) {
		
		service.update(dto);
		return "redirect:/ProductXdmList";
	}
	
	@RequestMapping(value = "/ProductUelete")
	public String productUelete(ProductDto dto) {
		
		service.uelete(dto);
		return "redirect:/ProductXdmList";
	}
	
	@RequestMapping(value = "/ProductDelete")
	public String productDelete(ProductDto dto) {
		
		service.delete(dto);
		return "redirect:/ProductXdmList";
	}
}
