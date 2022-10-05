package ks44team04.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.dto.Review;
import ks44team04.service.ReviewService;

@Controller
@RequestMapping("/user")
public class UserReviewController {
	
	public ReviewService reviewService;
	

	public UserReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	//리뷰 등록
	@GetMapping("/review/review")
	public String review(Model model) {
		
		model.addAttribute("title", "리뷰등록");
		
		return "user/review/review";
	}
	
    //리뷰 리스트
	@GetMapping("/review/reviewList")
	public String reviewList(Model model) {
		List<Review> reviewList = reviewService.reviewList();
		
		model.addAttribute("title", "리뷰리스트");
		model.addAttribute("reviewList", reviewList);
		
		return "user/review/reviewList";
	}
	


}