package ks44team04.service;



import org.springframework.stereotype.Service;

import ks44team04.mapper.ReviewMapper;


@Service
public class ReviewService {
	

	//의존성 주입
	public final ReviewMapper reviewMapper;
	
	public ReviewService(ReviewMapper reviewMapper) {
		this.reviewMapper = reviewMapper;
	}
	
}
