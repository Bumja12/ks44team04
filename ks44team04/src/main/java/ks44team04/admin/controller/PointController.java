package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class PointController {

	@GetMapping("/pointHistory")
	public String paymentList(Model model) {

		model.addAttribute("title", "포인트내역");

		return "admin/pointHistory";
	}
}