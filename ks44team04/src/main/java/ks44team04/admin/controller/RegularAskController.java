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
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/admin/regularAsk")
public class RegularAskController {
	
	private static final Logger log = LoggerFactory.getLogger(RegularAskController.class);

	// 자주 묻는 질문 삭제 처리
	@PostMapping("/removeRegularAsk")
	public String removeRegularAsk () {
		
		// 카테고리 삭제 화면으로 이동
		return "admin/regularAsk/admin_regularAsk_remove";
	}
	
	// 자주 묻는 질문 검색 처리
	@PostMapping("/searchRegularAsk")
	public String searchRegularAsk() {
		
		// 수정 처리 후 관리자 자주 묻는 질문 목록 화면으로 리다이렉트
		return "redirect:/admin/regularAsk/regularAskList";
	} 
	
	// 관리자 자주 묻는 질문 수정 처리 
	@PostMapping("/modifyRegularAsk")
	public String modifyRegularAskAction() {
		
		log.info("modifyRegularAskAction");
		// 수정 처리 후 관리자 자주 묻는 질문 목록 화면으로 리다이렉트
		return "redirect:/admin/regularAsk/regularAskList";
	}
	
	// 에이젝스 
	@ResponseBody
	@PostMapping("/regularAskDetail")
	public String ajaxRegularAskDetail (@RequestParam(value="regularAskPK") String regularAskPK
										,Model model) {
		log.info(regularAskPK);
		
		model.addAttribute("title", "관리자 자주 묻는 질문 내역 화면");
		return "regularAskDetail/" + regularAskPK;
	}
	
	// 관리자 자주 묻는 질문 내역 화면
	@GetMapping("/regularAskDetail/{regularAskPK}")
	public String getRegularAskDetail (@PathVariable(value = "regularAskPK") String regularAskPK
									   ,Model model) {
		
		model.addAttribute("title", "관리자 자주 묻는 질문 내역 화면");
		log.info(regularAskPK);
		return "admin/regularAsk/admin_regularAsk_detail";
	}
	
	// 관리자 자주 묻는 질문 등록 화면
	@GetMapping("/addRegularAsk")
	public String addRegularAskForm (Model model) {
		
		model.addAttribute("title", "관리자 자주 묻는 질문 등록 화면");
		return "admin/regularAsk/admin_regularAsk_add";
	}
	
	// 관리자 자주 묻는 질문 목록 화면
	@GetMapping("/regularAskList")
	public String getRegularAskList (Model model) {
		
		model.addAttribute("title", "관리자 자주 묻는 질문 목록 화면");
		return "admin/regularAsk/admin_regularAsk_list";
	}
	
	
}
