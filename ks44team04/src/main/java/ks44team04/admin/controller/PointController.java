package ks44team04.admin.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.service.PointService;
import ks44team04.dto.PointDeal;

@Controller
@RequestMapping("/admin/point")
public class PointController {
	
	
	private static final Logger log = LoggerFactory.getLogger(PointController.class);
	private final PointService pointService;
	
	@PostConstruct
	public void pointControllerInit() {
		log.info("PointController Bean 생성");
	}
	
	public PointController(PointService pointService) {
		
		this.pointService = pointService;
	}
	
	@GetMapping("/pointHistory")
	public String paymentList(Model model) {
		
		List<PointDeal> pointHistory = pointService.pointHistory();
		
		model.addAttribute("title", "포인트내역");
		model.addAttribute("pointHistory", pointHistory);
		
		return "admin/point/pointHistory";
	}
}