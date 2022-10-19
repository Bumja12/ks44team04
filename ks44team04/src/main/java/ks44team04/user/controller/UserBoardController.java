package ks44team04.user.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ks44team04.dto.Board;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.service.BoardService;

@Controller
@RequestMapping("/user/board")
public class UserBoardController {
    private final Logger log = LoggerFactory.getLogger(getClass());
	private final BoardService boardService;
	public UserBoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
    //자유게시판
    @GetMapping("/boardFree")
    public String boardFree(Model model, Board board) {
    	
        board.setBoardCategory("boardCategory002");
        
        List<Board> boardListUser = boardService.BoardListUser();
        log.info("조회된 자유게시판 리스트 ::: {}", boardListUser);
        
		model.addAttribute("title", "자유게시판");
        model.addAttribute("boardListUser", boardListUser);
        
        return "user/board/boardFree";
    }
	
	//자유게시판 게시물 등록 
	@GetMapping("/boardAdd")
	public String boardAdd(Model model){
		
		model.addAttribute("title", "게시물 등록");
	    
		return "user/board/boardAdd";
	}
    
    //레시피 게시판 
    @GetMapping("/boardRecipe")
    public String boardRecipe() {
        log.info("boardRecipe 실행");
        return "user/board/boardRecipe";
    }
    
    //농장체험 게시판
    @GetMapping("/boardFarm")
    public String boardFarm() {
        log.info("boardFarm 실행");
        return "user/board/boardFarm";
    }

}