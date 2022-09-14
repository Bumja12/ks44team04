package ks44team04.dto;

public class RegularPostHistory {

    private String regularPostHistory;
    private String regularPostStatus;
    private String orderNum;
    private String paymentHistoryCode;
    private String postRegDate;

    public String getRegularPostHistory() {
        return regularPostHistory;
    }

    public void setRegularPostHistory(String regularPostHistory) {
        this.regularPostHistory = regularPostHistory;
    }

    public String getRegularPostStatus() {
        return regularPostStatus;
    }

    public void setRegularPostStatus(String regularPostStatus) {
        this.regularPostStatus = regularPostStatus;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getPaymentHistoryCode() {
        return paymentHistoryCode;
    }

    public void setPaymentHistoryCode(String paymentHistoryCode) {
        this.paymentHistoryCode = paymentHistoryCode;
    }

    public String getPostRegDate() {
        return postRegDate;
    }

    public void setPostRegDate(String postRegDate) {
        this.postRegDate = postRegDate;
    }

    @Override
    public String toString() {
        return "RegularPostHistory{" +
                "regularPostHistory='" + regularPostHistory + '\'' +
                ", regularPostStatus='" + regularPostStatus + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", paymentHistoryCode='" + paymentHistoryCode + '\'' +
                ", postRegDate='" + postRegDate + '\'' +
                '}';
    }
}
