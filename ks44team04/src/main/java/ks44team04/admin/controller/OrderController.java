package ks44team04.admin.controller;

import ks44team04.dto.OrderDetail;
import ks44team04.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        String sellerId = "seller01";
        List<OrderDetail> orderList = orderService.getOrderListOn(sellerId);

        model.addAttribute("orderList", orderList);

        return "orderList";
    }
    @GetMapping("/order/listoff")
    public String orderListOut(@RequestParam("status") String status,
                               Model model) {
        String sellerId = "seller01";
        List<OrderDetail> orderList = orderService.getOrderListOff(sellerId, status);

        model.addAttribute("orderList", orderList);

        return "admin/order/orderListOff";
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
