package ks44team04.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user/customerAsk")
public class UserCustomerAskContorller {

	// 구매자 고객 문의 목록 화면
	@GetMapping("/customerAskList")
	public String getCustomerAskList (Model model) {
		
		model.addAttribute("title", "구매자 고객 문의 목록 화면");
		return "user/customerAsk/user_customerAsk_list";
	}
	
}
