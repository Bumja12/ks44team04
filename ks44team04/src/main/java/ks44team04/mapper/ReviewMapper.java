package ks44team04.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.Review;
import ks44team04.dto.ReviewComment;
import ks44team04.dto.ReviewLike;


@Mapper
public interface ReviewMapper {

    //후기 목록 
	public List<Review> reviewList();
	
	//후기 검색
	public List<Review> reviewSerchList(Map<String, Object> searchMap);
	
	//후기 삭제(관리자)
	public int reviewListDelete(Review review);
	
	//후기 삭제시 댓글 삭제
	public int reviewListCommentDelete(ReviewComment reviewComment);
	
	//후기 추천
	public int reviewLike(ReviewLike reviewLike);
	
	//후기 추천 해제
	public int reviewLikeDelete(ReviewLike reviewLike);
	
	//후기 추천수 코드 증가
	public String ReviewLikeCode();
	
	//후기 추천수 증가(Update)
	public int reviewLikeUp(Review review);

	//후기 댓글 목록 
	public List<ReviewComment> reviewComment();
	
	//후기 댓글 목록 검색
	public List<ReviewComment> reviewCommentSaerch(Map<String, Object> searchMap);
	
	//후기 댓글 목록 삭제 
	public int reviewCommentDelete(ReviewComment reviewComment);
}
