package ks44team04.admin.controller;

import ks44team04.admin.service.UserService;
import ks44team04.dto.Right;
import ks44team04.dto.Report;

import ks44team04.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class UserController {

    private UserService userService;
    private final Logger log = LoggerFactory.getLogger(getClass());

    public UserController(UserService userService) {
        this.userService = userService;
    }

    
	@PostMapping("/user/addUser")
    public String addUser(User user) {
		
		log.info("사용자가 입력한 회원의 정보 ::: {}", user);
		
        System.out.println("사용자가 입력한 회원의 정보 -> " + user);
        userService.addUser(user);
        
        return "redirect:/admin/user/userList";
    }
	
	@GetMapping("/user/addUser")
	public String addUserForm(Model model) {
		
		List<Right> RightList = userService.getRightList();
		model.addAttribute("title", "회원가입");
		model.addAttribute("RightList", RightList);
		
		return "admin/user/addUser";
	}
    
	@GetMapping("/user/userList")
	public String getUserList(Model model) {
		List<User> userList = userService.getUserList();
		log.info("회원의 목록 ::: {}", userList);
		model.addAttribute("userList", userList);
		model.addAttribute("title", "회원목록");
		
		return "admin/user/userList";
	}
    
    @GetMapping("/login")
    public String login(Model model, @RequestParam(value = "loginFailed", required = false) String loginFailed) {
        model.addAttribute("loginFailed", loginFailed);
        return "admin/login";
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
            log.info("로그인 유저 아이디 {}",loginUserInfo.getUserId());
            return "redirect:/admin";
        }

        loginReAttr.addAttribute("loginFailed", "로그인에 실패했습니다.");

        return "redirect:/admin/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/admin";
    }
    
  
}
