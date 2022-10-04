package ks44team04.service;



import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.dto.Review;
import ks44team04.mapper.ReviewMapper;


@Service
public class ReviewService {
	
	
	private static final Logger log = LoggerFactory.getLogger(ReviewService.class);


	//의존성 주입
	public final ReviewMapper reviewMapper;
	
	public ReviewService(ReviewMapper reviewMapper) {
		this.reviewMapper = reviewMapper;
	}
	
	//리뷰 리스트
	public List<Review> reviewList(){
		List<Review> reviewList = reviewMapper.reviewList();
		log.info("리뷰 리스트");
		
		return reviewList;
	}
	
	//리뷰 검색
    public List<Review> reviewSerchList(Map<String, Object> paramMap){
    	List<Review> reviewList = reviewMapper.reviewSerchList(paramMap);
    	return reviewList;
    }
	
	
}
