package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks44team04.service.LedgerBookService;

@Controller
public class LedgerBookController {
	
	private LedgerBookService ledgerBookService;
	
	public LedgerBookController(LedgerBookService ledgerBookService) {
		this.ledgerBookService = ledgerBookService;
	}
	
	@GetMapping("/admin/ledgerBook/sellerBook")
	public String lederBook(Model model) {
		
		model.addAttribute("title", "판매자 장부");
		
		return "admin/ledgerBook/sellerBook";
	}
}
