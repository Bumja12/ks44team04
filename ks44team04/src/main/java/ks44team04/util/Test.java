package ks44team04.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/test")
    public String test(Model model,
                       @RequestParam(value = "test", required = false) Object test) {
        log.info("======================================================");
        log.info("{}", test);

        return "redirect:/test";
    }
    @PostMapping("/test")
    public String test() {
        return "redirect:/test";
    }
}
