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

import ks44team04.dto.BoardCategory;
import ks44team04.dto.CustomerAskCategory;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.GoodsQnaCategory;
import ks44team04.dto.GoodsSmallCategory;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.RegularAskCategory;
import ks44team04.dto.ReportCategory;
import ks44team04.service.CategoryService;
import ks44team04.util.CodeIndex;

@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {

	private static final Logger log = LoggerFactory.getLogger(CategoryController.class);

	// 카테고리 서비스 의존성 주입
	private final CategoryService categoryService;
	
	// 생성자 메소드
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	// --------------------------------------카테고리 목록  화면--------------------------------------
	
	// 구매자 등급 카테고리 목록 화면
	@GetMapping("/levelBuyer")
	public String getlevelBuyerCategoryList(Model model) {
		
		// 구매자 등급 카테고리 목록
		List<LevelBuyerCategory> levelBuyerCategoryList = categoryService.getLevelBuyerCategoryList();
		// System.out.println(levelBuyerCategoryList.toString());
		
		model.addAttribute("title", "구매자 등급 카테고리 목록 화면");
		model.addAttribute("levelBuyerCategoryList", levelBuyerCategoryList);
		return "admin/category/levelBuyer/levelBuyerCategory_list";
	}
	
	// 판매자 등급 카테고리 목록 화면
	@GetMapping("/levelSeller")
	public String getlevelSellerCategoryList(Model model) {
		
		// 판매자 등급 카테고리 목록
		List<LevelSellerCategory> levelSellerCategoryList = categoryService.getLevelSellerCategoryList();
		// System.out.println(levelSellerCategoryList.toString());
		
		model.addAttribute("title", "판매자 등급 카테고리 목록 화면");
		model.addAttribute("levelSellerCategoryList", levelSellerCategoryList);
		return "admin/category/levelSeller/levelSellerCategory_list";
	}
	
	// 고객 문의 카테고리 목록 화면
	@GetMapping("/customerAsk")
	public String getCustomerAskCategoryList(Model model) {
		
		// 고객 문의 카테고리 목록
		List<CustomerAskCategory> customerAskCategoryList = categoryService.getCustomerAskCategoryList();
		
		model.addAttribute("title", "고객 문의 카테고리 목록 화면");
		model.addAttribute("customerAskCategoryList", customerAskCategoryList);
		return "admin/category/customerAsk/customerAskCategory_list";
	}
	
	// 자주 묻는 질문 카테고리 목록 화면
	@GetMapping("/regularAsk")
	public String getRegularAskCategoryList(Model model) {
		
		// 자주 묻는 질문 카테고리 목록
		List<RegularAskCategory> regularAskCategoryList = categoryService.getRegularAskCategoryList();
		
		model.addAttribute("title", "자주 묻는 질문 카테고리 목록 화면");
		model.addAttribute("regularAskCategoryList", regularAskCategoryList);
		return "admin/category/regularAsk/regularAskCategory_list";
	}
	
	// 게시판 카테고리 목록 화면
	@GetMapping("/board")
	public String getBoardCategoryList(Model model) {
		
		// 게시판 카테고리 목록
		List<BoardCategory> boardCategoryList = categoryService.getBoardCategoryList();
		
		model.addAttribute("title", "게시판 카테고리 목록 화면");
		model.addAttribute("boardCategoryList", boardCategoryList);
		return "admin/category/board/boardCategory_list";
	}
	
	// 신고 대상 카테고리 목록 화면
	@GetMapping("/report")
	public String getReportCategoryList(Model model) {
		
		// 신고 대상 카테고리 목록
		List<ReportCategory> reportCategoryList = categoryService.getReportCategoryList();
		
		model.addAttribute("title", "신고 대상 카테고리 목록 화면");
		model.addAttribute("reportCategoryList", reportCategoryList);
		return "admin/category/report/reportCategory_list";
	}
	
	// 판매 상품 카테고리 대분류 목록 화면
	@GetMapping("/goodsLarge")
	public String getGoodsLargeCategoryList(Model model) {
		
		// 판매 상품 카테고리 대분류 목록
		List<GoodsLargeCategory> goodsLargeCategoryList = categoryService.getGoodsLargeCategoryList();
		
		model.addAttribute("title", "판매 상품 카테고리 대분류 목록 화면");
		model.addAttribute("goodsLargeCategoryList", goodsLargeCategoryList);
		return "admin/category/goodsLarge/goodsLargeCategory_list";
	}
	
	// 판매 상품 카테고리 소분류 목록 화면
	@GetMapping("/goodsSmall")
	public String getGoodsSmallCategoryList(Model model) {
		
		// 판매 상품 카테고리 소분류 목록
		List<GoodsSmallCategory> goodsSmallCategoryList = categoryService.getGoodsSmallCategoryList();
		
		// 판매 상품 카테고리 대분류 목록
		List<GoodsLargeCategory> goodsLargeCategoryList = categoryService.getGoodsLargeCategoryList();

		
		model.addAttribute("title", "판매 상품 카테고리 소분류 목록 화면");
		model.addAttribute("goodsSmallCategoryList", goodsSmallCategoryList);
		model.addAttribute("goodsLargeCategoryList", goodsLargeCategoryList);
		
		return "admin/category/goodsSmall/goodsSmallCategory_list";
	}
	
	// 상품 문의 카테고리 목록 화면
	@GetMapping("/goodsQna")
	public String getGoodsQnaCategoryList(Model model) {
		
		// 상품 문의 카테고리 목록
		List<GoodsQnaCategory> goodsQnaCategoryList = categoryService.getGoodsQnaCategoryList();
		
		model.addAttribute("title", "상품 문의 카테고리 목록 화면");
		model.addAttribute("goodsQnaCategoryList", goodsQnaCategoryList);
		return "admin/category/goodsQna/goodsQnaCategory_list";
	}
	
	
	// --------------------------------------카테고리 목록  화면--------------------------------------
	
	// --------------------------------------카테고리 내역  화면--------------------------------------
	
	// 구매자 등급 카테고리 내역 화면
	@ResponseBody
	@PostMapping("/levelBuyerCategoryDetail")
	public String ajaxlevelBuyerDetail (@RequestParam(value="levelCode") String levelCode) {
		
		log.info(levelCode);
		
		return "levelBuyerCategoryDetail/" + levelCode;
	}
	
	// 구매자 등급 카테고리 내역 화면
	@GetMapping("/levelBuyerCategoryDetail/{levelCode}")
	public String getLevelBuyerCategoryDetail (@PathVariable(value = "levelCode") String levelCode
									   ,Model model) {
		// 특정 구매자 등급 카테고리
		LevelBuyerCategory levelBuyerCategory = categoryService.getLevelBuyerCategoryByPK(levelCode);
		// 구매자 등급 카테고리 목록
		List<LevelBuyerCategory> levelBuyerCategoryList = categoryService.getLevelBuyerCategoryList();
		
		model.addAttribute("title", "구매자 등급 카테고리 내역 화면");
		model.addAttribute("levelBuyerCategory", levelBuyerCategory);
		model.addAttribute("levelBuyerCategoryList", levelBuyerCategoryList);
		return "admin/category/levelBuyer/levelBuyerCategory_detail";
	}
	
	// 판매자 등급 카테고리 내역 화면
	@ResponseBody
	@PostMapping("/levelSellerCategoryDetail")
	public String ajaxlevelSellerDetail (@RequestParam(value="levelCode") String levelCode) {
		
		log.info(levelCode);
		
		return "levelSellerCategoryDetail/" + levelCode;
	}
	
	// 판매자 등급 카테고리 내역 화면
	@GetMapping("/levelSellerCategoryDetail/{levelCode}")
	public String getLevelSellerCategoryDetail (@PathVariable(value = "levelCode") String levelCode
			,Model model) {
		
		// 특정 판매자 등급 카테고리
		LevelSellerCategory levelSellerCategory = categoryService.getLevelSellerCategoryByPK(levelCode);
		
		// 판매자 등급 카테고리 목록
		List<LevelSellerCategory> levelSellerCategoryList = categoryService.getLevelSellerCategoryList();

		model.addAttribute("title", "판매자 등급 카테고리 내역 화면");
		model.addAttribute("levelSellerCategory", levelSellerCategory);
		model.addAttribute("levelSellerCategoryList", levelSellerCategoryList);
		
		return "admin/category/levelSeller/levelSellerCategory_detail";
	}
	
	
	// 고객 문의 카테고리 내역 화면
	@GetMapping("/customerAskCategoryDetail/{askCategory}")
	public String getCustomerAskCategoryDetail (@PathVariable(value = "askCategory") String askCategory
			,Model model) {
		
		log.info(askCategory);
		
		// 특정 고객 문의 카테고리
		CustomerAskCategory customerAskCategory = categoryService.getCustomerAskCategoryByPK(askCategory);
		
		// 고객 문의 카테고리 목록
		List<CustomerAskCategory> customerAskCategoryList = categoryService.getCustomerAskCategoryList();
		
		model.addAttribute("customerAskCategory", customerAskCategory);
		model.addAttribute("customerAskCategoryList", customerAskCategoryList);
		model.addAttribute("title", "고객 문의 카테고리 내역 화면");
		
		return "admin/category/customerAsk/customerAskCategory_detail";
	}
	
	// 자주 묻는 질문 카테고리 내역 화면
	@GetMapping("/regularAskCategoryDetail/{regularAskCategory}")
	public String getRegularAskCategoryDetail (@PathVariable(value = "regularAskCategory") String regularAskCategory
			,Model model) {
		
		// 특정 자주 묻는 질문 카테고리
		RegularAskCategory regularAsk = categoryService.getRegularAskCategoryByPK(regularAskCategory);
		
		// 자주 묻는 질문 카테고리 목록
		List<RegularAskCategory> regularAskCategoryList = categoryService.getRegularAskCategoryList();
		
		model.addAttribute("title", "자주 묻는 질문 카테고리 내역 화면");
		model.addAttribute("regularAsk", regularAsk);
		model.addAttribute("regularAskCategoryList", regularAskCategoryList);
		
		return "admin/category/regularAsk/regularAskCategory_detail";
	}	
	
	// 게시판 카테고리 내역 화면
	@GetMapping("/boardCategoryDetail/{boardCategory}")
	public String getBoardCategoryDetail (@PathVariable(value = "boardCategory") String boardCategory
			,Model model) {
		
		// 특정 게시판 카테고리
		BoardCategory board = categoryService.getBoardCategoryByPK(boardCategory);
		
		// 게시판 카테고리 목록
		List<BoardCategory> boardCategoryList = categoryService.getBoardCategoryList();
		
		model.addAttribute("title", "게시판 카테고리 내역 화면");
		model.addAttribute("board", board);
		model.addAttribute("boardCategoryList", boardCategoryList);
		
		return "admin/category/board/boardCategory_detail";
	}	
	
	// 신고 카테고리 내역 화면
	@GetMapping("/reportCategoryDetail/{reportCategory}")
	public String getReportCategoryDetail (@PathVariable(value = "reportCategory") String reportCategory
			,Model model) {
		
		// 특정 신고 대상 카테고리
		ReportCategory report = categoryService.getReportCategoryByPK(reportCategory);
		
		// 신고 대상 카테고리 목록
		List<ReportCategory> reportCategoryList = categoryService.getReportCategoryList();
		
		model.addAttribute("title", "신고 카테고리 내역 화면");
		model.addAttribute("report", report);
		model.addAttribute("reportCategoryList", reportCategoryList);
		
		return "admin/category/report/reportCategory_detail";
	}	
	
	// 판매 상품  카테고리 대분류 내역 화면
	@GetMapping("/goodsLargeCategoryDetail/{goodsLargeCategory}")
	public String getGoodsLargeCategoryDetail (@PathVariable(value = "goodsLargeCategory") String goodsLargeCategory
			,Model model) {
		
		// 특정 판매 상품 카테고리 대분류
		GoodsLargeCategory goodsLarge = categoryService.getGoodsLargeCategoryByPK(goodsLargeCategory);
		
		// 판매 상품 카테고리 대분류 목록
		List<GoodsLargeCategory> goodsLargeCategoryList = categoryService.getGoodsLargeCategoryList();
		
		model.addAttribute("title", "판매 상품  카테고리 대분류 내역 화면");
		model.addAttribute("goodsLarge", goodsLarge);
		model.addAttribute("goodsLargeCategoryList", goodsLargeCategoryList);
		
		return "admin/category/goodsLarge/goodsLargeCategory_detail";
	}	
	
	// 판매 상품  카테고리 소분류 내역 화면
	@GetMapping("/goodsSmallCategoryDetail/{goodsSmallCategory}")
	public String getGoodsSmallCategoryDetail (@PathVariable(value = "goodsSmallCategory") String goodsSmallCategory
			,Model model) {
		
		// 특정 판매 상품 카테고리 소분류
		GoodsSmallCategory goodsSmall = categoryService.getGoodsSmallCategoryByPK(goodsSmallCategory);
		
		// 판매 상품 카테고리 대분류 목록
		List<GoodsLargeCategory> goodsLargeCategoryList = categoryService.getGoodsLargeCategoryList();
		
		model.addAttribute("title", "판매 상품  카테고리 소분류 내역 화면");
		model.addAttribute("goodsSmall", goodsSmall);
		model.addAttribute("goodsLargeCategoryList", goodsLargeCategoryList);
		
		return "admin/category/goodsSmall/goodsSmallCategory_detail";
	}	
	
	// 상품 문의 카테고리 내역 화면
	@GetMapping("/goodsQnaCategoryDetail/{goodsQnaCategory}")
	public String getGoodsQnaCategoryDetail (@PathVariable(value = "goodsQnaCategory") String goodsQnaCategory
			,Model model) {

		// 특정 상품 문의 카테고리 
		GoodsQnaCategory goodsQna = categoryService.getGoodsQnaCategoryByPK(goodsQnaCategory);

		// 상품 문의 카테고리 목록
		List<GoodsQnaCategory> goodsQnaCategoryList = categoryService.getGoodsQnaCategoryList();

		model.addAttribute("title", "상품 문의 카테고리 내역 화면");
		model.addAttribute("goodsQna", goodsQna);
		model.addAttribute("goodsQnaCategoryList", goodsQnaCategoryList);
		
		return "admin/category/goodsQna/goodsQnaCategory_detail";
	}	
	
	// --------------------------------------카테고리 내역  화면--------------------------------------
	
	// --------------------------------------카테고리 수정 처리--------------------------------------
	
	// 구매자 등급 카테고리 수정 처리
	@PostMapping("modifylevelBuyerCategory")
	public String modifylevelBuyerCategoryAction(LevelBuyerCategory levelBuyerCategory) {

		System.out.println(levelBuyerCategory.toString());
		
		categoryService.modifyLevelBuyerCategory(levelBuyerCategory);
		
		// 구매자 등급 카테고리 목록 화면으로 리다이렉트
		return "redirect:/admin/category/levelBuyer";
	}
	
	// 판매자 등급 카테고리 수정 처리
	@PostMapping("modifylevelSellerCategory")
	public String modifylevelSellerCategoryAction() {
		
		// 판매자 등급 카테고리 목록 화면으로 리다이렉트
		return "redirect:/admin/category/levelSeller";
	}
	
	// 고객 문의 카테고리 수정 처리
	@PostMapping("modifyCustomerAskCategory")
	public String modifyCustomerAskCategoryAction() {
		
		// 고객 문의 카테고리 목록 화면으로 리다이렉트
		return "redirect:/admin/category/customerAsk";
	}
	
	// 자주 묻는 질문 카테고리 수정 처리
	@PostMapping("modifyRegularAskCategory")
	public String modifyRegularAskCategoryAction() {
		
		// 자주 묻는 질문 카테고리 목록 화면으로 리다이렉트
		return "redirect:/admin/category/regularAsk";
	}
	
	// 게시판 카테고리 수정 처리
	@PostMapping("modifyBoardAskCategory")
	public String modifyBoardCategoryAction() {
		
		// 게시판 카테고리 목록 화면으로 리다이렉트
		return "redirect:/admin/category/board";
	}
	
	// 신고 카테고리 수정 처리
	@PostMapping("modifyReportCategory")
	public String modifyReportCategoryAction() {
		
		// 신고 카테고리 목록 화면으로 리다이렉트
		return "redirect:/admin/category/report";
	}
	
	// 판매 상품  카테고리 대분류 수정 처리
	@PostMapping("modifyGoodsLargeCategory")
	public String modifyGoodsLargeCategoryAction() {
		
		// 판매 상품  카테고리 대분류 목록 화면으로 리다이렉트
		return "redirect:/admin/category/goodsLarge";
	}
	
	// 판매 상품  카테고리 소분류 수정 처리
	@PostMapping("modifyGoodsSmallCategory")
	public String modifyGoodsSmallCategoryAction() {
		
		// 판매 상품  카테고리 소분류 목록 화면으로 리다이렉트
		return "redirect:/admin/category/goodsSmall";
	}
	
	// 상품 문의 카테고리 소분류 수정 처리
	@PostMapping("modifyGoodsQnaCategory")
	public String modifyGoodsQnaCategoryAction() {
		
		// 상품 문의 카테고리 목록 화면으로 리다이렉트
		return "redirect:/admin/category/goodsQna";
	}
	
	// --------------------------------------카테고리 수정 처리--------------------------------------
	
	// --------------------------------------카테고리 등록 처리--------------------------------------
	
	// 구매자 등급 카테고리 등록 화면
	@GetMapping("/addLevelBuyerCategory")
	public String addLevelBuyerCategoryForm(Model model) {

		model.addAttribute("title", "구매자 등급 카테고리 등록 화면");
		return "admin/category/levelBuyer/levelBuyerCategory_add";
	}
	
	// 구매자 등급 카테고리 등록 처리
	@PostMapping("/addLevelBuyerCategory")
	public String addLevelBuyerCategoryAction(LevelBuyerCategory levelBuyerCategory) {
		
		// 마지막 인덱스에 저장되어 있는 자주 묻는 질문의 PK값 조회
		String lastIndexOfLevelBuyerCategoryPK = categoryService.getLastIndexOfLevelBuyerCategoryPK();
		
		// 새로운 PK값
		String newLevelCode = CodeIndex.codeIndex(lastIndexOfLevelBuyerCategoryPK, 10);
		levelBuyerCategory.setLevelCode(newLevelCode);
		
		categoryService.addLevelBuyerCategory(levelBuyerCategory);
		
		return "redirect:/admin/category/levelBuyer";
	}
	
	// 판매자 등급 카테고리 등록 화면
	@GetMapping("/addLevelSellerCategory")
	public String addLevelSellerCategoryForm(Model model) {
		
		model.addAttribute("title", "판매자 등급 카테고리 등록 화면");
		return "admin/category/levelSeller/levelSellerCategory_add";
	}
	
	// 판매자 등급 카테고리 등록 처리
	@PostMapping("/addLevelSellerCategory")
	public String addLevelSellerCategoryAction(Model model) {
		
		return "redirect:/admin/category/levelSeller";
	}
	
	// 고객 문의 카테고리 등록 화면
	@GetMapping("/addCustomerAskCategory")
	public String addCustomerAskCategoryForm(Model model) {
		
		model.addAttribute("title", "고객 문의 카테고리 등록 화면");
		return "admin/category/customerAsk/customerAskCategory_add";
	}
	
	// 고객 문의 카테고리 등록 처리
	@PostMapping("/addCustomerAskCategory")
	public String addCustomerAskCategoryAction(Model model) {
		
		return "redirect:/admin/category/customerAsk";
	}
	
	// 자주 묻는 질문 카테고리 등록 화면
	@GetMapping("/addRegularAskCategory")
	public String addRegularAskCategoryForm(Model model) {
		
		model.addAttribute("title", "자주 묻는 질문 카테고리 등록 화면");
		return "admin/category/regularAsk/regularAskCategory_add";
	}
	
	// 자주 묻는 질문 카테고리 등록 처리
	@PostMapping("/addRegularAskCategory")
	public String addRegularAskCategoryAction(Model model) {
		
		return "redirect:/admin/category/regularAsk";
	}
	
	// 게시판 카테고리 등록 화면
	@GetMapping("/addBoardCategory")
	public String addBoardCategoryForm(Model model) {
		
		model.addAttribute("title", "게시판 카테고리 등록 화면");
		return "admin/category/board/boardCategory_add";
	}
	
	// 게시판 카테고리 등록 처리
	@PostMapping("/addBoardCategory")
	public String addBoardCategoryAction(Model model) {
		
		return "redirect:/admin/category/board";
	}
	
	// 신고 대상 카테고리 등록 화면
	@GetMapping("/addReportCategory")
	public String addReportCategoryForm(Model model) {
		
		model.addAttribute("title", "신고 대상 카테고리 등록 화면");
		return "admin/category/report/reportCategory_add";
	}
	
	// 신고 대상 카테고리 등록 처리
	@PostMapping("/addReportCategory")
	public String addReportCategoryAction(Model model) {
		
		return "redirect:/admin/category/report";
	}
	
	// 판매 상품 카테고리 대분류 등록 화면
	@GetMapping("/addGoodsLargeCategory")
	public String addGoodsLargeCategoryForm(Model model) {
		
		model.addAttribute("title", "판매 상품 카테고리 대분류 등록 화면");
		return "admin/category/goodsLarge/goodsLargeCategory_add";
	}
	
	// 판매 상품 카테고리 대분류 등록 처리
	@PostMapping("/addGoodsLargeCategory")
	public String addGoodsLargeCategoryAction(Model model) {
		
		return "redirect:/admin/category/goodsLarge";
	}
	
	// 판매 상품 카테고리 소분류 등록 화면
	@GetMapping("/addGoodsSmallCategory")
	public String addGoodsSmallCategoryForm(Model model) {
		
		model.addAttribute("title", "판매 상품 카테고리 소분류 등록 화면");
		return "admin/category/goodsSmall/goodsSmallCategory_add";
	}
	
	// 판매 상품 카테고리 소분류 등록 처리
	@PostMapping("/addGoodsSmallCategory")
	public String addGoodsSmallCategoryAction(Model model) {
		
		return "redirect:/admin/category/goodsSmall";
	}
	
	// 상품 문의 카테고리 등록 화면
	@GetMapping("/addGoodsQnaCategory")
	public String addGoodsQnaCategoryForm(Model model) {
		
		model.addAttribute("title", "상품 문의 카테고리 등록 화면");
		return "admin/category/goodsQna/goodsQnaCategory_add";
	}
	
	// 상품 문의 카테고리 등록 처리
	@PostMapping("/addGoodsQnaCategory")
	public String addGoodsQnaCategoryAction(Model model) {
		
		return "redirect:/admin/category/goodsQna";
	}
	
	// --------------------------------------카테고리 등록 처리--------------------------------------
	
	// --------------------------------------카테고리 삭제 처리--------------------------------------
	
	// 구매자 등급 카테고리 삭제 처리
	@ResponseBody
	@PostMapping("/removeLevelBuyerCategory")
	public String removeLevelBuyerCategoryAction(@RequestParam(value="removeElement[]") List<String> removeElement) {

		for(int i=0; i<removeElement.size(); i++) {
			categoryService.removeLevelBuyerCategory(removeElement.get(i));

		}
		// 구매자 등급 카테고리 목록 화면으로 리다이렉트
		return "/admin/category/removeLevelBuyerCategory";
	}
	
	// 구매자 등급 카테고리 삭제 완료 화면
	@GetMapping("/removeLevelBuyerCategory")
	public String removeLevelBuyerCategory(Model model) {
		
		model.addAttribute("title", "구매자 등급 카테고리 삭제 화면");  
		return "admin/category/levelBuyer/levelBuyerCategory_remove";
	}
	
	// 판매자 등급 카테고리 삭제 처리
	@ResponseBody
	@PostMapping("/removeLevelSellerCategory")
	public String removeLevelSellerCategoryAction(@RequestParam(value="removeElement[]") List<String> removeElement) {
		
		System.out.println(removeElement.size());
		
		// 판매자 등급 카테고리 목록 화면으로 리다이렉트
		return "/admin/category/removeLevelSellerCategory";
	}
	
	// 판매자 등급 카테고리 삭제 완료 화면
	@GetMapping("/removeLevelSellerCategory")
	public String removeLevelSellerCategory(Model model) {
		
		model.addAttribute("title", "판매자 등급 카테고리 삭제 화면");  
		return "admin/category/levelSeller/levelSellerCategory_remove";
	}
	
	// 고객 문의 카테고리 삭제 처리
	@ResponseBody
	@PostMapping("/removeCustomerAskCategory")
	public String removeCustomerAskCategoryAction(@RequestParam(value="removeElement[]") List<String> removeElement) {
		
		System.out.println(removeElement.size());
		
		// 고객 문의 카테고리 목록 화면으로 리다이렉트
		return "/admin/category/removeCustomerAskCategory";
	}
	
	// 고객 문의 카테고리 삭제 완료 화면
	@GetMapping("/removeCustomerAskCategory")
	public String removeCustomerAskCategory(Model model) {
		
		model.addAttribute("title", "고객 문의 카테고리 삭제 화면");  
		return "admin/category/customerAsk/customerAskCategory_remove";
	}
	
	// 자주 묻는 질문 카테고리 삭제 처리
	@ResponseBody
	@PostMapping("/removeRegularAskCategory")
	public String removeRegularAskCategoryAction(@RequestParam(value="removeElement[]") List<String> removeElement) {
		
		System.out.println(removeElement.size());
		
		// 자주 묻는 질문 카테고리 목록 화면으로 리다이렉트
		return "/admin/category/removeRegularAskCategory";
	}
	
	// 자주 묻는 질문 카테고리 삭제 완료 화면
	@GetMapping("/removeRegularAskCategory")
	public String removeRegularAskCategory(Model model) {
		
		model.addAttribute("title", "자주 묻는 질문 카테고리 삭제 화면");  
		return "admin/category/regularAsk/regularAskCategory_remove";
	}
	
	// 게시판 카테고리 삭제 처리
	@ResponseBody
	@PostMapping("/removeBoardCategory")
	public String removeBoardCategoryAction(@RequestParam(value="removeElement[]") List<String> removeElement) {
		
		System.out.println(removeElement.size());
		
		// 게시판 카테고리 목록 화면으로 리다이렉트
		return "/admin/category/removeBoardCategory";
	}
	
	// 게시판 카테고리 삭제 완료 화면
	@GetMapping("/removeBoardCategory")
	public String removeBoardCategory(Model model) {
		
		model.addAttribute("title", "게시판 카테고리 삭제 화면");  
		return "admin/category/board/boardCategory_remove";
	}
	
	// 신고 대상 카테고리 삭제 처리
	@ResponseBody
	@PostMapping("/removeReportCategory")
	public String removeReportCategoryAction(@RequestParam(value="removeElement[]") List<String> removeElement) {
		
		System.out.println(removeElement.size());
		
		// 신고 대상 카테고리 목록 화면으로 리다이렉트
		return "/admin/category/removeReportCategory";
	}
	
	// 신고 대상 카테고리 삭제 완료 화면
	@GetMapping("/removeReportCategory")
	public String removeReportCategory(Model model) {
		
		model.addAttribute("title", "신고 대상 카테고리 삭제 화면");  
		return "admin/category/report/reportCategory_remove";
	}
	
	// 판매 상품 카테고리 대분류 삭제 처리
	@ResponseBody
	@PostMapping("/removeGoodsLargeCategory")
	public String removeGoodsLargeCategoryAction(@RequestParam(value="removeElement[]") List<String> removeElement) {
		
		System.out.println(removeElement.size());
		
		// 판매 상품 카테고리 대분류 목록 화면으로 리다이렉트
		return "/admin/category/removeGoodsLargeCategory";
	}
	
	// 판매 상품 카테고리 대분류 삭제 완료 화면
	@GetMapping("/removeGoodsLargeCategory")
	public String removeGoodsLargeCategory(Model model) {
		
		model.addAttribute("title", "판매 상품 카테고리 대분류 삭제 화면");  
		return "admin/category/goodsLarge/goodsLargeCategory_remove";
	}
	
	// 판매 상품 카테고리 소분류 삭제 처리
	@ResponseBody
	@PostMapping("/removeGoodsSmallCategory")
	public String removeGoodsSmallCategoryAction(@RequestParam(value="removeElement[]") List<String> removeElement) {
		
		System.out.println(removeElement.size());
		
		// 판매 상품 카테고리 소분류 목록 화면으로 리다이렉트
		return "/admin/category/removeGoodsSmallCategory";
	}
	
	// 판매 상품 카테고리 소분류 삭제 완료 화면
	@GetMapping("/removeGoodsSmallCategory")
	public String removeGoodsSmallCategory(Model model) {
		
		model.addAttribute("title", "판매 상품 카테고리 소분류 삭제 화면");  
		return "admin/category/goodsSmall/goodsSmallCategory_remove";
	}
	
	// 상품 문의 카테고리 삭제 처리
	@ResponseBody
	@PostMapping("/removeGoodsQnaCategory")
	public String removeGoodsQnaCategoryAction(@RequestParam(value="removeElement[]") List<String> removeElement) {
		
		System.out.println(removeElement.size());
		
		// 상품 문의 카테고리 목록 화면으로 리다이렉트
		return "/admin/category/removeGoodsQnaCategory";
	}
	
	// 상품 문의 카테고리 삭제 완료 화면
	@GetMapping("/removeGoodsQnaCategory")
	public String removeGoodsQnaCategory(Model model) {
		
		model.addAttribute("title", "상품 문의 카테고리 삭제 화면");  
		return "admin/category/goodsQna/goodsQnaCategory_remove";
	}
	
	
	// --------------------------------------카테고리 삭제 처리--------------------------------------
	
	// --------------------------------------카테고리 검색 처리--------------------------------------
	
	// 구매자 등급 카테고리 검색 처리
	@PostMapping("/searchLevelBuyerCategory")
	public String searchLevelBuyerCategoryAction(@RequestParam(name="searchKey", defaultValue="levelName") String sK
			  									,@RequestParam(name="searchValue", required=false, defaultValue="") String sV
			  									,Model model) {
		
		// 검색 조각에서 입력한 키가 levelName라면 실제 쿼리문에서 사용할 컬럼명 rAskCate.category_name으로 바꾼다.
		if("levelName".equals(sK)) {
			sK = "level_name";
		// 제목 검색
		// 검색 조각에서 입력한 키가 useCheck라면 실제 쿼리문에서 사용할 컬럼명 regular_ask_title으로 바꾼다.
		}else if("useCheck".equals(sK)) {
			sK = "use_check";
		// 내용 검색
		// 검색 조각에서 입력한 키가 buyerPriceTerms라면 실제 쿼리문에서 사용할 컬럼명 regular_ask_content으로 바꾼다.
		}else if("buyerPriceTerms".equals(sK)) {
			sK = "buyer_price_terms";
		// 사용 여부 검색
		// 검색 조각에서 입력한 키가 saveRate라면 실제 쿼리문에서 사용할 컬럼명 rAsk.use_check으로 바꾼다.
		}else { 
			sK = "save_rate";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sV", sV);
		paramMap.put("sK", sK);
		
    	// 구매자 등급 카테고리 검색 결과
    	List<LevelBuyerCategory> searchResult = categoryService.searchLevelBuyerCategory(paramMap);
    	
		// 검색 결과를 모델에 담아 뷰로 넘겨준다.
		model.addAttribute(searchResult);  
		
		return "admin/category/levelBuyer/levelBuyerCategory_list";
	}
	
	// 판매자 등급 카테고리 검색 처리
	@PostMapping("/searchLevelSellerCategory")
	public String searchLevelSellerCategoryAction() {
		
		return "redirect:/admin/category/levelSeller";
	}
	
	// 고객 문의 카테고리 검색 처리
	@PostMapping("/searchCustomerAskCategory")
	public String searchLCustomerAskCategoryAction() {
		
		return "redirect:/admin/category/customerAsk";
	}
	
	// 자주 묻는 질문 카테고리 검색 처리
	@PostMapping("/searchRegularAskCategory")
	public String searchLRegularAskCategoryAction() {
		
		return "redirect:/admin/category/regularAsk";
	}
	
	// 게시판 카테고리 검색 처리
	@PostMapping("/searchBoardCategory")
	public String searchLBoardCategoryAction() {
		
		return "redirect:/admin/category/board";
	}
	
	// 신고 대상 카테고리 검색 처리
	@PostMapping("/searchReportCategory")
	public String searchLReportCategoryAction() {
		
		return "redirect:/admin/category/report";
	}
	
	// 판매 상품 카테고리 대분류 검색 처리
	@PostMapping("/searchGoodsLargeCategory")
	public String searchLGoodsLargeCategoryAction() {
		
		return "redirect:/admin/category/goodsLarge";
	}
	
	// 판매 상품 카테고리 소분류 검색 처리
	@PostMapping("/searchGoodsSmallCategory")
	public String searchLGoodsSmallCategoryAction() {
		
		return "redirect:/admin/category/goodsSmall";
	}
	
	// 상품 문의 카테고리 검색 처리
	@PostMapping("/searchGoodsQnaCategory")
	public String searchLGoodsQnaCategoryAction() {
		
		return "redirect:/admin/category/goodsQna";
	}
	
	// --------------------------------------카테고리 검색 처리--------------------------------------
	
}
