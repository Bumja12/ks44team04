package ks44team04.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserOrderController {

    @GetMapping("/address/list")
    public String addressList(Model model) {

        return "user/addressList";
    }

    @GetMapping("/address/register")
    public String addressRegister() {

        return "user/addressRegister";
    }

    @GetMapping("/address/modify")
    public String addressModify(Model model) {

        return "user/addressModify";
    }

    @GetMapping("/address/delete")
    public String addressDelete(@RequestParam(value = "userId") String userId) {

        return "redirect:/user/address/list";
    }

    @GetMapping("/order")
    public String order() {

        return "user/order/order";
    }

    @GetMapping("/order/payment")
    public String orderPayment() {

        return "user/order/payment";
    }

    @GetMapping("/order/list")
    public String orderList() {

        return "user/order/orderList";
    }

    @GetMapping("/order/detail")
    public String orderDetail() {

        return "user/order/orderDetail";
    }

    @GetMapping("/order/modify")
    public String orderModify() {

        return "user/order/orderModify";
    }

    @GetMapping("/order/cancel")
    public String orderCancel() {

        return "user/order/orderCancel";
    }

    @GetMapping("/order/exchange")
    public String orderExchange() {

        return "user/order/orderExchange";
    }

    @GetMapping("/order/return")
    public String orderReturn() {

        return "user/order/orderReturn";
    }

}
