package ks44team04.admin.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class CouponController {
	
	
	private static final Logger log = LoggerFactory.getLogger(CouponController.class);
	
	@PostConstruct
	public void couponControllerInit() {
		
		log.info("couponController Bean 생성");
	}
	
	
	@GetMapping("/couponList")
	public String CouponList(Model model) {
		
		model.addAttribute("title", "쿠폰목록");
		
		return "/admin/couponList";
	}
	
}
