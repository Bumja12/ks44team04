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
    public String getAddressList(@RequestParam(value = "searchId", required = false) String searchId, Model model) {
        Map<String, String> addressInfo = new HashMap<>();
        if (searchId != null || "".equals(searchId)) {
            addressInfo.put("userId", searchId);
        }
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
    public String setAddressModify(AddressList addressList) {
        addressService.addressModify(addressList);
        return "redirect:/admin/address/list";
    }

    @DeleteMapping("/{addressList}")
    public String setAddressDelete(@PathVariable("addressList") String addressList) {
        addressService.addressDelete(addressList);
        return "redirect:/admin/address/list";
    }
}
