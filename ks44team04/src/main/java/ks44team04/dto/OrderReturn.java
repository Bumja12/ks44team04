package ks44team04.dto;

public class OrderReturn {

    private String orderReturnCode;
    private String orderDetailCode;
    private String buyerId;
    private String returnAskDate;
    private String returnReason;
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

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
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
                ", buyerId='" + buyerId + '\'' +
                ", returnAskDate='" + returnAskDate + '\'' +
                ", returnReason='" + returnReason + '\'' +
                ", permitDate='" + permitDate + '\'' +
                ", postCompany='" + postCompany + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                '}';
    }
}
