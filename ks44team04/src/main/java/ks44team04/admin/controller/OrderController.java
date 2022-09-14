package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class OrderController {

    @GetMapping("/order/response")
    public String orderResponse() {

        return "admin/order/response";
    }

    @GetMapping("/order/address")
    public String orderAddress() {

        return "admin/order/addressResponse";
    }

    @GetMapping("/order/list")
    public String orderList(Model model) {

        return "admin/order/orderList";
    }

    @GetMapping("/order/cancel")
    public String orderCancel() {

        return "admin/order/cancelResponse";
    }
    @GetMapping("/order/return")
    public String orderReturn() {

        return "admin/order/returnResponse";
    }

    @GetMapping("/order/refund")
    public String refundList() {

        return  "admin/order/refund";
    }





}
