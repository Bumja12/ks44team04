package ks44team04.util;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    @GetMapping("/test")
    public String test(Model model) {
        String test = "<p>안녕하세요.</p><p>반갑습니다.</p><p>나니</p>";
        model.addAttribute("test", test);
        model.addAttribute("test2", "321");
        return "test";
    }
}
