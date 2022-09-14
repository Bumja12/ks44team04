package ks44team04.dto;

public class AutoPayment {

    private String autoPayment;
    private String buyerId;
    private String cardCompany;
    private String cardNumber;

    public String getAutoPayment() {
        return autoPayment;
    }

    public void setAutoPayment(String autoPayment) {
        this.autoPayment = autoPayment;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getCardCompany() {
        return cardCompany;
    }

    public void setCardCompany(String cardCompany) {
        this.cardCompany = cardCompany;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "AutoPayment{" +
                "autoPayment='" + autoPayment + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", cardCompany='" + cardCompany + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
