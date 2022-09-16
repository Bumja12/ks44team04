package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {

	// modifyCategoryAction
	
	// 카테고리 수정 화면
	@PostMapping("modifyCategory")
	public String modifyCategoryAction () {
		
		// 카테고리 내역 화면으로 리다이렉트
		return "redirect:/admin/category/categoryDetail";
	}
	
	// 카테고리 수정 화면
	@GetMapping("/modifyCategory")
	public String modifyCategoryForm (Model model) {
		
		model.addAttribute("title", "카테고리 수정 화면");
		return "admin/category/category_modify";
	}
	
	// 카테고리 내역 화면
	@GetMapping("/categoryDetail")
	public String getCategoryDetail (Model model) {
		
		model.addAttribute("title", "카테고리 내역 화면");
		return "admin/category/category_detail";
	}
	
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
