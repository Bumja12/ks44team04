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

import java.util.List;

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
		List<Goods> goodsList = goodsService.getGoodsList();
		log.info("등록된 상품 리스트 ::: {}", goodsList);
		
		List<GoodsLargeCategory> largeCategoryList = goodsService.goodsLargeCategoryList();
		log.info("카테고리 대분류 리스트 ::: {}", largeCategoryList);
		
		model.addAttribute("title", "상품목록");
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("largeCategoryList", largeCategoryList);
		
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
		model.addAttribute("title", "상품 등록");
		return "admin/goods/goodsAdd";
	}

	//상품 등록 쿼리 실행
	@PostMapping("/goodsAdd")
	public String goodsAdd(Goods goods) {
		String sellerId = "seller01"; //임의
			
		// goodsCode 생성
		String goodsNewCode = goodsService.getGoodsNewCode(sellerId);
		goodsNewCode = CodeIndex.codeIndex(goodsNewCode, 5);
			
		log.info("상품 증가 코드 :::{}" , goodsNewCode);
			
		goods.setGoodsCode(goodsNewCode);
		goods.setSellerId("seller01");
		goods.setGoodsSmallCategory("apple"); //임의
		//goods.setGoodsContent("contents"); //임의
		goods.setGoodsFile("goods.jpg"); //임의
			
		log.info("사용자가 상품 등록한 정보 ::: {}", goods);
		goodsService.goodsAdd(goods);
			
		return "redirect:/admin/goods/goodsList";
	}
		
	//상품 삭제
	@GetMapping("/goodsRemove")
	public String goodsRemove(@RequestParam(value = "goodsCode") String goodsCode
							 ,@RequestParam(name = "adminPw") String userPw) {
		
		//비밀번호 확인
		String adminPw = goodsService.getAdminPw(userPw);
		
		if(adminPw != null) {
			if(adminPw.equals(userPw)) {
				goodsService.goodsRemove(goodsCode);
			}
		}

		return "redirect:/admin/goods/goodsList";
	}
	
	@PostMapping("/pwCheck")
	@ResponseBody
	public int pwCheck(@RequestParam(value = "userPw") String userPw) {
		//String userId = "admin01";
		String adminPw = goodsService.getAdminPw(userPw);
		if(userPw.equals(adminPw)) {
			return 1;
		}
		return 0;
	}
		
	
	//상품문의 & 상품문의 답변
    @GetMapping("/goodsQna")
    public String getGoodsQna(Model model) {
    	List<GoodsQna> goodsQna = goodsService.getGoodsQna();
    	log.info("문의 정보 ::: {}", goodsQna);
		model.addAttribute("title", "문의목록");
		model.addAttribute("goodsQna", goodsQna);
		
        return "admin/goods/goodsQna";
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