package ks44team04.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BoardController {

	//댓글 조회
	@GetMapping("/board/boardComment")
	public String boardComment() {
		return "admin/board/boardComment";
	}
	
	//좋아요 조회
	@GetMapping("/board/boardLike")
	public String boardLike() {
		return "admin/board/boardLike";
	}
	
	//게시물 조회
	@GetMapping("/board/boardList")
	public String main() {
		return "admin/board/boardList";
	}
}