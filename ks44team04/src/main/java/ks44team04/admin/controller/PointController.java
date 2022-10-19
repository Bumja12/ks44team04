package ks44team04.admin.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import ks44team04.dto.CouponStatus;
import ks44team04.dto.PointDetail;
import ks44team04.dto.User;
import ks44team04.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.service.PointService;
import ks44team04.dto.PointDeal;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin/point")
public class PointController {

	private static final Logger log = LoggerFactory.getLogger(PointController.class);
	private final PointService pointService;
	private final UserService userService;

	@PostConstruct
	public void pointControllerInit() {
		log.info("PointController Bean 생성");
	}

	public PointController(PointService pointService, UserService userService) {

		this.pointService = pointService;
		this.userService = userService;
	}

	//관리자포인트지급
	@PostMapping("/pointSend")
	public String PointSend(@RequestParam String[] userId
							,@RequestParam String pointAmount
							,@RequestParam String adminId) {

		int pointDealPrice = Integer.parseInt(pointAmount);
		System.out.println(Arrays.toString(userId));
		System.out.println(pointDealPrice);
		System.out.println(adminId);
		for(String buyerId : userId){
			PointDeal pointDeal = new PointDeal();
			PointDetail pointDetail = new PointDetail();
			pointDeal.setUserId(buyerId);
			pointDeal.setPointDealReference(adminId);
			pointDeal.setPointDealPrice(pointDealPrice);
			pointDeal.setPointDealReason("관리자적립");
			pointDeal.setStatus("적립");
			String result = pointService.addPointDeal(pointDeal);

			pointDetail.setUserId(buyerId);
			pointDetail.setPointDealDetail(pointDealPrice);
			pointDetail.setPointDealId(result);
			pointService.addPointDetailPlus(pointDetail);
		}

		return "redirect:/admin/point/pointHistory";
	}

	//전체회원 포인트조회
	@GetMapping("/pointUserList")
	public String pointUserList(Model model) {

		List<User> userList = userService.getUserList();
		model.addAttribute("userList", userList);
		model.addAttribute("title", "포인트내역");

		return "admin/point/pointUserList";
	}

	//포인트내역
	@GetMapping("/pointHistory")
	public String paymentList(Model model) {

		List<PointDeal> pointHistory = pointService.pointHistory();

		model.addAttribute("title", "포인트내역");
		model.addAttribute("pointHistory", pointHistory);

		return "admin/point/pointHistory";
	}
}