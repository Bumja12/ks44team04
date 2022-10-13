package ks44team04.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.dto.RegularAsk;
import ks44team04.dto.RegularAskCategory;
import ks44team04.service.CategoryService;
import ks44team04.service.RegularAskService;

@Controller
@RequestMapping(value = "/user/regularAsk")
public class UserRegularAskController {
	
	// 자주 묻는 질문 서비스 의존성 주입
	private final RegularAskService regularAskService;
	// 카테고리 관리 서비스 의존성 주입
	private final CategoryService categoryService;
	
	// 생성자 메소드
	public UserRegularAskController(RegularAskService regularAskService, CategoryService categoryService) {
		this.categoryService = categoryService;
		this.regularAskService = regularAskService;
	}
	
	// 구매자 자주 묻는 질문 목록 화면
	@GetMapping("/regularAskList")
	public String getRegularAskList (Model model) {
		
		// 자주 묻는 질문 목록
		List<RegularAsk> regularAskList =  regularAskService.getRegularAskList();
		
		// 자주 묻는 질문 카테고리 목록
		List<RegularAskCategory> regularAskCategoryList = categoryService.getRegularAskCategoryList();
		
		model.addAttribute("title", "구매자 자주 묻는 질문 목록 화면");
		model.addAttribute("regularAskList", regularAskList);
		model.addAttribute("regularAskCategoryList", regularAskCategoryList);
		
		return "user/regularAsk/user_regularAsk_list";
	}
	
}
