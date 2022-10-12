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

@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {

	private static final Logger log = LoggerFactory.getLogger(CategoryController.class);

	// 카테고리 검색 처리
	@PostMapping("/searchCategory")
	public String searchCategory() {

		return "redirect:/admin/category/categoryList";
	}

	// 카테고리 삭제 처리
	@PostMapping("/removeCategory")
	public String removeCategory() {

		// 카테고리 목록 화면으로 리다이렉트
		return "admin/category/category_remove";
	}

	// 카테고리 수정 화면
	@PostMapping("modifyCategory")
	public String modifyCategoryAction() {

		// 카테고리 내역 화면으로 리다이렉트
		return "redirect:/admin/category/categoryList";
	}

	// 카테고리 수정 화면
	@GetMapping("/modifyCategory")
	public String modifyCategoryForm(Model model) {

		model.addAttribute("title", "카테고리 수정 화면");
		return "admin/category/category_modify";
	}

	// 카테고리 등록 처리
	@PostMapping("/addCategory")
	public String addCategoryAction(Model model) {

		return "redirect:/admin/category/categoryList";
	}

	// 카테고리 등록 화면
	@GetMapping("/addCategory")
	public String addCategoryForm(Model model) {

		model.addAttribute("title", "카테고리 등록 화면");
		return "admin/category/category_add";
	}
	
	// --------------------------------------카테고리 목록  화면--------------------------------------
	
	// 구매자 등급 카테고리 목록 화면
	@GetMapping("/levelBuyer")
	public String getlevelBuyerCategoryList(Model model) {

		model.addAttribute("title", "구매자 등급 카테고리 목록 화면");
		return "admin/category/levelBuyer/levelBuyerCategory_list";
	}
	
	// 판매자 등급 카테고리 목록 화면
	@GetMapping("/levelSeller")
	public String getlevelSellerCategoryList(Model model) {
		
		model.addAttribute("title", "판매자 등급 카테고리 목록 화면");
		return "admin/category/levelSeller/levelSellerCategory_list";
	}
	
	// 고객 문의 카테고리 목록 화면
	@GetMapping("/customerAsk")
	public String getCustomerAskCategoryList(Model model) {
		
		model.addAttribute("title", "고객 문의 카테고리 목록 화면");
		return "admin/category/customerAsk/customerAskCategory_list";
	}
	
	// 자주 묻는 질문 카테고리 목록 화면
	@GetMapping("/regularAsk")
	public String getRegularAskCategoryList(Model model) {
		
		model.addAttribute("title", "자주 묻는 질문 카테고리 목록 화면");
		return "admin/category/regularAsk/regularAskCategory_list";
	}
	
	// 게시판 카테고리 목록 화면
	@GetMapping("/board")
	public String getBoardCategoryList(Model model) {
		
		model.addAttribute("title", "게시판 카테고리 목록 화면");
		return "admin/category/board/boardCategory_list";
	}
	
	// 신고 대상 카테고리 목록 화면
	@GetMapping("/report")
	public String getReportCategoryList(Model model) {
		
		model.addAttribute("title", "신고 대상 카테고리 목록 화면");
		return "admin/category/report/reportCategory_list";
	}
	
	// 판매 상품 카테고리 대분류 목록 화면
	@GetMapping("/goodsLarge")
	public String getGoodsLargeCategoryList(Model model) {
		
		model.addAttribute("title", "판매 상품 카테고리 대분류 목록 화면");
		return "admin/category/goodsLarge/goodsLargeCategory_list";
	}
	
	// 판매 상품 카테고리 소분류 목록 화면
	@GetMapping("/goodsSmall")
	public String getGoodsSmallCategoryList(Model model) {
		
		model.addAttribute("title", "판매 상품 카테고리 소분류 목록 화면");
		return "admin/category/goodsSmall/goodsSmallCategory_list";
	}
	
	// 상품 문의 카테고리 목록 화면
	@GetMapping("/goodsQna")
	public String getGoodsQnaCategoryList(Model model) {
		
		model.addAttribute("title", "상품 문의 카테고리 목록 화면");
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
		
		model.addAttribute("title", "구매자 등급 카테고리 내역 화면");
		
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
		
		// 특정 자주 묻는 질문 
		// RegularAsk regularAsk = regularAskService.getRegularAskByPK(regularAskPK);
		
		// 자주 묻는 질문 카테고리 목록
		// List<RegularAskCategory> regularAskCategoryList = categoryManageService.getRegularAskCategoryList();
		
		model.addAttribute("title", "판매자 등급 카테고리 내역 화면");
		
		return "admin/category/levelSeller/levelSellerCategory_detail";
	}
	
	
	// 고객 문의 카테고리 내역 화면
	@GetMapping("/customerAskCategoryDetail/{askCategory}")
	public String getCustomerAskCategoryDetail (@PathVariable(value = "askCategory") String askCategory
			,Model model) {
		
		log.info(askCategory);
		model.addAttribute("title", "고객 문의 카테고리 내역 화면");
		
		return "admin/category/customerAsk/customerAskCategory_detail";
	}
	
	// 자주 묻는 질문 카테고리 내역 화면
	@GetMapping("/regularAskCategoryDetail/{regularAskCategory}")
	public String getRegularAskCategoryDetail (@PathVariable(value = "regularAskCategory") String regularAskCategory
			,Model model) {
		
		log.info(regularAskCategory);
		model.addAttribute("title", "자주 묻는 질문 카테고리 내역 화면");
		
		return "admin/category/regularAsk/regularAskCategory_detail";
	}	
	
	// 게시판 카테고리 내역 화면
	@GetMapping("/boardCategoryDetail/{boardCategory}")
	public String getBoardCategoryDetail (@PathVariable(value = "boardCategory") String boardCategory
			,Model model) {
		
		log.info(boardCategory);
		model.addAttribute("title", "게시판 카테고리 내역 화면");
		
		return "admin/category/board/boardCategory_detail";
	}	
	
	// 신고 카테고리 내역 화면
	@GetMapping("/reportCategoryDetail/{reportCategory}")
	public String getReportCategoryDetail (@PathVariable(value = "reportCategory") String reportCategory
			,Model model) {
		
		log.info(reportCategory);
		model.addAttribute("title", "신고 카테고리 내역 화면");
		
		return "admin/category/report/reportCategory_detail";
	}	
	
	// 판매 상품  카테고리 대분류 내역 화면
	@GetMapping("/goodsLargeCategoryDetail/{goodsLargeCategory}")
	public String getGoodsLargeCategoryDetail (@PathVariable(value = "goodsLargeCategory") String goodsLargeCategory
			,Model model) {
		
		log.info(goodsLargeCategory);
		model.addAttribute("title", "판매 상품  카테고리 대분류 내역 화면");
		
		return "admin/category/goodsLarge/goodsLargeCategory_detail";
	}	
	
	// 판매 상품  카테고리 소분류 내역 화면
	@GetMapping("/goodsSmallCategoryDetail/{goodsSmallCategory}")
	public String getGoodsSmallCategoryDetail (@PathVariable(value = "goodsSmallCategory") String goodsSmallCategory
			,Model model) {
		
		log.info(goodsSmallCategory);
		model.addAttribute("title", "판매 상품  카테고리 소분류 내역 화면");
		
		return "admin/category/goodsSmall/goodsSmallCategory_detail";
	}	
	
	// 상품 문의 카테고리 내역 화면
	@GetMapping("/goodsQnaCategoryDetail/{goodsQnaCategory}")
	public String getGoodsQnaCategoryDetail (@PathVariable(value = "goodsQnaCategory") String goodsQnaCategory
			,Model model) {
		
		log.info(goodsQnaCategory);
		model.addAttribute("title", "상품 문의 카테고리 내역 화면");
		
		return "admin/category/goodsQna/goodsQnaCategory_detail";
	}	
	
	// --------------------------------------카테고리 내역  화면--------------------------------------
	
	// --------------------------------------카테고리 수정 처리--------------------------------------
	
	// 구매자 등급 카테고리 수정 처리
	@PostMapping("modifylevelBuyerCategory")
	public String modifylevelBuyerCategoryAction() {

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
}
