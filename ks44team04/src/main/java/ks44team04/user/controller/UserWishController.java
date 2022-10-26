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
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team04.dto.Wishlist;
import ks44team04.service.UserService;
import ks44team04.service.WishService;
import ks44team04.util.CodeIndex;

@Controller
@RequestMapping("/user")
public class UserWishController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    
    //의존성 주입
  	private WishService wishService;
  	//유저 권한 확인 서비스 
  	//private UserService userService;
	public UserWishController(WishService wishService, UserService userService) {
		this.wishService = wishService;
	//	this.userService = userService;
	}

	//관심 상품 
    @GetMapping("/wishlist")
    public String getWishlist(Model model, HttpSession session) {
    	
    	String userId = (String) session.getAttribute("SID");
    	
    	List<Wishlist> wishlist = wishService.getWishlist(userId);
    	log.info("찜 리스트 ::: {}", wishlist);
    	
    	model.addAttribute("title", "찜");
		model.addAttribute("wishlist", wishlist);
        return "user/goods/wishlist";
    }
    
    //찜 추가
    @PostMapping("/wishAdd")
    @ResponseBody
    public int wishAdd(Wishlist wishlist, HttpSession session) {
    	
    	String userId = (String) session.getAttribute("SID");
    	
    	//wishNewCode 생성
    	String wishNewCode = wishService.wishNewCode(userId);
    	wishNewCode = CodeIndex.codeIndex(wishNewCode, 4);
    	log.info("찜 증가 코드 :::{}" , wishNewCode);
    	
    	wishlist.setWishCode(wishNewCode);
    	wishlist.setBuyerId(userId);

    	//만약 찜 목록에 같은 상품코드가 있을 시 추가 안 하기
    	if(wishService.wishCheck(wishlist) > 0) {
    		return 2;
    	}
    	wishService.wishAdd(wishlist);
    	log.info("찜 추가 정보 ::: {}", wishlist);

    	return 1;
    }
    
	//찜 삭제
	@GetMapping("/wishRemove")
    @ResponseBody
	public String wishRemove(Wishlist wishlist, HttpSession session) {
		
		String userId = (String) session.getAttribute("SID");
		
		wishlist.setBuyerId(userId);
		
		wishService.wishRemove(wishlist);
		log.info("사용자가 삭제한 장바구니 정보 ::: {}", wishlist);
		
		return "redirect:";
	}
    
}