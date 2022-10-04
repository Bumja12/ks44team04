package ks44team04.user.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import ks44team04.dto.*;
import ks44team04.service.*;
import ks44team04.util.CodeIndex;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    Service service;
    Gson gson;

    public UserOrderController(AddressService addressService, CouponService couponService, PointService pointService, OrderService orderService, Service service, Gson gson) {
        this.addressService = addressService;
        this.couponService = couponService;
        this.pointService = pointService;
        this.orderService = orderService;
        this.service = service;
        this.gson = gson;
    }

    @GetMapping("/checkout")
    public String checkout(Model model,
                           @RequestParam(value = "goodsCode", required = false) String goodsCode) {
        String userId = "buyer01";
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("userId", userId);
        List<AddressList> addressLists = addressService.getAddressList(addressInfo);
        int userPoint = pointService.getUserPoint(userId);

        model.addAttribute("addressList", addressLists);
        model.addAttribute("userPoint", userPoint);

        orderService.getGoodsList(goodsCode);

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
    public String orderList(Model model) {
        String userId = "buyer01";
        List<OrderDetail> orderList = orderService.getOrderList(userId);
        model.addAttribute("orderList", orderList);
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

    @GetMapping("/postcheck/{postCode}")
    public String postCheck(@PathVariable(value = "postCode") String postInfo) {
        PostInfo post = addressService.getPostInfo(postInfo);
        String pcn = post.getPostCompanyName();
        String in = post.getInvoiceNumber();
        String company = "";

        ResponseEntity<Object> companyObj = service.getData("https://apis.tracker.delivery/carriers");
        JsonArray companyArray = gson.toJsonTree(companyObj.getBody()).getAsJsonArray();
        for (JsonElement jsonElement : companyArray) {
            if(jsonElement.getAsJsonObject().get("name").getAsString().contains(pcn)) {
                company = jsonElement.getAsJsonObject().get("id").getAsString();
            }
        }
        return "redirect:https://tracker.delivery/#/" + company + "/" + in;
    }

    @GetMapping("/exchange/{orderdetailcode}")
    public String orderExchange(@PathVariable("orderdetailcode") String orderDetailCode, Model model) {
        Map<String, Object> orderMap = new HashMap<>();
        orderMap.put("orderDetailCode", orderDetailCode);
        OrderDetail orderDetail = orderService.getOrderDetail(orderMap);
        model.addAttribute("orderDetail", orderDetail);
        return "user/order/orderExchange";
    }

    @PostMapping("/exchange")
    public String regularPostExchange(OrderExchange orderExchange) {
        String orderExchangeMaxCode = orderService.getOrderExchangeMaxCode();
        String exchangeAskCode = CodeIndex.codeIndex(orderExchangeMaxCode, 15);
        String sessionId = "buyer01";

        orderExchange.setExchangeAskCode(exchangeAskCode);
        orderExchange.setBuyerId(sessionId);

        orderService.setOrderExchange(orderExchange);
        orderService.setOrderDetailStatus(orderExchange.getOrderDetailCode(), "교환요청");

        return "redirect:/user/address/success";
    }

    @PostMapping("/returnaddress")
    public String setReturnPost(@RequestParam("postType") String postType,
                                @RequestParam("orderDetailCode") String orderDetailCode,
                                @RequestParam("postCompany") String postCompany,
                                @RequestParam("invoiceNumber") String invoiceNumber,
                                @RequestHeader(value = "Referer") String referer) {
        Map<String, Object> returnPost = new HashMap<>();
        returnPost.put("postType", postType);
        returnPost.put("orderDetailCode", orderDetailCode);
        returnPost.put("postCompany", postCompany);
        returnPost.put("invoiceNumber", invoiceNumber);
        orderService.setReturnPost(returnPost);

        if (postType.equals("exchange")) {
            orderService.setOrderDetailStatus(orderDetailCode, "교환처리중");
        } else if (postType.equals("refund")) {
            orderService.setOrderDetailStatus(orderDetailCode, "환불처리중");
        }

        return "redirect:" + referer;
    }

    @GetMapping("/return/{orderDetailCode}")
    public String orderReturn(@PathVariable(value = "orderDetailCode") String orderDetailCode,
                              Model model) {
        Map<String, Object> orderMap = new HashMap<>();
        orderMap.put("orderDetailCode", orderDetailCode);
        OrderDetail orderDetail = orderService.getOrderDetail(orderMap);
        model.addAttribute("orderDetail", orderDetail);
        return "/user/order/orderReturn";
    }

    @PostMapping("/return")
    public String orderReturn(OrderReturn orderReturn) {
        String orderReturnMaxCode = orderService.getOrderReturnMaxCode();
        String orderReturnCode = CodeIndex.codeIndex(orderReturnMaxCode, 13);
        String sessionId = "buyer01";

        orderReturn.setOrderReturnCode(orderReturnCode);
        orderReturn.setBuyerId(sessionId);

        orderService.setOrderReturn(orderReturn);
        orderService.setOrderDetailStatus(orderReturn.getOrderDetailCode(), "환불요청");
        return "redirect:/user/address/success";
    }

    @GetMapping("/confirm/{orderdetailcode}")
    public String regularPostConfirm(@PathVariable(value = "orderdetailcode") String orderDetailCode,
                                     @RequestHeader(value = "Referer") String referer) {
        orderService.setOrderDetailStatus(orderDetailCode, "구매확정");
        return "redirect:" + referer;
    }



}
