package ks44team04.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.Review;


@Mapper
public interface ReviewMapper {

    //리뷰 리스트 
	public List<Review> reviewList();
	
	//리뷰 검색
	public List<Review> reviewSerchList(Map<String, Object> searchMap);
	
	

}
