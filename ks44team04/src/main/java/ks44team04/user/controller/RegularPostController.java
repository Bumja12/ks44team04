package ks44team04.user.controller;

import ks44team04.service.RegularPostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/regularpost")
public class RegularPostController {

    RegularPostService regularPostService;

    public RegularPostController(RegularPostService regularPostService) {
        this.regularPostService = regularPostService;
    }

    @GetMapping("/history")
    public String regularPostHistory() {

        return "user/regularPost/regularPostHistory";
    }
}
