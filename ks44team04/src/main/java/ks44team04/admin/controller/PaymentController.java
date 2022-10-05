package ks44team04.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
	
	// 주문상세 모달창 출력
	@GetMapping("/selectPaymentDetail")
	@ResponseBody
	public List<PaymentTotal> selectPaymentDetail(@RequestParam(value = "orderNum") String orderNum, Model model) {
		
		System.out.println(orderNum);
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("sk", "o.order_num");
		searchMap.put("sv", orderNum);
		System.out.println(searchMap);
		List<PaymentTotal> paymentDetail = paymentService.searchPaymentDetail(searchMap);
		System.out.println(paymentDetail);
		return paymentDetail;
	}
	
	// 주문상세 검색
	@PostMapping("/paymentDetail")
	public String searchPaymentDetail(@RequestParam(name="searchKey", defaultValue = "orderDetailCode") String sk
										,@RequestParam(name="searchValue", required = false, defaultValue = "") String sv
										,@RequestParam(name="fromDate", required = false, defaultValue= "") String fromDate
										,@RequestParam(name="toDate", required = false, defaultValue= "") String toDate
										,Model model) {
		
		if(sk.equals("orderNum")) {
			sk = "o.order_num";
		}else if(sk.equals("orderDetailCode")) {
			sk = "od.order_detail_code";
		}else if(sk.equals("buyerId")) {
			sk = "o.buyer_id";
		}
		
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("sk", sk);
		searchMap.put("sv", sv);
		searchMap.put("fd", fromDate);
		searchMap.put("td", toDate);
		
		List<PaymentTotal> paymentDetail = paymentService.searchPaymentDetail(searchMap);
		model.addAttribute("title", "검색결과");
		model.addAttribute("paymentDetail", paymentDetail);
		
		return "admin/payment/paymentDetail";
	}
	
	// 결제내역 검색
	@PostMapping("/paymentList")
	public String searchPaymentList(@RequestParam(name="searchKey", defaultValue = "orderDetailCode") String sk
									,@RequestParam(name="searchValue", required = false, defaultValue = "") String sv
									,@RequestParam(name="fromDate", required = false, defaultValue= "") String fromDate
									,@RequestParam(name="toDate", required = false, defaultValue= "") String toDate
									,Model model) {
		
		if(sk.equals("orderNum")) {
			sk = "o.order_num";
		}else if(sk.equals("orderDetailCode")) {
			sk = "od.order_detail_code";
		}else if(sk.equals("buyerId")) {
			sk = "o.buyer_id";
		}
		
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("sk", sk);
		searchMap.put("sv", sv);
		searchMap.put("fd", fromDate);
		searchMap.put("td", toDate);
		
		List<PaymentTotal> paymentList = paymentService.searchPaymentList(searchMap);
		model.addAttribute("title", "검색결과");
		model.addAttribute("paymentList", paymentList);
		
		return "admin/payment/paymentList";
	}
	
	// 주문상세번호 삭제
	@PostMapping("/removePaymentDetail")
	public String removePaymentDetail(String orderDetailCode, RedirectAttributes reAttr) {

		System.out.println(orderDetailCode);
		if (orderDetailCode != null) {

			int removeDetailCode = paymentService.removeDetailCode(orderDetailCode);

			if (removeDetailCode > 0) {
				return "redirect:/admin/payment/paymentDetail";
			} else {

				reAttr.addAttribute("msg", "삭제실패");

				return "redirect:/admin/payment/remove/" + orderDetailCode;
			}

		} else {

			reAttr.addAttribute("msg", "삭제실패");
			return "redirect:/admin/payment/remove/" + orderDetailCode;

		}
	}
	
	// 주문상세번호 조회
	@GetMapping("/paymentDetailRemoveCheck")
	@ResponseBody
	public boolean removeCheck(@RequestParam(value = "orderDetailCode") String orderDetailCode) {

		System.out.println(orderDetailCode);
		if (orderDetailCode != null) {

			boolean detailCodeCheck = paymentService.detailCodeCheck(orderDetailCode);
			if (detailCodeCheck = true) {
				return detailCodeCheck;
			} else {
				return detailCodeCheck;
			}
		} else {
			return false;
		}
	}

	// 주문상세번호 삭제
	@GetMapping("/remove/{orderDetailCode}")
	public String removeMember(@PathVariable(value = "orderDetailCode") String orderDetailCode, Model model) {

		PaymentTotal paymentTotal = paymentService.getPaymentDetail(orderDetailCode);
		model.addAttribute("title", "주문상세삭제: " + orderDetailCode);
		model.addAttribute("paymentTotal", paymentTotal);

		return "admin/payment/removePaymentDetail";
	}

	// 특정주문상세번호 조회
	@GetMapping("/modifyPaymentDetail")
	public String ModifyPaymentDetail(@RequestParam(value = "orderDetailCode", required = false) String orderDetailCode,
			Model model) {

		PaymentTotal paymentTotal = paymentService.getPaymentDetail(orderDetailCode);

		model.addAttribute("title", "결제상세내역 수정");
		model.addAttribute("paymentTotal", paymentTotal);

		return "admin/payment/modifyPaymentDetail";

	}

	// 결제상세
	@GetMapping("/paymentDetail")
	public String paymentDetail(Model model) {
		List<PaymentTotal> paymentDetail = paymentService.paymentDetail();

		model.addAttribute("title", "결제상세내역");
		model.addAttribute("paymentDetail", paymentDetail);

		System.out.println(paymentDetail);

		return "admin/payment/paymentDetail";
	}

	// 결제내역
	@GetMapping("/paymentList")
	public String paymentList(Model model) {

		List<PaymentTotal> paymentList = paymentService.paymentList();

		model.addAttribute("title", "결제내역");
		model.addAttribute("paymentList", paymentList);

		System.out.println(paymentList);

		return "admin/payment/paymentList";
	}
}
