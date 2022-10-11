package ks44team04.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import ks44team04.dto.PaymentTotal;
import ks44team04.dto.User;
import ks44team04.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

	//쿠폰보유 검색
	@PostMapping("/couponStatus")
	public String searchCouponStatus(@RequestParam(name="searchKey", defaultValue = "couponName") String sk
			,@RequestParam(name="searchValue", required = false, defaultValue = "") String sv
			,@RequestParam(name="fromDate", required = false, defaultValue= "") String fromDate
			,@RequestParam(name="toDate", required = false, defaultValue= "") String toDate
			,Model model) {

		if(sk.equals("buyerId")) {
			sk = "buyer_id";
		}else if(sk.equals("couponCode")) {
			sk = "coupon_code";
		}else if(sk.equals("couponName")) {
			sk = "coupon_name";
		}

		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("sk", sk);
		searchMap.put("sv", sv);
		searchMap.put("fd", fromDate);
		searchMap.put("td", toDate);

		List<Coupon> couponStatus = couponService.searchCouponStatus(searchMap);
		model.addAttribute("title", "검색결과");
		model.addAttribute("couponStatus", couponStatus);

		return "admin/coupon/couponStatus";
	}

	//쿠폰목록검색
	@PostMapping("/couponList")
	public String searchCouponList(@RequestParam(name="searchKey", defaultValue = "couponName") String sk
			,@RequestParam(name="searchValue", required = false, defaultValue = "") String sv
			,@RequestParam(name="fromDate", required = false, defaultValue= "") String fromDate
			,@RequestParam(name="toDate", required = false, defaultValue= "") String toDate
			,Model model) {

		if(sk.equals("couponCode")) {
			sk = "coupon_code";
		}else if(sk.equals("couponName")) {
			sk = "coupon_name";
		}else if(sk.equals("discountPrice")) {
			sk = "discount_price";
		}

		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("sk", sk);
		searchMap.put("sv", sv);
		searchMap.put("fd", fromDate);
		searchMap.put("td", toDate);

		List<Coupon> couponList = couponService.searchCouponList(searchMap);
		model.addAttribute("title", "검색결과");
		model.addAttribute("couponList", couponList);

		return "admin/coupon/couponList";
	}

	//쿠폰발급
	@PostMapping("/couponIssue")
	public String CouponIssue(@RequestParam List<String> userId) {

		System.out.println(userId);

		for (String couponId: userId){
			CouponStatus couponIssue = new CouponStatus();
			couponIssue.setBuyerId(couponId);

		}

		return "redirect:/admin/coupon/couponStatus";
	}

	//유저목록 불러오기
	@GetMapping("/userList")
	@ResponseBody
	public List<User> getUserList(@RequestParam(value = "getUserListCheck") boolean getUserListCheck) {

		if(getUserListCheck){
			List<User> userList = userService.getUserList();

			return userList;

		}else {

			return null;
		}
	}

	//쿠폰생성
	@PostMapping("/couponCreate")
	public String CouponCreate(Coupon coupon) {

		System.out.println(coupon);
		couponService.couponCreate(coupon);

		return "redirect:/admin/coupon/couponList";
	}

	//쿠폰보유현황
	@GetMapping("/couponStatus")
	public String CouponStatus(Model model) {
		
		List<CouponStatus> couponStatus = couponService.couponStatus();
		
		model.addAttribute("title", "쿠폰보유현황");
		model.addAttribute("couponStatus", couponStatus);
		System.out.println(couponStatus);
		
		return "admin/coupon/couponStatus";
	}
	
	//쿠폰목록
	@GetMapping("/couponList")
	public String CouponList(Model model) {
		
		List<Coupon> couponList = couponService.couponList();
		
		model.addAttribute("title", "쿠폰목록");
		model.addAttribute("couponList", couponList);
		
		return "admin/coupon/couponList";
	}
	
}
