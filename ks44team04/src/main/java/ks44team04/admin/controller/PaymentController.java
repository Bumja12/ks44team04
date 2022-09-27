package ks44team04.admin.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team04.service.PaymentService;
import ks44team04.dto.PaymentTotal;

@Controller
@RequestMapping("/admin/payment")
public class PaymentController {
	
	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);
	
	private final PaymentService paymentService;
	
	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@PostConstruct
	public void paymentControllerInit() {
		log.info("paymentController Bean 생성");
	}
	
	//특정결제상세번호 조회
	@GetMapping("/modifyPaymentDetail")
	public String ModifyPaymentDetail(@RequestParam(value="orderDetailCode", required = false) String orderDetailCode,
										Model model) {
		
		PaymentTotal paymentTotal = paymentService.getPaymentDetail(orderDetailCode);
		
		model.addAttribute("title", "결제상세내역 수정");
		model.addAttribute("paymentTotal", paymentTotal);
		
		return "admin/payment/modifyPaymentDetail";
		
	}
	
	//결제상세
	@GetMapping("/paymentDetail")
	public String paymentDetail(Model model) {
		List<PaymentTotal> paymentDetailList = paymentService.paymentDetailList();
		
		model.addAttribute("title", "결제상세내역");
		model.addAttribute("paymentDetailList", paymentDetailList);
		
		System.out.println(paymentDetailList);
		
		return "admin/payment/paymentDetail";
	}
	
	//결제내역
	@GetMapping("/paymentList")
	public String paymentList(Model model) {
		
		List<PaymentTotal> paymentList = paymentService.paymentList();
		
		model.addAttribute("title", "결제내역");
		model.addAttribute("paymentList", paymentList);

		System.out.println(paymentList);
		
		return "admin/payment/paymentList";
	}
}
