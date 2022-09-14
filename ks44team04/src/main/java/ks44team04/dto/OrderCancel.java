package ks44team04.dto;

public class OrderCancel {

    private String orderCancelCode;
    private String orderDetailCode;
    private String paymentCode;
    private String buyerId;
    private String cancelAskDate;
    private String cancelReason;
    private String approveDate;

    public String getOrderCancelCode() {
        return orderCancelCode;
    }

    public void setOrderCancelCode(String orderCancelCode) {
        this.orderCancelCode = orderCancelCode;
    }

    public String getOrderDetailCode() {
        return orderDetailCode;
    }

    public void setOrderDetailCode(String orderDetailCode) {
        this.orderDetailCode = orderDetailCode;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getCancelAskDate() {
        return cancelAskDate;
    }

    public void setCancelAskDate(String cancelAskDate) {
        this.cancelAskDate = cancelAskDate;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    @Override
    public String toString() {
        return "OrderCancel{" +
                "orderCancelCode='" + orderCancelCode + '\'' +
                ", orderDetailCode='" + orderDetailCode + '\'' +
                ", paymentCode='" + paymentCode + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", cancelAskDate='" + cancelAskDate + '\'' +
                ", cancelReason='" + cancelReason + '\'' +
                ", approveDate='" + approveDate + '\'' +
                '}';
    }
}
