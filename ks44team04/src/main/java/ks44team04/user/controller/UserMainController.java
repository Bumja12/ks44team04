package ks44team04.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserMainController {

    @GetMapping("/user")
    public String userMain() {
        return "user/main";
    }

    @GetMapping("/user/mpe")
    public String userMpe() {
        return "myPageExample";
    }
    @GetMapping("/user/mpte")
    public String userMpte() {
        return "myPageTableExample";
    }

}
