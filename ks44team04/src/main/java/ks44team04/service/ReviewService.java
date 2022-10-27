package ks44team04.service;



import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.dto.Review;
import ks44team04.dto.ReviewComment;
import ks44team04.dto.ReviewLike;
import ks44team04.mapper.ReviewMapper;


@Service
public class ReviewService {
	
	
	private static final Logger log = LoggerFactory.getLogger(ReviewService.class);


	//의존성 주입
	public final ReviewMapper reviewMapper;
	
	public ReviewService(ReviewMapper reviewMapper) {
		this.reviewMapper = reviewMapper;
	}
	
	//후기 목록 -관
	public List<Review> reviewList(){
		List<Review> reviewList = reviewMapper.reviewList();
		log.info("후기 목록");
		
		return reviewList;
	}
	
	//후기 등록  -관
	public void reviewAdd(Review review){
		reviewMapper.reviewAdd(review);
	}
	
	//후기 등록  코드 증가  -관
	public String getReviewListCode() {
		String getReviewListCode = reviewMapper.getReviewListCode();
		return getReviewListCode;
	}
	
	//후기 목록 삭제  -관
	 public void reviewListDelete(Review review) {
	    	reviewMapper.reviewListDelete(review);
	    }
	
	//후기 목록 댓글 목록 동시 삭제 -관
    public void reviewListCommentDelete(ReviewComment reviewComment) {
    	reviewMapper.reviewListCommentDelete(reviewComment);
    }
    
	//후기 검색 -관
    public List<Review> reviewSerchList(Map<String, Object> paramMap){
    	List<Review> reviewList = reviewMapper.reviewSerchList(paramMap);
    	return reviewList;
    }

    //후기 추천 -유
    public void reviewLike(ReviewLike reviewLike) {
    	int result = reviewMapper.reviewLike(reviewLike);
    	 log.info("추천 추가 :" + result);
    }
    
    //후기 추천 해제-유
    public void reviewLikeDelete(ReviewLike reviewLike) {
    	int result = reviewMapper.reviewLikeDelete(reviewLike);
    	log.info("추천 해제 :" + result);
    }
    
    //후기 등록 코드 증가 -유
    public String ReviewLikeCode() {
    	String ReviewLikeCode = reviewMapper.ReviewLikeCode();
    	return ReviewLikeCode;
    }
    
    //후기 추천수 업데이트  -유
    public void reviewLikeUp(Review review) {
    	reviewMapper.reviewLikeUp(review);
    }

    //후기 댓글 목록 -관
    public List<ReviewComment> reviewComment(){
    	List<ReviewComment> reviewComment = reviewMapper.reviewComment();
    	
    	return reviewComment;
    	
    }
    
    //후기 댓글 목록 검색 -관
    public List<ReviewComment> reviewCommentSaerch(Map<String, Object> paramMap){
    	List<ReviewComment> ReviewCommentSaerch = reviewMapper.reviewCommentSaerch(paramMap);
    	return ReviewCommentSaerch;
    }
    
    //후기 댓글 목록 삭제 -관
    public void reviewCommentDelete(ReviewComment reviewComment) {
    	reviewMapper.reviewCommentDelete(reviewComment);
    }
    
  //후기 댓글 특정 목록
    /*
     * public ReviewComment reviewCommnetList(String reviewList) { ReviewComment
     * reviewCommnetList = reviewMapper.reviewCommnetList(reviewList); return
     * reviewCommnetList; }
     */
       //입고등록 모달 - 특정 상품코드 조회
       public List<Map<String, Object>> reviewCommnetList(String reviewList){

          return reviewMapper.reviewCommnetList(reviewList);
       }
  
}
