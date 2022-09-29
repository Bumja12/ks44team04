package ks44team04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value = "main")
public class MainController {

    @GetMapping("/")
    public String main() {
        return "index";
    }
}
