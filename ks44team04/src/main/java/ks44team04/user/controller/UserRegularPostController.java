package ks44team04.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/regularpost")
public class UserRegularPostController {

    @GetMapping("/list")
    public String regularPostList(Model model) {

        return "user/regularPost/regularPostList";
    }

    @GetMapping("/history")
    public String regularPostHistory(Model model) {

        return "user/regularPost/regularPostHistory";
    }

    @GetMapping("/modify")
    public String regularPostModify(Model model) {

        return "user/regularPost/regularPostModify";
    }

    @GetMapping("/delete")
    public String regularPostDelete(Model model) {

        return "user/regularPost/regularPostDelete";
    }

    @GetMapping("/skip")
    public String regularPostSkip(Model model) {

        return "user/regularPost/regularPostSkip";
    }
}
