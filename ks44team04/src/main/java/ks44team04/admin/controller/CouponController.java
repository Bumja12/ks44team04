package ks44team04.admin.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import ks44team04.dto.User;
import ks44team04.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks44team04.service.CouponService;
import ks44team04.dto.Coupon;
import ks44team04.dto.CouponStatus;

@Controller
@RequestMapping("/admin/coupon")
public class CouponController {
	
	
	private static final Logger log = LoggerFactory.getLogger(CouponController.class);
	
	private final CouponService couponService;
	private final UserService userService;

	@PostConstruct
	public void couponControllerInit() {
		
		log.info("couponController Bean 생성");
	}
	
	public CouponController(CouponService couponService, UserService userService) {
		this.couponService = couponService;
		this.userService = userService;
	}
	
	@PostMapping("/couponCreate")
	public String CouponCreate(Coupon coupon
								,RedirectAttributes reAttr) {

		System.out.println(coupon);
		couponService.couponCreate(coupon);

		return "redirect:/admin/coupon/couponList";
	}

	@GetMapping("/userList")
	public String getUserList(Model model) {
		List<User> userList = userService.getUserList();
		log.info("회원의 목록 ::: {}", userList);
		model.addAttribute("userList", userList);

		return "admin/user/userList";
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
