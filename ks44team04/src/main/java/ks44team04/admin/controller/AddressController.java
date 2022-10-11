package ks44team04.admin.controller;

import ks44team04.dto.AddressList;
import ks44team04.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin/address")
public class AddressController {

    AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/list")
    public String addressList(@RequestParam(value = "userId", required = false) String userId, Model model) {
        userId = "buyer01";
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("userId", userId);
        List<AddressList> addressLists = addressService.getAddressList(addressInfo);
        model.addAttribute("addressList", addressLists);
        return "admin/order/addressList";
    }

    @GetMapping("/modify/{addressList}")
    public String getAddressModify(@PathVariable(value = "addressList", required = false) String addressList,
                                   Model model) {
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("addressList", addressList);
        AddressList addressLists = addressService.getAddressList(addressInfo).get(0);
        model.addAttribute("addressList", addressLists);
        return "admin/order/addressModify";
    }

    @PostMapping("/modify")
    public String addressModify(AddressList addressList) {
        addressService.addressModify(addressList);
        return "redirect:/admin/address/list";
    }

    @GetMapping("/delete/{addressList}")
    public String getAddressDelete(@PathVariable("addressList") String addressList) {
        addressService.addressDelete(addressList);
        return "redirect:/admin/address/list";
    }
}
