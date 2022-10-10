package ks44team04.admin.controller;

import ks44team04.service.UserService;
import ks44team04.dto.Seller;
import ks44team04.dto.Dormant;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.Leave;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.Login;
import ks44team04.dto.Right;
import ks44team04.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class UserController {

    private UserService userService;
    private final Logger log = LoggerFactory.getLogger(getClass());

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //판매자 가입
    @PostMapping("/user/addSeller")
    public String addSeller(Seller seller) {
    	log.info("사용자가 입력한 판매자의 정보 ::: {}", seller);
    	System.out.println("사용자가 입력한 판매자의 정보 -> " + seller);
    	userService.addSeller(seller);
    	return "redirect:/admin/user/sellerList";
    }
    
	//판매자 가입 쿼리 실행
	@GetMapping("/user/addSeller")
	public String addSellerForm(@RequestParam(value="userId", required = false) String userId
								,Model model) {
        User userInfo = userService.getUserInfoById(userId);
        log.info("회원정보 ::: {}",userInfo);
        List<GoodsLargeCategory> goodsLargeCategory = userService.getGoodsLargeCategory();
        model.addAttribute("title", "판매자등록");
		model.addAttribute("userInfo", userInfo);
		model.addAttribute("goodsLargeCategory", goodsLargeCategory);
		return "admin/user/addSeller";
	}
	
	// 10/10 판매자 이메일 중복체크
	@GetMapping("/user/emailCheckS")
	@ResponseBody
	public int emailCheckS(@RequestParam(name="storeEmail") String storeEmail) {
		int cnt = userService.emailCheckS(storeEmail);
		
		return cnt;
	}
	
	// 10/10 판매자 휴대폰번호 중복체크
	@GetMapping("/user/phoneCheckS")
	@ResponseBody
	public int phoneCheckS(@RequestParam(name="storePhone") String storePhone) {
		int cnt = userService.phoneCheckS(storePhone);
		
		return cnt;
	}
	
	// 10/10 판매자 상호명 중복체크
	@GetMapping("/user/storeNameCheck")
	@ResponseBody
	public int storeNameCheck(@RequestParam(name="storeName") String storeName) {
		int cnt = userService.storeNameCheck(storeName);
		
		return cnt;
	}
	
	// 10/10 판매자코드 중복체크
	@GetMapping("/user/codeCheck")
	@ResponseBody
	public int codeCheck(@RequestParam(name="sellerCode") String sellerCode) {
		int cnt = userService.codeCheck(sellerCode);
		
		return cnt;
	}
    
	// 10/8 회원 휴대폰번호 중복체크
	@GetMapping("/user/phoneCheckU")
	@ResponseBody
	public int phoneCheckU(@RequestParam(name="userPhone") String userPhone) {
		int cnt = userService.phoneCheckU(userPhone);
		
		return cnt;
	}
	
	// 10/8 회원 이메일 중복체크
	@GetMapping("/user/emailCheckU")
	@ResponseBody
	public int emailCheckU(@RequestParam(name="userEmail") String userEmail) {
		int cnt = userService.emailCheckU(userEmail);
		
		return cnt;
	}
	
	// 10/8 회원 닉네임 중복체크
	@GetMapping("/user/nicknameCheck")
	@ResponseBody
	public int nicknameCheck(@RequestParam(name="userNickname") String userNickname) {
		int cnt = userService.nicknameCheck(userNickname);
		
		return cnt;
	}
	
	// 10/8 회원 아이디 중복체크
	@GetMapping("/user/idCheck")
	@ResponseBody
	public int idCheck(@RequestParam(name="userId") String userId) {
		int cnt = userService.idCheck(userId);
		
		return cnt;
	}
	
	//구매자 회원가입
	@PostMapping("/user/addUser")
    public String addUser(User user) {
		log.info("사용자가 입력한 회원의 정보 ::: {}", user);
        System.out.println("사용자가 입력한 회원의 정보 -> " + user);
        userService.addUser(user);
        
        return "redirect:/admin/user/userList";
    }
	
	//구매자 회원가입 쿼리 실행
	@GetMapping("/user/addUser")
	public String addUserForm(Model model) {
		
		List<LevelBuyerCategory> levelBuyer = userService.getLevelBuyer();
        log.info("구매자 레벨 ::: {}",levelBuyer);
		List<Right> rightList = userService.getRightList();
		log.info("권한 ::: {}",rightList);
		
		model.addAttribute("title", "회원등록");
		model.addAttribute("levelBuyer", levelBuyer);
		model.addAttribute("rightList", rightList);
		
		return "admin/user/addUser";
	}
	
	//회원 수정
	@PostMapping("/user/modifyUser")
	public String modifyUser(User user) {
		
		log.info("회원정보 수정 정보 ::: {}", user);
		userService.modifyUser(user);
		
		return "redirect:/admin/user/userList";
	}
	
	//회원수정(저장된 정보 가져오기)
	@GetMapping("/user/modifyUser")
	public String modifyUser(@RequestParam(value="userId", required = false) String userId
							  ,Model model) {
        User userInfo = userService.getUserInfoById(userId);
        log.info("회원정보 ::: {}",userInfo);
        List<LevelBuyerCategory> levelBuyer = userService.getLevelBuyer();
        List<Right> rightList = userService.getRightList();
        
		model.addAttribute("title", "회원정보수정");
		model.addAttribute("userInfo", userInfo);
		model.addAttribute("levelBuyer", levelBuyer);
		model.addAttribute("rightList", rightList);
		
		return "admin/user/modifyUser";
	}
	
	//특정 판매자 상세정보 조회
	@GetMapping("/user/sellerDetail")
	public String sellerDetail(@RequestParam(value="sellerId", required = false) String sellerId
							   ,Model model) {
        Seller userInfoS = userService.getUserInfoByIdS(sellerId);
        log.info("회원 상세정보 조회(판매자만) ::: {}",userInfoS);
        Seller sellerInfo = userService.getSellerInfoById(sellerId);
        log.info("판매자 상세정보 조회 ::: {}",sellerInfo);
        List<Goods> goodsList = userService.getGoodsList(sellerId);
        log.info("판매자 판매상품 목록 ::: {}",goodsList);
        
		model.addAttribute("title", "판매자 상세정보");
		model.addAttribute("userInfoS", userInfoS);
		model.addAttribute("sellerInfo", sellerInfo);
		model.addAttribute("goodsList", goodsList);
		
		return "admin/user/sellerDetail";
	}
	
	//특정 회원 상세정보
	@GetMapping("/user/userDetail")
	public String userDetail(@RequestParam(value="userId", required = false) String userId
							  ,Model model) {
        User userInfo = userService.getUserInfoById(userId);
        
        String userLevel = userInfo.getUserLevel();
        LevelBuyerCategory levelBuyer = userInfo.getLevelBuyer();
        LevelSellerCategory levelSeller = userInfo.getLevelSeller();
        if(userLevel.contains("Buyer")) {
        	userInfo.setUserLevel(levelBuyer.getLevelName());
        }else if(userLevel.contains("Seller")) {
        	userInfo.setUserLevel(levelSeller.getLevelName());
        }else if(userLevel.equals("")) {
        	userInfo.setUserLevel("없음");
        }
        
        log.info("로그 목록 ::: {}",userInfo);
		model.addAttribute("title", "회원상세정보");
		model.addAttribute("userInfo", userInfo);
		
		return "admin/user/userDetail";
	}
	
	//로그 목록
	@GetMapping("/user/loginList")
	public String getLoginList(Model model) {
		List<Login> loginList = userService.getLoginList();
		log.info("로그 목록 ::: {}", loginList);
		model.addAttribute("loginList", loginList);
		model.addAttribute("title", "로그조회");
		
		return "admin/user/loginList";
	}
	
	@GetMapping("/user/leaveList")
	public String getLeaveList(Model model) {
		List<Leave> leaveList = userService.getLeaveList();
		log.info("탈퇴회원 목록 ::: {}", leaveList);
		model.addAttribute("leaveList", leaveList);
		model.addAttribute("title", "탈퇴회원목록");
		
		return "admin/user/leaveList";
	}
	
	@GetMapping("/user/dormantList")
	public String getDormantList(Model model) {
		List<Dormant> dormantList = userService.getDormantList();
		log.info("휴면회원 목록 ::: {}", dormantList);
		model.addAttribute("sellerList", dormantList);
		model.addAttribute("title", "휴면회원목록");
		
		return "admin/user/dormantList";
	}
	
	@GetMapping("/user/sellerList")
	public String getSellerList(Model model) {
		List<Seller> sellerList = userService.getSellerList();
		log.info("판매자 목록 ::: {}", sellerList);
		List<Seller> sellerListY = sellerList.stream()
											 .filter(t -> StringUtils.equals("Y", t.getApproveCheck()))
											 .collect(Collectors.toList());
		List<Seller> sellerListN = sellerList.stream()
											 .filter(t -> StringUtils.equals("N", t.getApproveCheck()))
											 .collect(Collectors.toList());
		
		log.info("판매자 목록 Y ::: {}", sellerListY);
		log.info("판매자 목록 N ::: {}", sellerListN);
		
		model.addAttribute("sellerListY", sellerListY);
		model.addAttribute("sellerListN", sellerListN);
		model.addAttribute("title", "판매자목록");
		
		return "admin/user/sellerList";
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
