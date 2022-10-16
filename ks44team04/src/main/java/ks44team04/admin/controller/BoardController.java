package ks44team04.admin.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ks44team04.service.BoardService;
import ks44team04.dto.Board;
import ks44team04.dto.BoardComment;
import ks44team04.dto.BoardLike;

@Controller
@RequestMapping("/admin/board")
public class BoardController {

	//의존성 주입
	private BoardService boardService;
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	//게시물 조회
	@GetMapping("/boardList")
	public String getBoardList(Model model) {
		List<Board> boardList = boardService.getBoardListSearch(null);
		model.addAttribute("title", "게시물 목록 조회");
		model.addAttribute("boardList", boardList);
		return "admin/board/boardList";
	}
	
	//게시물 목록 검색
	@PostMapping("/boardList")
	public String getBoardListSearch(@RequestParam(name="searchKey", defaultValue="boardTitle") String searchKey
									,@RequestParam(name="searchValue", required=false, defaultValue="") String searchValue
									,@RequestParam(name="searchKey2",defaultValue="") String searchKey2
									,@RequestParam(name="searchCateName", required = false, defaultValue = "") String searchCateName
									,@RequestParam(name="firstDate", required = false, defaultValue = "") String firstDate
									,@RequestParam(name="lastDate", required = false, defaultValue = "") String lastDate
									,Model model) {
		
		if("boardTitle".equals(searchKey)) {
			searchKey = "board_title";
		}else if("boardContent".equals(searchKey)) {
			searchKey = "board_content";
		}else if("boardTag".equals(searchKey)) {
			searchKey = "board_tag";
		}else if("userId".equals(searchKey)){
			searchKey = "u.user_id";
		}
		
		if("categoryName".equals(searchKey2)) {
			searchKey2 = "category_name";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchKey2", searchKey2);
		paramMap.put("searchCateName", searchCateName);
		paramMap.put("firstDate", firstDate);
		paramMap.put("lastDate", lastDate);
		
		List<Board> boardList = boardService.getBoardListSearch(paramMap);
		
		model.addAttribute("title", "게시물 검색");
		model.addAttribute("boardList", boardList);
		
		return "/admin/board/boardList";
	}
	
	//댓글 조회
	@GetMapping("/boardComment")
	public String getBoardCommentList(Model model) {
		List<BoardComment> boardCommentList = boardService.getBoardCommentListSearch(null);
		model.addAttribute("title", "댓글 목록");
		model.addAttribute("boardCommentList", boardCommentList);
		return "admin/board/boardComment";
	}
	
	//댓글 목록 검색
	@PostMapping("/boardComment")
	public String getBoardCommentListSearch(@RequestParam(name="searchKey", defaultValue="commentContent") String searchKey
											,@RequestParam(name="searchValue", required=false, defaultValue="") String searchValue
											,@RequestParam(name="searchKey2",defaultValue="") String searchKey2
											,@RequestParam(name="searchCateName", required = false, defaultValue = "") String searchCateName
											,@RequestParam(name="firstDate", required = false, defaultValue = "") String firstDate
											,@RequestParam(name="lastDate", required = false, defaultValue = "") String lastDate
											,Model model) {
		
		if("commentContent".equals(searchKey)) {
			searchKey = "comment_content";
		}else if("userId".equals(searchKey)) {
			searchKey = "u.user_id";
		}
		
		if("categoryName".equals(searchKey2)) {
			searchKey2 = "category_name";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchKey2", searchKey2);
		paramMap.put("searchCateName", searchCateName);
		paramMap.put("firstDate", firstDate);
		paramMap.put("lastDate", lastDate);
		
		List<BoardComment> boardCommentList = boardService.getBoardCommentListSearch(paramMap);
		
		model.addAttribute("title", "댓글 검색");
		model.addAttribute("boardCommentList", boardCommentList);
		
		return "/admin/board/boardComment";
	}
	
	//좋아요 조회
	@GetMapping("/boardLike")
	public String getBoardLikeList(Model model) {
		List<BoardLike> boardLikeList = boardService.getBoardLikeListSearch(null);
		model.addAttribute("title", "좋아요 목록");
		model.addAttribute("boardLikeList", boardLikeList);
		return "admin/board/boardLike";
	}
	
	//좋아요 검색
	@PostMapping("/boardLike")
	public String getBoardLikeListSearch(@RequestParam(name="searchKey", defaultValue="userId") String searchKey
							  			,@RequestParam(name="searchValue", required=false, defaultValue="") String searchValue
							  			,@RequestParam(name="searchKey2",defaultValue="") String searchKey2
							  			,@RequestParam(name="searchCateName", required = false, defaultValue = "") String searchCateName
							  			,@RequestParam(name="firstDate", required = false, defaultValue = "") String firstDate
										,@RequestParam(name="lastDate", required = false, defaultValue = "") String lastDate
							  			,Model model) {
		
		if("userId".equals(searchKey)) {
			searchKey = "u.user_id";
		}
		
		if("categoryName".equals(searchKey2)) {
			searchKey2 = "category_name";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("searchKey2", searchKey2);
		paramMap.put("searchCateName", searchCateName);
		paramMap.put("firstDate", firstDate);
		paramMap.put("lastDate", lastDate);
		
		List<BoardLike> boardLikeList = boardService.getBoardLikeListSearch(paramMap);
		
		model.addAttribute("title", "좋아요 검색");
		model.addAttribute("boardLikeList", boardLikeList);
		
		return "/admin/board/boardLike";
	}	
}