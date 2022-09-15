package ks44team04.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/address")
public class UserAddressController {

    @GetMapping("/list")
    public String addressList(Model model) {

        return "user/addressList";
    }

    @GetMapping("/register")
    public String addressRegister() {

        return "user/addressRegister";
    }

    @GetMapping("/modify")
    public String addressModify(Model model) {

        return "user/addressModify";
    }

    @GetMapping("/delete")
    public String addressDelete(@RequestParam(value = "userId") String userId) {

        return "redirect:/user/address/list";
    }
}
