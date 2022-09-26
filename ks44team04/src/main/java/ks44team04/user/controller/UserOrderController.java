package ks44team04.user.controller;

import ks44team04.dto.AddressList;
import ks44team04.user.service.UserAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user/order")
public class UserOrderController {

    UserAddressService userAddressService;

    public UserOrderController(UserAddressService userAddressService) {
        this.userAddressService = userAddressService;
    }

    @GetMapping("/checkout")
    public String checkout(Model model) {
            String userId = "buyer01";
            Map<String, String> addressInfo = new HashMap<>();
            addressInfo.put("userId", userId);
            List<AddressList> addressLists = userAddressService.getAddressList(addressInfo);
            model.addAttribute("addressList", addressLists);

        return "user/order/checkout";
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
