package ks44team04.admin.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.service.CouponService;
import ks44team04.dto.Coupon;
import ks44team04.dto.CouponStatus;

@Controller
@RequestMapping("/admin/coupon")
public class CouponController {
	
	
	private static final Logger log = LoggerFactory.getLogger(CouponController.class);
	
	private final CouponService couponService;
	
	@PostConstruct
	public void couponControllerInit() {
		
		log.info("couponController Bean 생성");
	}
	
	public CouponController(CouponService couponService) {
		this.couponService = couponService;
	}
	
	//쿠폰보유현황
	@GetMapping("/couponStatus")
	public String CouponStatus(Model model) {
		
		List<CouponStatus> couponStatus = couponService.couponStatus();
		
		model.addAttribute("title", "쿠폰보유현황");
		model.addAttribute("couponStatus", couponStatus);
		System.out.println(couponStatus);
		
		return "/admin/coupon/couponStatus";
	}
	
	//쿠폰목록
	@GetMapping("/couponList")
	public String CouponList(Model model) {
		
		List<Coupon> couponList = couponService.couponList();
		
		model.addAttribute("title", "쿠폰목록");
		model.addAttribute("couponList", couponList);
		
		return "/admin/coupon/couponList";
	}
	
}
