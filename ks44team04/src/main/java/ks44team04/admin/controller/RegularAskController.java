package ks44team04.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	// 자주 묻는 질문 삭제 처리(비동기 방식 ajax 활용)
	@ResponseBody
	@PostMapping("/removeRegularAsk")
	public String ajaxRemoveRegularAskAction (@RequestParam(value="removeElement[]") List<String> removeElement) {
		// 1. 자주 묻는 질문 목록 화면에서 체크박스에 체크가 된 요소의 PK값을 배열에 담아 컨트롤러로 넘겨준다.
		// 2. 자주 묻는 질문 PK값(String)이 담긴 배열을 반복물을 통해서 각각의 PK값에 해당하는 행을 삭제한다.
		
		// System.out.println(removeElement.size());
		for(int i=0; i<removeElement.size(); i++) {
			regularAskService.removeRegularAsk(removeElement.get(i));
		}
			
		// 카테고리 삭제 화면으로 이동
		return "/admin/regularAsk/removeRegularAsk";
	}
	
	// 자주 묻는 질문 삭제 처리
	@GetMapping("/removeRegularAsk")
	public String removeRegularAsk(Model model) {
		
		model.addAttribute("title", "관리자 자주 묻는 질문 삭제 화면");  
		return "admin/regularAsk/admin_regularAsk_remove";
	}
	
	
	// 자주 묻는 질문 검색 처리
	@PostMapping("/searchRegularAsk") // 검색 조각에서 입력한 키와 값을 넘겨 받는다. 예)categoryName = "배송"
	public String searchRegularAsk(@RequestParam(name="searchKey", defaultValue="categoryName") String sK
								  ,@RequestParam(name="searchValue", required=false, defaultValue="") String sV
								  ,Model model) {
		// log.info("sk -> {}", sK);
		// log.info("sv -> {}", sV);
		
		// 카테고리 검색
		// 검색 조각에서 입력한 키가 categoryName라면 실제 쿼리문에서 사용할 컬럼명 rAskCate.category_name으로 바꾼다.
		if("categoryName".equals(sK)) {
			sK = "rAskCate.category_name";
		// 제목 검색
		// 검색 조각에서 입력한 키가 regularAskTitle라면 실제 쿼리문에서 사용할 컬럼명 regular_ask_title으로 바꾼다.
		}else if("regularAskTitle".equals(sK)) {
			sK = "rAsk.regular_ask_title";
		// 내용 검색
		// 검색 조각에서 입력한 키가 regularAskContent라면 실제 쿼리문에서 사용할 컬럼명 regular_ask_content으로 바꾼다.
		}else if("regularAskContent".equals(sK)) {
			sK = "regular_ask_content";
		// 사용 여부 검색
		// 검색 조각에서 입력한 키가 useCheck라면 실제 쿼리문에서 사용할 컬럼명 rAsk.use_check으로 바꾼다.
		}else { 
			sK = "rAsk.use_check";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sK", sK);
		paramMap.put("sV", sV);
		
		// System.out.println(paramMap.toString());
		List<RegularAsk> searchResult = regularAskService.searchRegularAsk(paramMap);
		model.addAttribute("title", "관리자 자주 묻는 질문 목록 화면");
		// 검색 결과를 모델에 담아 뷰로 넘겨준다.
		model.addAttribute(searchResult);  
		
		// System.out.println(regularAsk.toString());
		
		// 수정 처리 후 관리자 자주 묻는 질문 목록 화면으로 리다이렉트
		return "admin/regularAsk/admin_regularAsk_list";
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
	
	// 관리자 자주 묻는 질문 내역 화면
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
		
		System.out.println(model.toString());
		return "admin/regularAsk/admin_regularAsk_list";
	}
	
	
}
