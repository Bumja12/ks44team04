package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {
	
	// 카테고리 검색 처리
	@PostMapping("/searchCategory")
	public String searchCategory () {
		
		return "redirect:/admin/category/categoryList";
	}
	
	// 카테고리 삭제 처리
	@PostMapping("/removeCategory")
	public String removeCategory () {
		
		// 카테고리 목록 화면으로 리다이렉트
		return "admin/category/category_remove";
	}
	
	// 카테고리 수정 화면
	@PostMapping("modifyCategory")
	public String modifyCategoryAction () {
		
		// 카테고리 내역 화면으로 리다이렉트
		return "redirect:/admin/category/categoryList";
	}
	
	// 카테고리 수정 화면
	@GetMapping("/modifyCategory")
	public String modifyCategoryForm (Model model) {
		
		model.addAttribute("title", "카테고리 수정 화면");
		return "admin/category/category_modify";
	}
	
	// 카테고리 등록 처리
	@PostMapping("/addCategory")
	public String addCategoryAction (Model model) {
		
		return "redirect:/admin/category/categoryList";
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
