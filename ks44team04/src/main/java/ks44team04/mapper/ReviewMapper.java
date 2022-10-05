package ks44team04.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.Review;
import ks44team04.dto.ReviewComment;


@Mapper
public interface ReviewMapper {

    //후기 목록 
	public List<Review> reviewList();
	
	//후기 검색
	public List<Review> reviewSerchList(Map<String, Object> searchMap);
	
	//후기 댓글 목록 
	public List<ReviewComment> reviewComment();
}
