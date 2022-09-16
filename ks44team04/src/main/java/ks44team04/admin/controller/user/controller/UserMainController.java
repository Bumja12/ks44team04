package ks44team04.admin.controller.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserMainController {

    @GetMapping("/user")
    public String userMain() {
        return "user/main";
    }

}
