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
	
	//후기 목록
	public List<Review> reviewList(){
		List<Review> reviewList = reviewMapper.reviewList();
		log.info("후기 목록");
		
		return reviewList;
	}
	
	//후기 검색
    public List<Review> reviewSerchList(Map<String, Object> paramMap){
    	List<Review> reviewList = reviewMapper.reviewSerchList(paramMap);
    	return reviewList;
    }

	
    //후기 댓글 목록
    public List<ReviewComment> reviewComment(){
    	List<ReviewComment> reviewComment = reviewMapper.reviewComment();
    	
    	return reviewComment;
    	
    }
    
    //후기 추천 
    public void reviewLike(ReviewLike reviewLike) {
    	int result = reviewMapper.reviewLike(reviewLike);
    	 log.info("추천 추가 :" + result);
    }
    
    //후기 추천 해제
    public void reviewLikeDelete(ReviewLike reviewLike) {
    	int result = reviewMapper.reviewLikeDelete(reviewLike);
    	log.info("추천 해제 :" + result);
    }
    
  //후기 등록 코드 증가 
    public String ReviewLikeCode() {
    	String ReviewLikeCode = reviewMapper.ReviewLikeCode();
    	return ReviewLikeCode;
    }
    
    
    
	
}
