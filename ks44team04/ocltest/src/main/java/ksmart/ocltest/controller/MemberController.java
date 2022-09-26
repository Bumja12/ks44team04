package ksmart.ocltest.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart.ocltest.dto.Member;
import ksmart.ocltest.service.MemberService;

@Controller
public class MemberController {
	
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	private final MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("title", "메인화면");
		return "main";
	}
	
	@GetMapping("/memberList")
	public String getMemberList(Model model
							   ,@RequestParam Map<String, Object> paramMap) {
		
		
		List<Member> memberList = memberService.getMemberList(paramMap);
		
		log.info("========================================");
		log.info("memberList: {}", memberList);
		log.info("========================================");
		//System.out.println("=========================================");
		//System.out.println("memberList : " + memberList);
		//System.out.println("=========================================");
		
		model.addAttribute("title", "회원목록");
		model.addAttribute("memberList", memberList);
		
		return "member/memberList";
	}
}
