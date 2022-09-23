package ks44team04.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/order")
public class UserOrderController {

    @GetMapping("/")
    public String order() {

        return "user/order/order";
    }

    @GetMapping("/payment")
    public String orderPayment() {

        return "user/order/payment";
    }

    @GetMapping("/list")
    public String orderList() {

        return "user/order/orderList";
    }

    @GetMapping("/detail")
    public String orderDetail() {

        return "user/order/orderDetail";
    }

    @GetMapping("/modify")
    public String orderModify() {

        return "user/order/orderModify";
    }

    @GetMapping("/cancel")
    public String orderCancel() {

        return "user/order/orderCancel";
    }

    @GetMapping("/exchange")
    public String orderExchange() {

        return "user/order/orderExchange";
    }

    @GetMapping("/return")
    public String orderReturn() {

        return "user/order/orderReturn";
    }

}
