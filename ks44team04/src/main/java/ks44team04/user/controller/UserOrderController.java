package ks44team04.user.controller;

import ks44team04.dto.AddressList;
import ks44team04.dto.CouponStatus;
import ks44team04.dto.OrderDetail;
import ks44team04.service.AddressService;
import ks44team04.service.CouponService;
import ks44team04.service.OrderService;
import ks44team04.service.PointService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user/order")
public class UserOrderController {

    AddressService addressService;
    CouponService couponService;
    PointService pointService;
    OrderService orderService;

    public UserOrderController(AddressService addressService, CouponService couponService, PointService pointService, OrderService orderService) {
        this.addressService = addressService;
        this.couponService = couponService;
        this.pointService = pointService;
        this.orderService = orderService;
    }

    @GetMapping("/checkout")
    public String checkout(Model model) {
        String userId = "buyer01";
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("userId", userId);
        List<AddressList> addressLists = addressService.getAddressList(addressInfo);

        int userPoint = pointService.getUserPoint(userId);

        model.addAttribute("addressList", addressLists);
        model.addAttribute("userPoint", userPoint);

        return "user/order/checkout";
    }

    @GetMapping("/couponlist")
    public String getCouponStatus(Model model) {
        String userId = "buyer01";
        List<CouponStatus> couponStatus = couponService.getCouponStatus(userId);
        model.addAttribute("couponStatus", couponStatus);
        return "user/order/couponList";
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

    @GetMapping("/exchange/{orderdetailcode}")
    public String orderExchange(@PathVariable("orderdetailcode") String orderDetailCode, Model model) {
        Map<String, Object> orderMap = new HashMap<>();
        orderMap.put("orderDetailCode", orderDetailCode);
        OrderDetail orderDetail = orderService.getOrderDetail(orderMap);
        model.addAttribute("orderDetail", orderDetail);
        return "user/order/orderExchange";
    }

    @GetMapping("/return")
    public String orderReturn() {

        return "user/order/orderReturn";
    }



}
