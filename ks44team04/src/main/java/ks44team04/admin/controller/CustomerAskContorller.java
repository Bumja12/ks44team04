package ks44team04.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/admin/customerAsk")
public class CustomerAskContorller {

	private static final Logger log = LoggerFactory.getLogger(CustomerAskContorller.class);

	// 문의 답변 삭제 처리
	@PostMapping("/removeAskAnswer")
	public String removeAskAnswer () {
		
		// 관리자 고개 문의 삭제 화면으로 이동
		return "admin/customerAsk/admin_askAnswer_remove";
	}
	
	// 관리자 문의 답변 수정 처리 
	@PostMapping("/modifyAskAnswer")
	public String modifyAskAnswerAction() {
		
		// 수정 처리 후 관리자 고객 문의 내역 화면으로 리다이렉트
		return "redirect:/admin/customerAsk/customerAskDetail";
	}
	
	// 관리자 고객 문의 수정 처리 
	@PostMapping("/modifyCustomerAsk")
	public String modifyCustomerAskAction() {
		
		// 수정 처리 후 관리자 고객 문의 내역 화면으로 리다이렉트
		return "redirect:/admin/customerAsk/customerAskDetail/" +"customerAsk001";
	}
	
	// 고객 문의 삭제 처리
	@PostMapping("/removeCustomerAsk")
	public String removeCustomerAsk () {
		
		// 관리자 고개 문의 삭제 화면으로 이동
		return "admin/customerAsk/admin_customerAsk_remove";
	}
	
	// 관리자 고객 문의 검색 처리
	@PostMapping("/searchCustomerAsk")
	public String searchCustomerAsk() {
		
		// 수정 처리 후 관리자 고객 문의 목록 화면으로 리다이렉트
		return "redirect:/admin/customerAsk/customerAskList";
	} 
	
	// 관리자 고객 문의 내역 화면
	@GetMapping("/customerAskDetail/{customerAskPK}")
	public String getCustomerAskDetail (@PathVariable (value="customerAskPK") String customerAskPK
									    ,Model model) {
		log.info(customerAskPK);
		model.addAttribute("title", "관리자 고객 문의 내역 화면");
		return "admin/customerAsk/admin_customerAsk_detail";
	}
	
	// 관리자 고객 문의 답변 목록 화면
	@GetMapping("/askAnswerList")
	public String getAskAnswerList (Model model) {
		
		model.addAttribute("title", "관리자 고객 문의 답변 목록 화면");
		return "admin/customerAsk/admin_askAnswer_list";
	}
	
	// 관리자 고객 문의 목록 화면
	@GetMapping("/customerAskList")
	public String getCustomerAskList (Model model) {
		
		model.addAttribute("title", "관리자 고객 문의 목록 화면");
		return "admin/customerAsk/admin_customerAsk_list";
	}
	
}
