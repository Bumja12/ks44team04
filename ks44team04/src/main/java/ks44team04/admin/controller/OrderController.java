package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class OrderController {

    @GetMapping("/addresslist")
    public String addresslist() {
        return "admin/addressList";
    }

    @GetMapping("/postlist")
    public String postlist() {
        return "admin/postList";
    }


}
