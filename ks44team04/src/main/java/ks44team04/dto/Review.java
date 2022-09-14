package ks44team04.dto;

public class Review {

    private String reviewList;
    private String goodsList;
    private String buyerId;
    private String orderDetailCode;
    private String reviewContent;
    private String reviewImg;
    private String reviewRegDate;
    private String reviewUpdateDate;
    private int savePoint;
    private int likeAmount;
    private int grade;

    public String getReviewList() {
        return reviewList;
    }

    public void setReviewList(String reviewList) {
        this.reviewList = reviewList;
    }

    public String getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(String goodsList) {
        this.goodsList = goodsList;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getOrderDetailCode() {
        return orderDetailCode;
    }

    public void setOrderDetailCode(String orderDetailCode) {
        this.orderDetailCode = orderDetailCode;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public String getReviewImg() {
        return reviewImg;
    }

    public void setReviewImg(String reviewImg) {
        this.reviewImg = reviewImg;
    }

    public String getReviewRegDate() {
        return reviewRegDate;
    }

    public void setReviewRegDate(String reviewRegDate) {
        this.reviewRegDate = reviewRegDate;
    }

    public String getReviewUpdateDate() {
        return reviewUpdateDate;
    }

    public void setReviewUpdateDate(String reviewUpdateDate) {
        this.reviewUpdateDate = reviewUpdateDate;
    }

    public int getSavePoint() {
        return savePoint;
    }

    public void setSavePoint(int savePoint) {
        this.savePoint = savePoint;
    }

    public int getLikeAmount() {
        return likeAmount;
    }

    public void setLikeAmount(int likeAmount) {
        this.likeAmount = likeAmount;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewList='" + reviewList + '\'' +
                ", goodsList='" + goodsList + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", orderDetailCode='" + orderDetailCode + '\'' +
                ", reviewContent='" + reviewContent + '\'' +
                ", reviewImg='" + reviewImg + '\'' +
                ", reviewRegDate='" + reviewRegDate + '\'' +
                ", reviewUpdateDate='" + reviewUpdateDate + '\'' +
                ", savePoint=" + savePoint +
                ", likeAmount=" + likeAmount +
                ", grade=" + grade +
                '}';
    }
}
