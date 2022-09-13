package ks44team04.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserMainController {

    @GetMapping("/user")
    public String userMain() {
        return "user/main";
    }

    @GetMapping("/user/cart")
    public String userCart() {
        return "user/cart";
    }

    @GetMapping("/user/checkout")
    public String userCheckout() {
        return "user/checkout";
    }

    @GetMapping("/user/goods")
    public String goods() {
        return "user/goods";
    }

    @GetMapping("/user/goodslist")
    public String goodsList() {
        return "user/goodslist";
    }

    @GetMapping("/user/wishlist")
    public String wishlist() {
        return "user/wishlist";
    }
}
