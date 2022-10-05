package ks44team04.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/board")
public class UserBoardController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    
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
    
    //자유게시판
    @GetMapping("/boardFree")
    public String boardFree() {
        log.info("boardFree 실행");
        return "user/board/boardFree";
    }

}