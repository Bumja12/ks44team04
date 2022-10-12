package ks44team04.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ks44team04.service.UserService;

@Controller
@RequestMapping("/user/user")
public class UserUserController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	/*
	 * private UserService userService;
	 * 
	 * public UserUserController(UserService userService) { this.userService =
	 * userService; }
	 */
	

	@GetMapping("/myPage")
	public String myPage(Model model) {
		
		model.addAttribute("title", "마이페이지");
			
		return"user/user/myPage";
	}
    

}