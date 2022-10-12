package ks44team04.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.service.LedgerBookService;

@Controller
@RequestMapping("/user")
public class UserLedgerBookController {
	
	private LedgerBookService ledgerBookService;
	
	public UserLedgerBookController(LedgerBookService ledgerBookService) {
		this.ledgerBookService = ledgerBookService;
	}
	
	@GetMapping("/userledgerBook/userBooks")
	public String userBooks(Model model) {
		
		model.addAttribute("title", "구매자 장부");
		
		return"user/userledgerBook/userBooks";
	}
	
}
