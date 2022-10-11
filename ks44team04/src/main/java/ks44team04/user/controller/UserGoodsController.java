package ks44team04.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsQna;
import ks44team04.dto.GoodsQnaCategory;
import ks44team04.service.GoodsService;

@Controller
@RequestMapping("/user/goods")
public class UserGoodsController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    
    //의존성 주입
  	private GoodsService goodsService;
  	public UserGoodsController(GoodsService goodsService) {
  		this.goodsService = goodsService;
  	}
    
    //상품 리스트 
    @GetMapping("/goodsList")
    public String getGoodsList(Model model) {
        
		List<Goods> goodsList = goodsService.getGoodsListSearch(null);
		log.info("등록된 상품 리스트 ::: {}", goodsList);
		
		//List<GoodsLargeCategory> largeCategoryList = goodsService.goodsLargeCategoryList();
		//log.info("카테고리 대분류 리스트 ::: {}", largeCategoryList);
		
		model.addAttribute("title", "상품 목록 조회");
		model.addAttribute("goodsList", goodsList);
		//model.addAttribute("largeCategoryList", largeCategoryList);
		
        return "user/goods/goodsList";
    }
    
    
    //특정 상품 정보&문의
    @GetMapping("/goods")
    public String goodsDetail(@RequestParam(name="goodsCode", required = false) String goodsCode,
    						  Model model) {
    	
    	//특정 상품의 정보
    	Goods goodsInfo = goodsService.getGoodsInfoByCode(goodsCode);
    	log.info("특정 상품의 정보 ::: {}", goodsInfo);
    	
    	//특정 상품에 대한 문의 조회
    	List<GoodsQna> goodsQnaInfo = goodsService.getGoodsQnaInfoByCode(goodsCode);
    	log.info("특정 문의 정보 ::: {}", goodsQnaInfo);
    	
    	//문의 카테고리 조회
    	List<GoodsQnaCategory> goodsQnaCategoryList = goodsService.goodsQnaCategoryList();
    	log.info("문의 카테고리 정보 ::: {}", goodsQnaCategoryList);
    	
		model.addAttribute("title", "상품");
		model.addAttribute("goodsInfo", goodsInfo);
		model.addAttribute("goodsQnaInfo", goodsQnaInfo);
		model.addAttribute("goodsQnaCategoryList", goodsQnaCategoryList);
    	
    	return "user/goods/goods";
    }
    
    //문의 등록 
	@PostMapping("/goods")
	public String goodsQnaAdd(GoodsQna goodsQna){
		
		goodsQna.setBuyerId("buyer01");
		goodsQna.setQnaStatus("답변대기");
		
		goodsService.goodsQnaAdd(goodsQna);
		log.info("사용자가 등록한 문의 정보 ::: {}", goodsQna);
		
		
		return "redirect:/user/goods/goods";
	}
    
    //장바구니
    @GetMapping("/cart")
    public String cart() {
    	log.info("cart 실행");
    	return "user/goods/cart";
    }
    
    //관심 상품 
    @GetMapping("/wishlist")
    public String wishlist() {
        log.info("wishlist 실행");
        return "user/goods/wishlist";
    }
    
    

}