package ks44team04.admin.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import ks44team04.dto.OrderDetail;
import ks44team04.dto.PostInfo;
import ks44team04.service.AddressService;
import ks44team04.service.OrderService;
import ks44team04.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class OrderController {

    private final OrderService orderService;
    private final Service service;
    private final AddressService addressService;

    public OrderController(OrderService orderService, Service service, AddressService addressService) {
        this.orderService = orderService;
        this.service = service;
        this.addressService = addressService;
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

        return "admin/order/refund";
    }

    @GetMapping("/order/check/{orderDetailCode}")
    @ResponseBody
    public void setOrderCheck(@PathVariable("orderDetailCode") String orderDetailCode) {
        orderService.setOrderDetailStatus(orderDetailCode, "배송준비중");
    }

    @PostMapping("/order/post")
    public String addPost(PostInfo postInfo,
                          @RequestParam(value = "orderDetailCode") String orderDetailCode) {
        String post = orderService.addPostInfo(postInfo);
        orderService.setOrderDetailStatus(orderDetailCode, "배송중");
        orderService.setOrderDetailPost(orderDetailCode, post);
        return "redirect:/admin/order/liston";
    }

    @GetMapping("/order/postinfo/{postInfo}")
    public @ResponseBody PostInfo getPostInfo(@PathVariable(value = "postInfo") String post) {
        return addressService.getPostInfo(post);
    }

    @PostMapping("/order/post/modify")
    public String setPostInfo(PostInfo postInfo) {
        addressService.setPostInfo(postInfo);
        return "redirect:/admin/order/liston";
    }

    @PostMapping("/order/cancel")
    @ResponseBody
    public void setCancelApprove(@RequestBody String orderDetailCode) {
        orderService.setCancelApprove(orderDetailCode);
        orderService.setOrderDetailStatus(orderDetailCode, "취소완료");
    }
    @PostMapping("/order/exchange")
    @ResponseBody
    public void setExchangeApprove(@RequestBody String orderDetailCode) {
        orderService.setExchangeApprove(orderDetailCode);
        orderService.setOrderDetailStatus(orderDetailCode, "교환처리중");
    }
    @PostMapping("/order/return")
    @ResponseBody
    public void setReturnApprove(@RequestBody String orderDetailCode) {
        orderService.setReturnApprove(orderDetailCode);
        orderService.setOrderDetailStatus(orderDetailCode, "반품처리중");
    }

}
