package ks44team04.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.Review;
import ks44team04.dto.ReviewComment;
import ks44team04.dto.ReviewLike;


@Mapper
public interface ReviewMapper {

    //후기 목록 -관
	public List<Review> reviewList();
	
	//후기 등록-관
	public int reviewAdd(Review review);
	
	//후기 등록 코드 증가 -관
	public String getReviewListCode();
	
	//후기 검색 - 관
	public List<Review> reviewSerchList(Map<String, Object> searchMap);
	
	//후기 삭제(관리자)
	public int reviewListDelete(Review review);
	
	//후기 삭제시 댓글 삭제 -관
	public int reviewListCommentDelete(ReviewComment reviewComment);
	
	//후기 추천 -유
	public int reviewLike(ReviewLike reviewLike);
	
	//후기 추천 해제 - 유
	public int reviewLikeDelete(ReviewLike reviewLike);
	
	//후기 추천수 코드 증가 -유
	public String ReviewLikeCode();
	
	//후기 추천수 증가(Update) - 유
	public int reviewLikeUp(Review review);

	//후기 댓글 목록 - 관
	public List<ReviewComment> reviewComment();
	
	//후기 댓글 목록 검색 - 관
	public List<ReviewComment> reviewCommentSaerch(Map<String, Object> searchMap);
	
	//후기 댓글 목록 삭제 - 관
	public int reviewCommentDelete(ReviewComment reviewComment);
	
	//후기 댓글 특정 댓글 목록 - 유 
	public ReviewComment reviewCommnetList(String reviewList);
	
}
