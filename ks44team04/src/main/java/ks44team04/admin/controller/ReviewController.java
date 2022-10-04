package ks44team04.admin.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks44team04.dto.Review;
import ks44team04.service.ReviewService;


@Controller
@RequestMapping("/admin")
public class ReviewController {
	
	
	public ReviewService reviewService;
	

	public ReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	@GetMapping("/review/reviewList")
	public String reviewList(Model model) {
		List<Review> reviewList = reviewService.reviewList();
		
		
		model.addAttribute("title", "리뷰리스트");
		model.addAttribute("reviewList", reviewList);
		return "admin/review/reviewList";
	}

}
