package ks44team04.dto;

public class OrderExchange {

    private String exchangeAskCode;
    private String orderDetailCode;
    private String buyerId;
    private String postInfo;
    private String exchangeAskDate;
    private String exchangeReason;
    private String approveCheck;
    private String approveDate;

    public String getExchangeAskCode() {
        return exchangeAskCode;
    }

    public void setExchangeAskCode(String exchangeAskCode) {
        this.exchangeAskCode = exchangeAskCode;
    }

    public String getOrderDetailCode() {
        return orderDetailCode;
    }

    public void setOrderDetailCode(String orderDetailCode) {
        this.orderDetailCode = orderDetailCode;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(String postInfo) {
        this.postInfo = postInfo;
    }

    public String getExchangeAskDate() {
        return exchangeAskDate;
    }

    public void setExchangeAskDate(String exchangeAskDate) {
        this.exchangeAskDate = exchangeAskDate;
    }

    public String getExchangeReason() {
        return exchangeReason;
    }

    public void setExchangeReason(String exchangeReason) {
        this.exchangeReason = exchangeReason;
    }

    public String getApproveCheck() {
        return approveCheck;
    }

    public void setApproveCheck(String approveCheck) {
        this.approveCheck = approveCheck;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    @Override
    public String toString() {
        return "OrderExchange{" +
                "exchangeAskCode='" + exchangeAskCode + '\'' +
                ", orderDetailCode='" + orderDetailCode + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", postInfo='" + postInfo + '\'' +
                ", exchangeAskDate='" + exchangeAskDate + '\'' +
                ", exchangeReason='" + exchangeReason + '\'' +
                ", approveCheck='" + approveCheck + '\'' +
                ", approveDate='" + approveDate + '\'' +
                '}';
    }
}
