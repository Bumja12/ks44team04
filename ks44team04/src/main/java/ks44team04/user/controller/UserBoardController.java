package ks44team04.user.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team04.dto.Board;
import ks44team04.dto.BoardComment;
import ks44team04.service.BoardService;
import ks44team04.util.CodeIndex;

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
    	
        List<Board> boardListUser = boardService.BoardListUser("boardCategory002");
        log.info("조회된 자유게시판 리스트 ::: {}", boardListUser);
        
		model.addAttribute("title", "자유게시판");
        model.addAttribute("boardListUser", boardListUser);
        
        return "user/board/boardFree";
    }
	
    //게시물 보기
    @GetMapping("/boardView")
    public String boardByCode(@RequestParam(value="boardCode", required = false) String boardCode
							  ,Board board ,Model model) {
    	
    	boardService.viewCount(boardCode); //조회수 증가
    	Board boardInfo = boardService.boardByCode(boardCode); //해당 코드 게시물 보기
    	
    	log.info("게시물 상세정보 ::: {}",boardInfo);
    	
		model.addAttribute("title", "게시물 보기");
		model.addAttribute("boardInfo", boardInfo);
    	
    	return "user/board/boardView";
    }
    
	//게시물 등록 
	@GetMapping("/boardAdd")
	public String boardAdd(@RequestHeader(value = "Referer") String referer ,Model model){
		
		if(referer != null) {
			if(referer.contains("boardFree")) {
				model.addAttribute("boardCategory", "boardCategory002");
			} else if (referer.contains("boardFarm")) {
				model.addAttribute("boardCategory", "boardCategory003");
			} else if (referer.contains("boardRecipe")) {
				model.addAttribute("boardCategory", "boardCategory001");
			}
		}
		
		model.addAttribute("title", "게시물 등록");
	    
		return "user/board/boardAdd";
	}
	
	//게시물 등록 
	@PostMapping("/boardAdd")
	public String boardAdd(Board board, HttpSession session){
		String userId = (String) session.getAttribute("SID");
		
		String boardNewCode = boardService.getBoardNewCode();
		boardNewCode = CodeIndex.codeIndex(boardNewCode, 5);
		
		log.info("게시물 코드 증가 :::{}" , boardNewCode);
		board.setBoardCode(boardNewCode);
		board.setUserId(userId);
		
		boardService.boardAdd(board);
		
		return "redirect:/user/board/boardFree";
	}
  
	//댓글 등록
	@PostMapping("/commentAdd")
    @ResponseBody
	public String boardAdd(BoardComment boardComment, HttpSession session
						   //@RequestHeader(value = "boardCode") String boardCode,
						   //@RequestHeader(value = "commentContent") String commentContent
						   ){
		
		log.info("댓글 등록 정보 ::: {}", boardComment);
		String userId = (String) session.getAttribute("SID");
		
		//commentNewCode 생성
		String commentNewCode = boardService.getCommentNewCode();
    	if(commentNewCode == null) {
    		commentNewCode = "comment001";
    	} else {
    		commentNewCode = CodeIndex.codeIndex(commentNewCode, 12);
    	}
		
		log.info("댓글 코드 증가 :::{}" , commentNewCode);
		boardComment.setBoardComment(commentNewCode);
		boardComment.setUserId(userId);
		
		boardService.commentAdd(boardComment);
		
		return "123";
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