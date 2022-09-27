package ks44team04.dto;

public class RegularPostStatus {

    private String regularPostStatusCode;
    private String goodsCode;
    private String buyerId;
    private String postList;
    private String paymentPlan;
    private int orderAmount;
    private String regDate;
    private String modifyDate;
    private String nextPostDate;
    private String status;
    private String postCycle;
    private String postPassCheck;
    private String paymentHistoryCode;

    public String getRegularPostStatusCode() {
        return regularPostStatusCode;
    }

    public void setRegularPostStatusCode(String regularPostStatusCode) {
        this.regularPostStatusCode = regularPostStatusCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getPostList() {
        return postList;
    }

    public void setPostList(String postList) {
        this.postList = postList;
    }

    public String getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
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

    public String getNextPostDate() {
        return nextPostDate;
    }

    public void setNextPostDate(String nextPostDate) {
        this.nextPostDate = nextPostDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPostCycle() {
        return postCycle;
    }

    public void setPostCycle(String postCycle) {
        this.postCycle = postCycle;
    }

    public String getPostPassCheck() {
        return postPassCheck;
    }

    public void setPostPassCheck(String postPassCheck) {
        this.postPassCheck = postPassCheck;
    }

    public String getPaymentHistoryCode() {
        return paymentHistoryCode;
    }

    public void setPaymentHistoryCode(String paymentHistoryCode) {
        this.paymentHistoryCode = paymentHistoryCode;
    }

    @Override
    public String toString() {
        return "RegularPostStatus{" +
                "regularPostStatusCode='" + regularPostStatusCode + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", postList='" + postList + '\'' +
                ", paymentPlan='" + paymentPlan + '\'' +
                ", orderAmount=" + orderAmount +
                ", regDate='" + regDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                ", nextPostDate='" + nextPostDate + '\'' +
                ", status='" + status + '\'' +
                ", postCycle='" + postCycle + '\'' +
                ", postPassCheck='" + postPassCheck + '\'' +
                ", paymentHistoryCode='" + paymentHistoryCode + '\'' +
                '}';
    }
}
