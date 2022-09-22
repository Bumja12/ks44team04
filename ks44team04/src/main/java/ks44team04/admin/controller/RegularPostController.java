package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/regularpost")
public class RegularPostController {

    @GetMapping("/list")
    public String regularPostList(Model model) {

        return "admin/regularPost/regularPostList";
    }

    @GetMapping("/history")
    public String regularPostHistory(Model model) {

        return "admin/regularPost/regularPostHistory";
    }

    @GetMapping("/manage")
    public String regularPostManage(Model model) {

        return "admin/regularPost/regularPostManage";
    }

    @GetMapping("/goodslist")
    public String regularPostGoodsList(Model model) {

        return "admin/regularPost/regularPostGoodsList";
    }

    @GetMapping("/goodsmodify")
    public String regularPostGoodsModify(Model model) {

        return "admin/regularPost/regularPostGoodsModify";
    }

    @GetMapping("/goodsdelete")
    public String regularPostGoodsDelete(Model model) {

        return "admin/regularPost/regularPostGoodsDelete";
    }

}
