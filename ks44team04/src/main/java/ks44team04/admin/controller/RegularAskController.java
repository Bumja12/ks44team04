package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/regularAsk")
public class RegularAskController {
	
	// 관리자 자주 묻는 질문 내역 화면
	@GetMapping("/regularAskDetail")
	public String getRegularAskDetail (Model model) {
		
		model.addAttribute("title", "관리자 자주 묻는 질문 내역 화면");
		return "admin/regularAsk/admin_regularAsk_detail";
	}
	
	// 관리자 자주 묻는 질문 등록 화면
	@GetMapping("/addRegularAsk")
	public String addRegularAskForm (Model model) {
		
		model.addAttribute("title", "관리자 자주 묻는 질문 등록 화면");
		return "admin/regularAsk/admin_regularAsk_add";
	}
	
	// 관리자 자주 묻는 질문 목록 화면
	@GetMapping("/regularAskList")
	public String getRegularAskList (Model model) {
		
		model.addAttribute("title", "관리자 자주 묻는 질문 목록 화면");
		return "admin/regularAsk/admin_regularAsk_list";
	}
	
	
}
