package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/customerAsk")
public class CustomerAskContorller {

	// 관리자 고객 문의 답변 목록 화면
	@GetMapping("/askAnswerList")
	public String getAskAnswerList (Model model) {
		
		model.addAttribute("title", "관리자 고객 문의 답변 목록 화면");
		return "admin/customerAsk/admin_askAnswer_list";
	}
	
	// 관리자 고객 문의 목록 화면
	@GetMapping("/customerAskList")
	public String getCustomerAskList (Model model) {
		
		model.addAttribute("title", "관리자 고객 문의 목록 화면");
		return "admin/customerAsk/admin_customerAsk_list";
	}
	
}
