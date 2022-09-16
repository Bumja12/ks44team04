package ks44team04.admin.controller.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user/regularAsk")
public class UserRegularAskController {

	// 구매자 자주 묻는 질문 목록 화면
	@GetMapping("/regularAskList")
	public String getRegularAskList (Model model) {
		
		model.addAttribute("title", "구매자 자주 묻는 질문 목록 화면");
		return "user/regularAsk/user_regularAsk_list";
	}
	
}
