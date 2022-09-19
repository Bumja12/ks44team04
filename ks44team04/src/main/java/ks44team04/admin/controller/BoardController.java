package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BoardController {


	@GetMapping("/board/boardList")
	public String main() {
		return "admin/board/boardList";
	}
}