package ks44team04.user.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team04.dto.Review;
import ks44team04.dto.ReviewLike;
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

    //후기 목록
	@GetMapping("/review/reviewList")
	public String reviewList( Model model) {
		
		List<Review> reviewList = reviewService.reviewList();
		
		model.addAttribute("title", "리뷰리스트");
		model.addAttribute("reviewList", reviewList);
		
	return "user/review/reviewList";
	}
	
	// 후기 추천 
	@GetMapping("/review/reviewLike")
	@ResponseBody
	public int reviewLike(Review review, ReviewLike reviewLike ) {
		// 코드 증가 
		String ReviewLikeCode = reviewService.ReviewLikeCode();
		ReviewLikeCode = CodeIndex.codeIndex(ReviewLikeCode, 10);
		
		log.info("---------------------------------좋아요 코드값 ", ReviewLikeCode);
		reviewLike.setReviewLike(ReviewLikeCode);
		
		/* review.setLikeAmount(likeAmount); */
		reviewService.reviewLike(reviewLike);
		reviewService.reviewLikeUp(review);
		
		return review.getLikeAmount();	
	}
	
	// 후기 추천 해제 
	@GetMapping("/review/reviewLikeDelete")
	@ResponseBody
	public int reviewLikeDelete(ReviewLike reviewLike, Review review) {
		
		reviewService.reviewLikeDelete(reviewLike);
		reviewService.reviewLikeUp(review);
		
		return review.getLikeAmount();
	}
	
	/*
	 * //후기 댓글 특정 목록
	 * 
	 * @GetMapping("/review/reviewCommentList") public String
	 * reviewCommintList(@RequestParam(value = "reviewList",required = false) String
	 * reviewList, Model model) {
	 * 
	 * ReviewComment reviewCommintList =
	 * reviewService.reviewCommnetList(reviewList);
	 * model.addAttribute("reviewCommintList", reviewCommintList); return null; }
	 */
	//입고등록 모달 - 특정 상품코드 조회

	  @GetMapping("/review/reviewCommentList")
	  @ResponseBody
	  public List<Map<String, Object>>reviewCommnetList(@RequestParam(value="reviewList") String reviewList){

	List<Map<String, Object>> reviewCommnetList = reviewService.reviewCommnetList(reviewList);

	     return reviewCommnetList;
	  }
	
	 


}