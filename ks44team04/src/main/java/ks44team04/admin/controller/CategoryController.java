package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {

	// 카테고리 등록 화면
	@GetMapping("/addCategory")
	public String addCategoryForm (Model model) {
		
		model.addAttribute("title", "카테고리 등록 화면");
		return "admin/category/category_add";
	}
	
	// 카테고리 목록 화면
	@GetMapping("/categoryList")
	public String getCategoryList (Model model) {
		
		model.addAttribute("title", "카테고리 목록 화면");
		return "admin/category/category_list";
	}
}
