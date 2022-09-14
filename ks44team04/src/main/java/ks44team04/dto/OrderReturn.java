package ks44team04.dto;

public class OrderReturn {

    private String orderReturnCode;
    private String orderDetailCode;
    private String paymentCode;
    private String buyerId;
    private String returnAskDate;
    private String cancelReason;
    private String permitDate;
    private String postCompany;
    private String invoiceNumber;

    public String getOrderReturnCode() {
        return orderReturnCode;
    }

    public void setOrderReturnCode(String orderReturnCode) {
        this.orderReturnCode = orderReturnCode;
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

    public String getReturnAskDate() {
        return returnAskDate;
    }

    public void setReturnAskDate(String returnAskDate) {
        this.returnAskDate = returnAskDate;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getPermitDate() {
        return permitDate;
    }

    public void setPermitDate(String permitDate) {
        this.permitDate = permitDate;
    }

    public String getPostCompany() {
        return postCompany;
    }

    public void setPostCompany(String postCompany) {
        this.postCompany = postCompany;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String toString() {
        return "OrderReturn{" +
                "orderReturnCode='" + orderReturnCode + '\'' +
                ", orderDetailCode='" + orderDetailCode + '\'' +
                ", paymentCode='" + paymentCode + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", returnAskDate='" + returnAskDate + '\'' +
                ", cancelReason='" + cancelReason + '\'' +
                ", permitDate='" + permitDate + '\'' +
                ", postCompany='" + postCompany + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                '}';
    }
}
