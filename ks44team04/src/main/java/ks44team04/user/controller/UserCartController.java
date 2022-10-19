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
import org.springframework.web.bind.annotation.ResponseBody;
import ks44team04.dto.Cart;
import ks44team04.service.CartService;
import ks44team04.service.UserService;
import ks44team04.util.CodeIndex;

@Controller
@RequestMapping("/user/goods")
public class UserCartController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    
    //의존성 주입
  	private CartService cartService;
  	//유저 권한 확인 서비스 
  	//private UserService userService;
	public UserCartController(CartService cartService, UserService userService) {
		this.cartService = cartService;
	//	this.userService = userService;
	}

	//장바구니
    @GetMapping("/cart")
    public String getCartList(Model model) {
    	
    	List<Cart> cartList = cartService.getCartList("buyer01"); //임시로 buyer01의 
    	log.info("장바구니 리스트 ::: {}", cartList);
    	
    	model.addAttribute("title", "장바구니");
		model.addAttribute("cartList", cartList);
    	
    	return "user/goods/cart";
    }
    
    //장바구니 추가
    @PostMapping("/cartAdd")
    @ResponseBody
    public int cartAdd(Cart cart ,@RequestParam("goodsCode") String goodsCode
    				             ,@RequestParam("cartAmount") int cartAmount) {
    	
    	String buyerId = "buyer01"; //임의
    	
    	//cartNewCode 생성
    	String cartNewCode = cartService.cartNewCode(buyerId); //buyerId 임의
    	if(cartNewCode == null) {
    		cartNewCode = "cart001";
    	} else {
    		cartNewCode = CodeIndex.codeIndex(cartNewCode, 4);
    	}
    	log.info("장바구니 증가 코드 :::{}" , cartNewCode);
    	
    	cart.setCartCode(cartNewCode);
    	cart.setBuyerId("buyer01"); //임의

    	//만약 장바구니에 같은 상품코드가 있을 시 수량만 더하기
    	if(cartService.cartCheck(cart) > 0) {
    		cartService.cartPlus(cart);
    		return 2;
    	}
    	cartService.cartAdd(cart);
    	log.info("장바구니 추가 정보 ::: {}", cart);
    	
    	return 1;
    }
    
    
    //장바구니 수량 수정
    @GetMapping("/cartModify")
    @ResponseBody
    public int cartModify(Cart cart) {
    	
    	cart.setBuyerId("buyer01"); //임의
    	
    	cartService.cartModify(cart);
		log.info("사용자가 상품 수정한 정보 ::: {}", cart);
		
		return cart.getCartAmount();
	}
    
	//장바구니 삭제
	@PostMapping("/cartRemove")
    @ResponseBody
	public String cartRemove(Cart cart) {
		
		cart.setBuyerId("buyer01"); //임의
		
		cartService.cartRemove(cart);
		log.info("사용자가 삭제한 장바구니 정보 ::: {}", cart);
		
		return "redirect:/";
	}
	
    

}