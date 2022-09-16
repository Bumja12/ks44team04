package ks44team04.admin.controller.user.controller;

import ks44team04.dto.AddressList;
import ks44team04.admin.controller.user.service.UserAddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user/address")
public class UserAddressController {

    private final UserAddressService userAddressService;
    private final Logger log = LoggerFactory.getLogger(getClass());

    public UserAddressController(UserAddressService userAddressService) {
        this.userAddressService = userAddressService;
    }

    @GetMapping("/list")
    public String addressList(@RequestParam(value = "userId", required = false) String userId, Model model) {
        userId = "buyer01";
        List<AddressList> addressList = userAddressService.getAddressList(userId);
        model.addAttribute("addressList", addressList);
        return "user/order/addressList";
    }

    @GetMapping("/register")
    public String addressRegister() {

        return "user/order/addressRegister";
    }
    @PostMapping("/register")
    public String addressRegister(AddressList addressList) {
        String addressListCode = userAddressService.getAddressListCode();
        int addressListNum = Integer.parseInt(addressListCode.substring(13));
        if(addressListNum < 10) {addressListCode = "address_list_00" + (addressListNum + 1);}
        else if(addressListNum < 100) {addressListCode = "address_list_0" + (addressListNum + 1);}
        else if(addressListNum < 1000) {addressListCode = "address_list_" + (addressListNum + 1);}
        addressList.setAddressList(addressListCode);
        addressList.setBuyerId("buyer01");
        userAddressService.addressRegister(addressList);

        return "redirect:/user/address/list";
    }

    @GetMapping("/modify")
    public String addressModify(Model model) {

        return "user/order/addressModify";
    }

    @GetMapping("/delete")
    public String getAddressDelete(@RequestParam(value = "userId") String userId) {

        return "redirect:/user/address/list";
    }
}
