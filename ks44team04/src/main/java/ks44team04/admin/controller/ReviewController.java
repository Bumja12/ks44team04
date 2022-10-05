package ks44team04.admin.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team04.dto.Report;
import ks44team04.dto.Review;
import ks44team04.dto.ReviewComment;
import ks44team04.service.ReviewService;


@Controller
@RequestMapping("/admin")
public class ReviewController {
	
	
	public ReviewService reviewService;
	

	public ReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	@PostMapping("/review/reviewList")
	public String reviewSerchList(@RequestParam(name="reportSearchKey")String sk 
								 ,@RequestParam(name="reportSearchValue")String sv
								 , Model model) {
		if("reviewList".equals(sk)) {
			sk= "review_list";
		}else if("goodsList".equals(sk)) {
			sk= "goods_list";
		}else if("buyerId".equals(sk)) {
			sk= "buyer_id";
		}else if("reviewContent".equals(sk)) {
			sk= "review_content";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sk", sk);
		paramMap.put("sv", sv);
		
		List<Review> reviewList = reviewService.reviewSerchList(paramMap);
	
		model.addAttribute("title", "신고리스트");
		model.addAttribute("reviewList", reviewList);
		
		
		return "admin/review/reviewList";
	}
	
	//후기 목록
	@GetMapping("/review/reviewList")
	public String reviewList(Model model) {
		List<Review> reviewList = reviewService.reviewSerchList(null);
	
		model.addAttribute("title", "후기목록");
		model.addAttribute("reviewList", reviewList);
		
		return "admin/review/reviewList";
	}
	
	//후기 댓글 목록
	@GetMapping("/review/reviewComment")
	public String reviewComment(Model model) {
		List<ReviewComment> reviewComment = reviewService.reviewComment();
		model.addAttribute("reviewComment", reviewComment);
		
		return "admin/review/reviewComment";
	}
	
	
}
