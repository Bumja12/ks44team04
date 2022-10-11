package ks44team04.dto;

public class ReviewLike {

    private String reviewLike;
    private String reviewList;
    private String userId;
    private String likeRegDate;
    
	public String getReviewLike() {
		return reviewLike;
	}
	public void setReviewLike(String reviewLike) {
		this.reviewLike = reviewLike;
	}
	public String getReviewList() {
		return reviewList;
	}
	public void setReviewList(String reviewList) {
		this.reviewList = reviewList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLikeRegDate() {
		return likeRegDate;
	}
	public void setLikeRegDate(String likeRegDate) {
		this.likeRegDate = likeRegDate;
	}
	
	@Override
	public String toString() {
		return "ReviewLike [reviewLike=" + reviewLike + ", reviewList=" + reviewList + ", userId=" + userId
				+ ", likeRegDate=" + likeRegDate + "]";
	}
    
  
}
