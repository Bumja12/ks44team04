package ks44team04.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.dto.Order;
import ks44team04.service.LedgerBookService;

@Controller
@RequestMapping("/admin")
public class LedgerBookController {
	
	private LedgerBookService ledgerBookService;
	
	public LedgerBookController(LedgerBookService ledgerBookService) {
		this.ledgerBookService = ledgerBookService;
	}
//	
//	@GetMapping("/ledgerBook/sellerBook")
//	public String lederBook(Model model, HttpSession session) {
//		String sellerId = (String) session.getAttribute("SID");
//		
//		List<Order> orderList = ledgerBookService.orderList();
//		
//			
//		model.addAttribute("title", "판매자 장부");
//		model.addAttribute("orderList", orderList);
//		
//		return "admin/ledgerBook/sellerBook";
//	}
	
	@GetMapping("/ledgerBook/salesStatistics")
	public String salesStatistics(Model model) {
		
		model.addAttribute("title", "연령/지역별 통계");
		
		return "admin/ledgerBook/salesStatistics";
	}
	
	@GetMapping("/ledgerBook/ageAreaStatistics")
	public String ageAreaStatistics(Model model) {
		
		model.addAttribute("title", "연령/지역별 통계");
		
		return "admin/ledgerBook/ageAreaStatistics";
	}
	
}
