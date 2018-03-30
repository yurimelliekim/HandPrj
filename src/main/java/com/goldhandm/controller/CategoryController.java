package com.goldhandm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.goldhandm.entity.Category;
import com.goldhandm.service.CategoryService;

@Controller
@RequestMapping("/category/")
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	public String list(@RequestParam(value="p",defaultValue="1") Integer page
						,Model model) {
		
		List<Category> categories = service.getCategoryList(page);
		model.addAttribute("categories", categories);
		return "category/list";
	}
	
	public String detail(@PathVariable("id") Integer id
						,Model model) {
		
		Category category = service.getCategory(id);
		model.addAttribute("category", category);
		return "category/detail";
	}
	
}
