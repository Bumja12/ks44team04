package ks44team04.user.controller;

import java.util.List;

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

import ks44team04.dto.CustomerAsk;
import ks44team04.service.CustomerAskService;
import ks44team04.service.RegularAskService;

@Controller
@RequestMapping(value = "/user/customerAsk")
public class UserCustomerAskContorller {

	private static final Logger log = LoggerFactory.getLogger(UserCustomerAskContorller.class);

	// 고객 문의 서비스 의존성 주입
	private final CustomerAskService customerAskService;

	// 생성자 메소드
	public UserCustomerAskContorller(CustomerAskService customerAskService) {
		this.customerAskService = customerAskService;
	}
	
	// 구매자 고객 문의 내역 화면 
	@ResponseBody
	@PostMapping("/customerAskDetail")
	public String ajaxCustomerAskPKDetail (@RequestParam(value="customerAskPK") String customerAskPK) {
		log.info(customerAskPK);
		
		return "customerAskDetail/" + customerAskPK;
	}
	
	// 구매자 고객 문의 내역 화면
	@GetMapping("/customerAskDetail/{customerAskPK}")
	public String getRegularAskDetail (@PathVariable(value = "customerAskPK") String customerAskPK
									   ,Model model) {
		
		model.addAttribute("title", "구매자 고객 문의 내역 화면");
		log.info(customerAskPK);
		return "user/customerAsk/user_customerAsk_detail";
	}
	
	// 구매자 고객 문의 등록 처리
	@PostMapping("/addCustomerAsk")
	public String addCustomerAskAction () {
		
		return "redirect:/user/customerAsk/customerAskList";
	}
	
	// 구매자 고객 문의 등록 화면
	@GetMapping("/addCustomerAsk")
	public String addCustomerAskForm (Model model) {
		
		model.addAttribute("title", "구매자 고객 문의 등록 화면");
		return "user/customerAsk/user_customerAsk_add";
	}
	
	// 구매자 고객 문의 목록 화면
	@GetMapping("/customerAskList")
	public String getCustomerAskList (Model model) {
		
		// 고객 문의 목록
		List<CustomerAsk> customerAskList = customerAskService.getCustomerAskList();
		
		log.info(customerAskList.toString());
		
		model.addAttribute("title", "구매자 고객 문의 목록 화면");
		model.addAttribute("customerAskList", customerAskList);
		return "user/customerAsk/user_customerAsk_list";
	}
	
}
