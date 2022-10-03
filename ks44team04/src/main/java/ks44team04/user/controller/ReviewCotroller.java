package ks44team04.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.service.ReviewService;

@Controller
@RequestMapping("/user")
public class ReviewCotroller {
	
	public ReviewService reviewService;
	

	public ReviewCotroller(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	@GetMapping("/review/review")
	public String review(Model model) {
		
		model.addAttribute("title", "리뷰화면");
		
		return "user/review/review";
	}
    
	@GetMapping("/review/reviewList")
	public String reviewList(Model model) {
		model.addAttribute("title", "리뷰리스트");
		
		return "user/review/reviewList";
	}
}