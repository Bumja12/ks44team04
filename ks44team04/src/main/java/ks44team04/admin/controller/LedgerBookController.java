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
	
	@GetMapping("/admin/ledgerBook/salesStatistics")
	public String salesStatistics(Model model) {
		
		model.addAttribute("title", "연령/지역별 통계");
		
		return "admin/ledgerBook/salesStatistics";
	}
	
	@GetMapping("/admin/ledgerBook/ageAreaStatistics")
	public String ageAreaStatistics(Model model) {
		
		model.addAttribute("title", "연령/지역별 통계");
		
		return "admin/ledgerBook/ageAreaStatistics";
	}
	
}
