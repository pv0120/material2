package net.springboot.mat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import net.springboot.mat.model.Material;
import net.springboot.mat.service.MaterialService;

@Controller
public class MaterialController {
	
	@Autowired
	private MaterialService materialService;
	//before pagination
//	@GetMapping("/")
//    public String viewHomePage(Model model) {
//        model.addAttribute("listmaterial", materialService.getAllMaterial());
//        return "index";
	//After Pagination
	@GetMapping("/")
	public String viewHomePage(Model model) {
	 return findPaginated(1, model);  
	}
	
   
	//Pagination
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
	    int pageSize = 100;
	    
	    Page < Material > page = materialService.findPaginated(pageNo, pageSize);
	    List <Material> listmaterial= page.getContent();

	    model.addAttribute("currentPage", pageNo);
	    model.addAttribute("totalPages", page.getTotalPages());
	    model.addAttribute("totalItems", page.getTotalElements());
	    model.addAttribute("listmaterial", listmaterial);
		return "index";
	}
}
