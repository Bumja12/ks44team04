package ks44team04.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/goods")
public class UserGoodsController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    
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
    
    //상품 하나...? 
    @GetMapping("/goods")
    public String goods() {
        log.info("goods 실행");
        return "user/goods/goods";
    }
    
    //상품 리스트 
    @GetMapping("/goodsList")
    public String goodsList() {
        log.info("goodsList 실행");
        return "user/goods/goodsList";
    }

}