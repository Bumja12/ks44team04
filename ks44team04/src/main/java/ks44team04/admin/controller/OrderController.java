package ks44team04.admin.controller;

import ks44team04.dto.OrderDetail;
import ks44team04.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order/response")
    public String orderResponse() {

        return "admin/order/response";
    }

    @GetMapping("/order/address")
    public String orderAddress() {

        return "admin/order/addressResponse";
    }

    @GetMapping("/order/liston")
    public String orderListOn(Model model) {
        model.addAttribute("title", "주문목록");

        return "admin/order/orderList";
    }
    @GetMapping("/order/listoff")
    public String orderListOff(Model model) {
        model.addAttribute("title", "주문관리");
        return "admin/order/orderListOff";
    }
    @PostMapping("/order/listoff")
    @ResponseBody
    public List<OrderDetail> orderListOffA(@RequestBody String status) {
        String sellerId = "seller01";
        return orderService.getOrderListA(sellerId, status);
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
