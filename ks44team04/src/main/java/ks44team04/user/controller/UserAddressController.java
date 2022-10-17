package ks44team04.user.controller;

import ks44team04.dto.AddressList;
import ks44team04.service.AddressService;
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

    private final AddressService addressService;
    private final Logger log = LoggerFactory.getLogger(getClass());

    public UserAddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("")
    public String addressList(@RequestParam(value = "userId", required = false) String userId, Model model) {
        userId = "buyer01";
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("userId", userId);
        List<AddressList> addressLists = addressService.getAddressList(addressInfo);
        model.addAttribute("addressList", addressLists);
        return "user/order/address";
    }


    @GetMapping("/register")
    public String addressRegister() {

        return "user/order/addressReg";
    }
    @PostMapping("/register")
    public String addressRegister(AddressList addressList) {

        String addressListCode = addressService.getAddressListCode();
        addressListCode = CodeIndex.codeIndex(addressListCode, 13);

        addressList.setAddressList(addressListCode);
        addressList.setBuyerId("buyer01");
        addressService.addressRegister(addressList);

        return "redirect:/user/address";
    }

    @GetMapping("/success")
    public String successClose() {

        return "user/order/success";
    }

    @GetMapping("/modify/{addressList}") // 배송지 수정 클릭 시 값 받아와서 화면에 뿌림
    public String getAddressModify(@PathVariable(value = "addressList", required = false) String addressList,
                                Model model) {
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("addressList", addressList);
        AddressList addressLists = addressService.getAddressList(addressInfo).get(0);
        model.addAttribute("addressLists", addressLists);
        return "user/order/addressMod";
    }

    @PostMapping("/modify")
    public String addressModify(AddressList addressList) {
        addressService.addressModify(addressList);
        return "redirect:/user/address";
    }

    @PostMapping("/delete")
    @ResponseBody
    public void addressDelete(@RequestBody String addressList) {
        addressService.addressDelete(addressList);
    }

    @GetMapping("/checkoutlist") // 체크아웃 화면에서 배송지 등록 시 처리 후 화면에 보여줌
    @ResponseBody
    public AddressList checkoutList(@RequestParam(value = "userId", required = false) String userId) {
        userId = "buyer01";
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("userId", userId);
        List<AddressList> addressLists = addressService.getAddressList(addressInfo);

        return addressLists.get(addressLists.size() - 1);
    }
  
}
