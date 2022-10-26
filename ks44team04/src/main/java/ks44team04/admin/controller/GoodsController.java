package ks44team04.admin.controller;

import ks44team04.dto.FileDto;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.GoodsQna;
import ks44team04.dto.GoodsQnaAnswer;
import ks44team04.service.FileService;
import ks44team04.service.GoodsService;
import ks44team04.util.CodeIndex;
import ks44team04.util.FileUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin/goods")
public class GoodsController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	//의존성 주입
	private final GoodsService goodsService;
	private final FileService fileService;
	private final FileUtil fileUtil;

	public GoodsController(GoodsService goodsService, FileService fileService, FileUtil fileUtil) {
		this.goodsService = goodsService;
		this.fileService = fileService;
		this.fileUtil = fileUtil;
	}
	
	//상품 목록 조회
	@GetMapping("/goodsList")
	public String getGoodsList(Model model) {
	
		List<Goods> goodsList = goodsService.getGoodsListSearch(null);
		log.info("등록된 상품 리스트 ::: {}", goodsList);
		
		List<GoodsLargeCategory> largeCategoryList = goodsService.goodsLargeCategoryList();
		log.info("카테고리 대분류 리스트 ::: {}", largeCategoryList);
		
		model.addAttribute("title", "상품 목록 조회");
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("largeCategoryList", largeCategoryList);
		
		return "/admin/goods/goodsList";
		}

	//상품 목록 검색
	@PostMapping("/goodsList")
	public String getGoodsListSearch(@RequestParam(name="searchKey", defaultValue = "goodsCode") String searchKey
									,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
									//,@RequestParam(name="searchKey2", defaultValue = "goodsSmallCategory") String searchKey2
									,@RequestParam(name="searchCate", required = false, defaultValue = "") String searchCate
									,@RequestParam(name="firstDate", required = false, defaultValue = "") String firstDate
									,@RequestParam(name="lastDate", required = false, defaultValue = "") String lastDate
									,Model model) {
		
		if("goodsCode".equals(searchKey)) {
		searchKey = "goods_code";
		}else if("goodsName".equals(searchKey)) {
		searchKey = "goods_name";
		}else if("userId".equals(searchKey)) {
		searchKey = "user_id";
		}

		//if("goodsSmallCategory".equals(searchKey2)) {
		// searchKey2 = "sc.goods_small_category";
		//}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchCate", searchCate);
		paramMap.put("firstDate", firstDate);
		paramMap.put("lastDate", lastDate);
		
		List<Goods> goodsList = goodsService.getGoodsListSearch(paramMap);
		List<GoodsLargeCategory> largeCategoryList = goodsService.goodsLargeCategoryList();
		
		model.addAttribute("title", "상품 목록 조회");
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("largeCategoryList", largeCategoryList);
		model.addAttribute("searchKey", searchKey);
		model.addAttribute("searchValue", searchValue);
		model.addAttribute("searchCate", searchCate);
		model.addAttribute("firstDate", firstDate);
		model.addAttribute("lastDate", lastDate);
		
		return "/admin/goods/goodsList";
	
	}
	//상품 수정을 위해 수정페이지에 정보 불러오기
	@GetMapping("/goodsModify")
	public String goodsModify(@RequestParam(name="goodsCode", required = false) String goodsCode,
							  Model model) {
		
		//특정상품의 정보
		Goods goodsInfo = goodsService.getGoodsInfoByCode(goodsCode);
		log.info("특정 상품의 정보 ::: {}", goodsInfo);
		
		//대분류 카테고리 리스트 가져오기
		List<GoodsLargeCategory> largeCategoryList = goodsService.goodsLargeCategoryList();
		
		model.addAttribute("title", "상품수정");
		model.addAttribute("goodsInfo", goodsInfo);
		model.addAttribute("largeCategoryList", largeCategoryList);
		
		return "/admin/goods/goodsModify";
	}
	
	//상품 수정 쿼리 실행
	@PostMapping("/goodsModify")
	public String goodsModify(Goods goods) {
		
		log.info("사용자가 상품 수정한 정보 ::: {}", goods);
		
		goodsService.goodsModify(goods);
		
		return "redirect:/admin/goods/goodsList";
	}
	
	//상품 등록
	@GetMapping("/goodsAdd")
	public String goodsAdd(Model model){
		
		//대분류 카테고리 리스트 가져오기
		List<GoodsLargeCategory> largeCategoryList = goodsService.goodsLargeCategoryList();
		
		model.addAttribute("title", "상품 등록");
		model.addAttribute("largeCategoryList", largeCategoryList);
	    
		return "admin/goods/goodsAdd";
	}

	//상품 등록 쿼리 실행
	@PostMapping("/goodsAdd")
	public String goodsAdd(@RequestParam MultipartFile[] uploadfile, HttpServletRequest request
						   ,Goods goods, Model model, HttpSession session){
		
		String userId = (String) session.getAttribute("SID");
		
		//대분류 카테고리 리스트 가져오기
		List<GoodsLargeCategory> largeCategoryList = goodsService.goodsLargeCategoryList();
		
		// ========================= goodsCode 생성 =========================
		String goodsNewCode = goodsService.getGoodsNewCode(userId);
		goodsNewCode = CodeIndex.codeIndex(goodsNewCode, 5);
		
		log.info("상품 증가 코드 :::{}" , goodsNewCode);
		goods.setGoodsCode(goodsNewCode);
		goods.setSellerId(userId);
		// =================================================================
		
		
		//이미지 업로드
		String serverName = request.getServerName();
		log.info("{} <<<< serverName", serverName);
		log.info("{} <<<< user 디렉토리", System.getProperty("user.dir"));
		String fileRealPath = "";
		boolean isLocalhost = true;
		
		if("localhost".equals(serverName)) {				
			fileRealPath = System.getProperty("user.dir") + "/src/main/resources/static/";
			//fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}else {
			//fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
			isLocalhost = false;
			fileRealPath = System.getProperty("user.dir") + "/resources/";
		}
		
		List<FileDto> fileList= fileUtil.parseFileInfo(uploadfile, fileRealPath , isLocalhost);
		if(fileList != null) {			
			String addfileGroupIdx = fileList.get(0).getFileGroupIdx();
			goods.setGoodsFile(addfileGroupIdx);
			goodsService.goodsAdd(goods, fileList);
			
		}
		//fileService.fileUpload(uploadfile, fileRealPath, isLocalhost);
		
		
		log.info("사용자가 등록한 상품 정보 ::: {}", goods);
		model.addAttribute("largeCategoryList", largeCategoryList);
		
		return "redirect:/admin/goods/goodsList";
	}
	
	//상품 삭제
	//@GetMapping("/goodsRemove")
	//public String goodsRemove(@RequestParam(value = "goodsCode") String goodsCode) {
		
	//	goodsService.goodsRemove(goodsCode);
	
	//	return "redirect:/admin/goods/goodsList";
	//}
	
	@PostMapping("/pwCheck")
	@ResponseBody
	public int pwCheck(@RequestParam(value = "userPw") String userPw) {
		
		//String userId = "admin01";
		String adminPw = goodsService.getAdminPw(userPw);
		log.info("관리자 비밀번호 ::: {}", adminPw);
		
		if(userPw.equals(adminPw)) {
		return 1;
		}
		return 0;
	}
	
	//상품문의 & 상품문의 답변
	@GetMapping("/goodsQna")
	public String getGoodsQna(Model model) {
		
		List<GoodsQna> goodsQna = goodsService.getGoodsQnaSearch(null);
		
		log.info("문의 정보 ::: {}", goodsQna);
		model.addAttribute("title", "문의목록");
		model.addAttribute("goodsQna", goodsQna);
	
		return "admin/goods/goodsQna";
	}
	
	//문의 목록 검색
	@PostMapping("/goodsQna")
	public String getGoodsQnaSearch( @RequestParam(name="searchKey", defaultValue="goodsCode") String searchKey
									,@RequestParam(name="searchValue", required=false, defaultValue="") String searchValue
									,@RequestParam(name="searchKey2", defaultValue="goodsCode") String searchKey2
									,@RequestParam(name="searchQnaStatus", required = false, defaultValue = "") String searchQnaStatus
									,@RequestParam(name="firstDate", required = false, defaultValue = "") String firstDate
									,@RequestParam(name="lastDate", required = false, defaultValue = "") String lastDate
									,Model model) {
		
		if("goodsCode".equals(searchKey)) {
			searchKey = "goods_code";
		}else if("goodsName".equals(searchKey)) {
			searchKey = "goods_name";
		}else if("categoryName".equals(searchKey)) {
			searchKey = "category_name";
		}else if("goodsQnaContent".equals(searchKey)) {
			searchKey = "goods_qna_content";
		}else if("userId".equals(searchKey)) {
			searchKey = "user_id";
		}
		
		if("qnaStatus".equals(searchKey2)) {
		searchKey2 = "qna_status";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchKey2", searchKey2);
		paramMap.put("searchQnaStatus", searchQnaStatus);
		paramMap.put("firstDate", firstDate);
		paramMap.put("lastDate", lastDate);
		
		List<GoodsQna> goodsQna = goodsService.getGoodsQnaSearch(paramMap);
		model.addAttribute("title", "문의 검색 결과");
		model.addAttribute("goodsQna", goodsQna);
		model.addAttribute("searchKey", searchKey);
		model.addAttribute("searchValue", searchValue);
		model.addAttribute("searchKey2", searchKey2);
		model.addAttribute("searchQnaStatus", searchQnaStatus);
		model.addAttribute("firstDate", firstDate);
		model.addAttribute("lastDate", lastDate);
		
		return "/admin/goods/goodsQna";
	}
	
	//문의 수정을 위해 수정페이지에 정보 불러오기
	@GetMapping("/qnaModify")
	public String qnaModify(@RequestParam(name="goodsQnaNum", required = false) int goodsQnaNum,
							  Model model) {
		
		//특정 문의의 정보
		GoodsQna qnaInfo = goodsService.qnaInfoByNum(goodsQnaNum);
		log.info("특정 상품의 정보 ::: {}", qnaInfo);
		
		model.addAttribute("title", "상품수정");
		model.addAttribute("qnaInfo", qnaInfo);
		
		return "/admin/goods/qnaModify";
	}
	
    //답변 등록 
	@GetMapping("/answerAdd")
	public String answerAdd(GoodsQnaAnswer goodsQnaAnswer){
		
		String sellerId = "seller01"; //임의
		
		// answerNewCode 생성
		String answerNewCode = goodsService.getAnswerNewCode(sellerId);
		answerNewCode = CodeIndex.codeIndex(answerNewCode, 6);
		log.info("상품 증가 코드 :::{}" , answerNewCode);
		
		goodsQnaAnswer.setGoodsAnswerCode(answerNewCode);
		goodsQnaAnswer.setSellerId("seller01");
		
		goodsService.answerAdd(goodsQnaAnswer);
		goodsService.statusUpdate(goodsQnaAnswer.getGoodsQnaNum());
		
		log.info("사용자가 등록한 답변 정보 ::: {}", goodsQnaAnswer);
		
		return "redirect:/admin/goods/goodsQna";
	}
	
	//답변 수정
	@PostMapping("/answerModify")
	public String answerModify(@RequestParam(name="goodsAnswerCode", required = false) String goodsAnswerCode,
							     Model model, GoodsQnaAnswer goodsQnaAnswer) {
		
		//특정상품의 정보
		GoodsQnaAnswer answerInfo = goodsService.answerInfoByCode(goodsAnswerCode);
		log.info("특정 상품의 정보 ::: {}", answerInfo);
		
		goodsService.answerModify(goodsQnaAnswer);
		
		model.addAttribute("title", "답변 수정");
		model.addAttribute("goodsQnaAnswer", answerInfo);
		
		return "redirect:/admin/goods/goodsQna";
	}
	
	//상품 문의 답변
	//@GetMapping("/goods/goodsAnswer")
	// public String getGoodsAnswer(Model model) {
	// List<GoodsAnswer> goodsAnswer = goodsService.getGoodsAnswer();
	// model.addAttribute("goodsAnswer", goodsAnswer);
	// return "/admin/goods/goodsQna";
	// }
	}