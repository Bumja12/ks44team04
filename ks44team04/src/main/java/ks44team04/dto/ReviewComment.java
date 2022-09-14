package ks44team04.dto;

public class ReviewComment {

    private String reviewCommentList;
    private String reviewList;
    private String userId;
    private String reviewCommentContent;
    private String regDate;
    private String modifyDate;

    public String getReviewCommentList() {
        return reviewCommentList;
    }

    public void setReviewCommentList(String reviewCommentList) {
        this.reviewCommentList = reviewCommentList;
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

    public String getReviewCommentContent() {
        return reviewCommentContent;
    }

    public void setReviewCommentContent(String reviewCommentContent) {
        this.reviewCommentContent = reviewCommentContent;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "ReviewComment{" +
                "reviewCommentList='" + reviewCommentList + '\'' +
                ", reviewList='" + reviewList + '\'' +
                ", userId='" + userId + '\'' +
                ", reviewCommentContent='" + reviewCommentContent + '\'' +
                ", regDate='" + regDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                '}';
    }
}
