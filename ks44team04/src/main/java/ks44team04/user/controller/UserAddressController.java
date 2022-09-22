package ks44team04.user.controller;

import ks44team04.dto.AddressList;
import ks44team04.user.service.UserAddressService;
import ks44team04.util.CodeIndex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("userId", userId);
        List<AddressList> addressLists = userAddressService.getAddressList(addressInfo);
        model.addAttribute("addressList", addressLists);
        return "user/order/addressList";
    }

    @GetMapping("/register")
    public String addressRegister() {

        return "user/order/addressRegister";
    }
    @PostMapping("/register")
    public String addressRegister(AddressList addressList) {
        CodeIndex codeIndex = new CodeIndex();

        String addressListCode = userAddressService.getAddressListCode();
        addressListCode = codeIndex.codeIndex(addressListCode, 13);

        addressList.setAddressList(addressListCode);
        addressList.setBuyerId("buyer01");
        userAddressService.addressRegister(addressList);

        return "redirect:/user/address/list";
    }

    @GetMapping("/modify/{addressList}")
    public String getAddressModify(@PathVariable(value = "addressList", required = false) String addressList,
                                Model model) {
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("addressList", addressList);
        AddressList addressLists = userAddressService.getAddressList(addressInfo).get(0);
        model.addAttribute("addressList", addressLists);
        return "user/order/addressModify";
    }

    @PostMapping("/modify")
    public String addressModify(AddressList addressList) {
        userAddressService.addressModify(addressList);
        log.info("userAddress.addressList, {}", addressList.getAddressList());
        return "redirect:/user/address/list";
    }

    @GetMapping("/delete/{addressList}")
    public String getAddressDelete(@PathVariable("addressList") String addressList) {
        userAddressService.addressDelete(addressList);
        return "redirect:/user/address/list";
    }
  
}
