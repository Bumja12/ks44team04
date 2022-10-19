package ks44team04.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.Right;
import ks44team04.dto.User;
import ks44team04.service.UserService;

@Controller
@RequestMapping("/user/user")
public class UserUserController {
	private final Logger log = LoggerFactory.getLogger(getClass());

	private UserService userService;
	
	public UserUserController(UserService userService) { this.userService =
	userService; }
	
	
	//마이페이지 화면
	@GetMapping("/myPage")
	public String myPage(Model model) {
		
		model.addAttribute("title", "마이페이지");
			
		return"user/user/myPage";
	}
	
	//구매자 or 판매자 선택 화면
	@GetMapping("/chooseRight")
	public String chooseRight(Model model) {
		
		model.addAttribute("title", "가입유형선택");
		
		return"user/user/chooseRight";
	}
	
	//회원가입 쿼리실행
	@PostMapping("/addUser")
    public String addUser(User user) {
		log.info("사용자가 입력한 회원의 정보 ::: {}", user);
        System.out.println("사용자가 입력한 회원의 정보 -> " + user);
        userService.addUser(user);
        
        return "redirect:/user";
    }
	
	//회원 정보 수정
	@PostMapping("/modifyUser")
	public String modifyUser(User user) {
		
		log.info("회원정보 수정 정보 ::: {}", user);
		userService.modifyUser(user);
		
		return "redirect:/user/user/myPage";
	}
	
	//회원 정보 수정(저장된 정보 가져오기)
	@GetMapping("/modifyUser")
	public String modifyUser(@RequestParam(value="userId", required = false) String userId
							  ,Model model) {
        User userInfo = userService.getUserInfoById(userId);
        log.info("회원정보 ::: {}",userInfo);
        
		model.addAttribute("title", "회원정보수정");
		model.addAttribute("userInfo", userInfo);
		
		return "user/user/modifyUser";
	}
	
	//회원가입 화면
	@GetMapping("/signUp")
	public String signUp(Model model, @RequestParam("userRight") String userRight) {
		
		model.addAttribute("title", "회원가입");
		model.addAttribute("userRight", userRight);
		
		
		return"user/user/signUp";
	}
	
    @GetMapping("/login")
    public String login(Model model, @RequestParam(value = "loginFailed", required = false) String loginFailed) {
        model.addAttribute("loginFailed", loginFailed);
        return "user/user/login";
    }

    @PostMapping("/login")
    public String userLogin(@RequestParam("userId") String userId , @RequestParam("userPw") String userPw,
                            HttpSession session, RedirectAttributes loginReAttr){

        String result = userService.userLogin(userId);

        if(userPw.equals(result)) {
            User loginUserInfo = userService.getLoginUserInfo(userId);
            session.setAttribute("SID", userId);
            session.setAttribute("SNAME", loginUserInfo.getUserName());
            session.setAttribute("SRIGHT", loginUserInfo.getUserRight());
            session.setAttribute("SLEVEL", loginUserInfo.getUserLevel());
            log.info("로그인 유저 아이디 {}",loginUserInfo.getUserId());
            return "redirect:/user";
        }
        loginReAttr.addAttribute("loginFailed", "로그인에 실패했습니다.");

        return "redirect:/user/user/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/user";
    }
    

}