package ks44team04.admin.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.admin.service.BoardService;
import ks44team04.dto.Board;
import ks44team04.dto.BoardComment;
import ks44team04.dto.BoardLike;

@Controller
@RequestMapping("/admin")
public class BoardController {

	//의존성 주입
	private BoardService boardService;
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@PostConstruct
	public void BoardControllerInit() {
	}
	
	
	//좋아요 조회
	@GetMapping("/board/boardLike")
	public String getBoardLikeList(Model model) {
		List<BoardLike> boardLikeList = boardService.getBoardLikeList();
		model.addAttribute("title", "좋아요 목록");
		model.addAttribute("boardLikeList", boardLikeList);
		return "admin/board/boardLike";
	}
	
	//댓글 조회
	@GetMapping("/board/boardComment")
	public String getBoardCommentList(Model model) {
		List<BoardComment> boardCommentList = boardService.getBoardCommentList();
		model.addAttribute("title", "댓글 목록");
		model.addAttribute("boardCommentList", boardCommentList);
		return "admin/board/boardComment";
	}
	
	//게시물 조회
	@GetMapping("/board/boardList")
	public String getBoardList(Model model) {
		List<Board> boardList = boardService.getBoardList();
		model.addAttribute("title", "게시물 목록");
		model.addAttribute("boardList", boardList);
		return "admin/board/boardList";
	}
}