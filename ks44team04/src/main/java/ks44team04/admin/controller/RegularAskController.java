package ks44team04.admin.controller;

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

import ks44team04.dto.RegularAsk;
import ks44team04.dto.RegularAskCategory;
import ks44team04.service.CategoryManageService;
import ks44team04.service.RegularAskService;
import ks44team04.util.CodeIndex;

@Controller
@RequestMapping(value = "/admin/regularAsk")
public class RegularAskController {
	
	private static final Logger log = LoggerFactory.getLogger(RegularAskController.class);
	
	// 자주 묻는 질문 서비스 의존성 주입
	private final RegularAskService regularAskService;
	// 카테고리 관리 서비스 의존성 주입
	private final CategoryManageService categoryManageService;
	
	// 생성자 메소드
	public RegularAskController(RegularAskService regularAskService, CategoryManageService categoryManageService) {
		this.categoryManageService = categoryManageService;
		this.regularAskService = regularAskService;
	}
	
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
	public String modifyRegularAskAction(RegularAsk regularAsk) {
		
		System.out.println(regularAsk.toString());
		regularAskService.modifyRegularAsk(regularAsk);
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
		
		// 특정 자주 묻는 질문 
		RegularAsk regularAsk = regularAskService.getRegularAskByPK(regularAskPK);
		
		// 자주 묻는 질문 카테고리 목록
		List<RegularAskCategory> regularAskCategoryList = categoryManageService.getRegularAskCategoryList();
		
		model.addAttribute("title", "관리자 자주 묻는 질문 내역 화면");
		model.addAttribute("regularAsk", regularAsk);
		model.addAttribute("regularAskCategoryList", regularAskCategoryList);
		// log.info(regularAskCategoryList.toString());
		// log.info(regularAskPK);

		
		return "admin/regularAsk/admin_regularAsk_detail";
	}
	
	// 관리자 자주 묻는 질문 등록 처리
	@PostMapping("/addRegularAsk")
	public String addRegularAskAction(RegularAsk regularAsk) {
		
		// System.out.println(regularAsk.toString());
		
		// 마지막 인덱스에 저장되어 있는 자주 묻는 질문의 PK값 조회
		String lastIndexOfRegularAskPK = regularAskService.getLastIndexOfRegularAskPK();
		String newRegularAskPK = CodeIndex.codeIndex(lastIndexOfRegularAskPK, 10);
		regularAsk.setRegularAskPK(newRegularAskPK);
		regularAskService.addRegularAsk(regularAsk);
		// System.out.println(newRegularAskPK);
		
		return "redirect:/admin/regularAsk/regularAskList";
		
	}
	
	// 관리자 자주 묻는 질문 등록 화면
	@GetMapping("/addRegularAsk")
	public String addRegularAskForm (Model model) {
		
		// 자주 묻는 질문 카테고리 목록
		List<RegularAskCategory> regularAskCategoryList = categoryManageService.getRegularAskCategoryList();
		
		model.addAttribute("title", "관리자 자주 묻는 질문 등록 화면");
		model.addAttribute("regularAskCategoryList", regularAskCategoryList);
		return "admin/regularAsk/admin_regularAsk_add";
	}
	
	// 관리자 자주 묻는 질문 목록 화면
	@GetMapping("/regularAskList")
	public String getRegularAskList (Model model) {
		
		// 자주 묻는 질문 목록
		List<RegularAsk> regularAskList =  regularAskService.getRegularAskList();
		model.addAttribute("title", "관리자 자주 묻는 질문 목록 화면");
		model.addAttribute("regularAskList", regularAskList);
//		System.out.println(regularAskList.get(1));
		return "admin/regularAsk/admin_regularAsk_list";
	}
	
	
}
