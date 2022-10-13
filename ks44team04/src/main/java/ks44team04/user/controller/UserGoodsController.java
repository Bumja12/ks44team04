package ks44team04.user.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ks44team04.dto.Cart;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsQna;
import ks44team04.dto.GoodsQnaCategory;
import ks44team04.dto.Review;
import ks44team04.service.GoodsService;
import ks44team04.service.UserService;
import ks44team04.util.CodeIndex;

@Controller
@RequestMapping("/user/goods")
public class UserGoodsController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    
    //의존성 주입
  	private GoodsService goodsService;
  	//유저 권한 확인 서비스 
  	private UserService userService;
	public UserGoodsController(GoodsService goodsService, UserService userService) {
		this.goodsService = goodsService;
		this.userService = userService;
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
    public String goodsDetail(@RequestParam(name="goodsCode", required = false) String goodsCode, Model model) {
    	
    	//특정 상품의 정보
    	Goods goodsInfo = goodsService.getGoodsInfoByCode(goodsCode);
    	log.info("특정 상품의 정보 ::: {}", goodsInfo);
    	
    	//특정 상품에 대한 문의 조회
    	List<GoodsQna> goodsQnaInfo = goodsService.getGoodsQnaInfoByCode(goodsCode);
    	log.info("특정 문의 정보 ::: {}", goodsQnaInfo);
    	
    	//문의 카테고리 조회
    	List<GoodsQnaCategory> goodsQnaCategoryList = goodsService.goodsQnaCategoryList();
    	log.info("문의 카테고리 정보 ::: {}", goodsQnaCategoryList);
    	
    	//특정 후기 목록
    	List<Review> reviewSpecific = goodsService.reviewSpecific(goodsCode);
    	
		model.addAttribute("title", "상품");
		model.addAttribute("goodsInfo", goodsInfo);
		model.addAttribute("goodsQnaInfo", goodsQnaInfo);
		model.addAttribute("goodsQnaCategoryList", goodsQnaCategoryList);
		
		//후기 목록
		model.addAttribute("reviewSpecific", reviewSpecific);
    	
    	return "user/goods/goods";
    }
    
    //문의 등록 
	@PostMapping("/goods")
	public String goodsQnaAdd(GoodsQna goodsQna
							 ,@RequestHeader(value = "Referer") String referer
							 ,RedirectAttributes reattr){
		
		goodsQna.setBuyerId("buyer01");
		//goodsQna.setQnaStatus("답변대기");
		
		goodsService.goodsQnaAdd(goodsQna);
		log.info("사용자가 등록한 문의 정보 ::: {}", goodsQna);
		
		reattr.addAttribute("qnaView", "qnaView");
		
		return "redirect:" + referer;
	}
	
	//문의 답변 권한별로 볼 수 있게 하기
	@GetMapping("/answerView")
	public String goodsQnaAnswer(@RequestParam(value="a") Map<String, String> answerView
								,@RequestParam("userId") String userId ,HttpSession session) {
	 
		userService.userLogin(userId);
		String SID = (String) session.getAttribute("SID");
		
		String userRight = goodsService.userRight(userId);
		
		int a = 0;
		/*
		if("admin".equals(userRight)) {
			a = 1;
		} else if ("buyer".equals(userRight)) {
			// 글쓴이랑 세션아이디 비교
			String buyerRight = goodsService.qnaBuyerView(userId);
			if("") {
				a = 1;
			}
		} else if ("seller".equals(userRight)) {
			// 판매자랑 세션아이디 비교
			String sellerRight = goodsService.qnaSellerView(userId);
			if() {
				a = 1;
			}
		} */
		return "user/goods/answerView"; 
	 }
	 
    //장바구니
    @GetMapping("/cart")
    public String getCartList(Model model) {
    	
    	List<Cart> cartList = goodsService.getCartList("buyer01"); //임시로 buyer01의 
    	log.info("장바구니 리스트 ::: {}", cartList);
    	
    	model.addAttribute("title", "장바구니");
		model.addAttribute("cartList", cartList);
    	
    	return "user/goods/cart";
    }
    
    //장바구니 추가
    @GetMapping("/cartAdd")
    public String cartAdd(Cart cart) {
    	
    	cart.setBuyerId("buyer01"); //임의
    	String buyerId = "buyer01"; //임의
    	
    	//cartNewCode 생성
    	String cartNewCode = goodsService.cartNewCode(buyerId);
    	cartNewCode = CodeIndex.codeIndex(cartNewCode, 4);
    	
    	log.info("상품 증가 코드 :::{}" , cartNewCode);
    	
    	
    	
    	goodsService.cartAdd(cart);
    	log.info("장바구니 추가 정보 ::: {}", cart);
    	
    	return "user/goods/cart";
    }
    
    //장바구니 수량 수정
    @GetMapping("/cartModify")
    @ResponseBody
    public int cartModify(Cart cart) {
    	
    	cart.setBuyerId("buyer01"); //임의
    	
		goodsService.cartModify(cart);
		log.info("사용자가 상품 수정한 정보 ::: {}", cart);
		
		return cart.getCartAmount();
	}
	
    
    //관심 상품 
    @GetMapping("/wishlist")
    public String wishlist() {
        log.info("wishlist 실행");
        return "user/goods/wishlist";
    }
    
    

}