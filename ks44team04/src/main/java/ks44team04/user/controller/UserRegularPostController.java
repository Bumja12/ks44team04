package ks44team04.user.controller;

import ks44team04.dto.RegularPostHistory;
import ks44team04.service.RegularPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/regularpost")
public class UserRegularPostController {

    RegularPostService regularPostService;

    public UserRegularPostController(RegularPostService regularPostService) {
        this.regularPostService = regularPostService;
    }

    @GetMapping("/list")
    public String regularPostList(Model model) {

        return "user/regularPost/regularPostList";
    }

    @GetMapping("/postcheck/{postCode}")
    public String postCheck(@PathVariable("postCode") String postCode) {


        return "redirect:https://tracker.delivery/#/kr.cjlogistics/651348940725";
    }

    @GetMapping("/history")
    public String regularPostHistory(Model model) {
        String userId = "buyer01";
        List<RegularPostHistory> regularPostHistory = regularPostService.getRegularPostHistory(userId);
        model.addAttribute("regularPostHistory", regularPostHistory);
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
