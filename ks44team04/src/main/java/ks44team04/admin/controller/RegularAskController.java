package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/regularAsk")
public class RegularAskController {
	
	// 카테고리 목록 화면
	@GetMapping("/regularAskList")
	public String getCategoryList (Model model) {
		
		model.addAttribute("title", "자주 묻는 질문 목록 화면");
		return "admin/regularAsk/admin_regularAsk_list";
	}
	
	
}
