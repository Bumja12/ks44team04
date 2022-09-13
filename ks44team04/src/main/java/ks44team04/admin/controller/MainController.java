package ks44team04.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/admin")
    public String main() {
        log.info("MainController 실행");
        return "admin/main";
    }

}
