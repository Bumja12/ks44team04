package ks44team04.dto;

public class Payment {

    private String paymentCode;
    private String orderNum;
    private String paymentMethod;
    private String paymentGroupCode;

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentGroupCode() {
        return paymentGroupCode;
    }

    public void setPaymentGroupCode(String paymentGroupCode) {
        this.paymentGroupCode = paymentGroupCode;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentCode='" + paymentCode + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentGroupCode='" + paymentGroupCode + '\'' +
                '}';
    }
}
