package ks44team04.admin.controller;

import ks44team04.dto.Goods;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.GoodsQna;
import ks44team04.service.GoodsService;
import ks44team04.util.CodeIndex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin/goods")
public class GoodsController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	//의존성 주입
	private GoodsService goodsService;
	public GoodsController(GoodsService goodsService) {
		this.goodsService = goodsService;
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
									,Model model) {
		
		
		if("goodsCode".equals(searchKey)) {
			searchKey = "goods_code";
		}else if("goodsName".equals(searchKey)) {
			searchKey = "goods_name";
		}else if("userId".equals(searchKey)) {
			searchKey = "user_id";
		}

		//if("goodsSmallCategory".equals(searchKey2)) {
		//	searchKey2 = "sc.goods_small_category";
		//}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		//paramMap.put("searchKey2", searchKey2);
		paramMap.put("searchCate", searchCate);
		
		List<Goods> goodsList = goodsService.getGoodsListSearch(paramMap);
		List<GoodsLargeCategory> largeCategoryList = goodsService.goodsLargeCategoryList();
		
		model.addAttribute("title", "상품 목록 조회");
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("largeCategoryList", largeCategoryList);
		model.addAttribute("searchKey", searchKey);
		model.addAttribute("searchValue", searchValue);
		model.addAttribute("searchCate", searchCate);
		
		return "/admin/goods/goodsList";
	}
	
	//상품 수정을 위해 수정페이지에 정보 불러오기
	@GetMapping("/goodsModify")
	public String goodsModify(@RequestParam(name="goodsCode", required = false) String goodsCode,
							  Model model) {
		
		//특정회원의 정보
		Goods goodsInfo = goodsService.getGoodsInfoByCode(goodsCode);
		log.info("특정 상품의 정보 ::: {}", goodsInfo);
		//model 셋팅
		model.addAttribute("title", "상품수정");
		model.addAttribute("goodsInfo", goodsInfo);
				
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
	public String goodsAdd(Goods goods, Model model) {
		String sellerId = "seller01"; //임의
			
		// goodsCode 생성
		String goodsNewCode = goodsService.getGoodsNewCode(sellerId);
		goodsNewCode = CodeIndex.codeIndex(goodsNewCode, 5);
		
		
		log.info("상품 증가 코드 :::{}" , goodsNewCode);
			
		goods.setGoodsCode(goodsNewCode);
		goods.setSellerId("seller01");
		//goods.setGoodsContent("contents"); //임의
		goods.setGoodsFile("goods.jpg"); //임의
			
		//대분류 카테고리 리스트 가져오기
		List<GoodsLargeCategory> largeCategoryList = goodsService.goodsLargeCategoryList();
		
		log.info("사용자가 상품 등록한 정보 ::: {}", goods);
		goodsService.goodsAdd(goods);
			
		model.addAttribute("largeCategoryList", largeCategoryList);
		
		return "redirect:/admin/goods/goodsList";
	}
		
	//상품 삭제
	@GetMapping("/goodsRemove")
	public String goodsRemove(@RequestParam(value = "goodsCode") String goodsCode) {
		
		goodsService.goodsRemove(goodsCode);

		return "redirect:/admin/goods/goodsList";
	}
	
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
		
		List<GoodsQna> goodsQna = goodsService.getGoodsQnaSearch(paramMap);
		
		model.addAttribute("title", "상품 목록 조회");
		model.addAttribute("goodsQna", goodsQna);
		model.addAttribute("searchKey", searchKey);
		model.addAttribute("searchValue", searchValue);
		model.addAttribute("searchKey2", searchKey2);
		model.addAttribute("searchQnaStatus", searchQnaStatus);
		
		return "/admin/goods/goodsQna";
	}
		
   //상품 문의 답변 
   //@GetMapping("/goods/goodsAnswer")
   // public String getGoodsAnswer(Model model) {
   // 	List<GoodsAnswer> goodsAnswer = goodsService.getGoodsAnswer();
   //	model.addAttribute("goodsAnswer", goodsAnswer);
   // return "/admin/goods/goodsQna";
   // }
    
	//상품 후기
    @GetMapping("/goodsReview")
    public String goodsReview() {
        return "/admin/goods/goodsReview";
    }
}