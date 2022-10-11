package ks44team04.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team04.dto.Review;
import ks44team04.dto.ReviewLike;
import ks44team04.mapper.ReviewMapper;
import ks44team04.service.ReviewService;
import ks44team04.util.CodeIndex;

@Controller
@RequestMapping("/user")
public class UserReviewController {
	
	public ReviewService reviewService;
	
	private static final Logger log = LoggerFactory.getLogger(UserReviewController.class);

	

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
	
	@GetMapping("/review/reviewLike")
	@ResponseBody
	public String reviewLike(ReviewLike reviewLike) {
		// 코드 증가 
		String ReviewLikeCode = reviewService.ReviewLikeCode();
		ReviewLikeCode = CodeIndex.codeIndex(ReviewLikeCode, 10);
		
		log.info("---------------------------------리뷰 코드값 ", ReviewLikeCode);
		reviewLike.setReviewLike(ReviewLikeCode);
		
		reviewService.reviewLike(reviewLike);
		
		return "user/review/reviewList";	
	}
	
	@GetMapping("/review/reviewLikeDelete")
	public String reviewLikeDelete(ReviewLike reviewLike) {
		
		reviewService.reviewLikeDelete(reviewLike);
		
		return "user/review/reviewList";
	}


}