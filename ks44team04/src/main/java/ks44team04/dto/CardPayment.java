package ks44team04.dto;

public class CardPayment {

    private String cardPaymentCode;
    private String cardCompany;
    private String cardNumber;
    private int approvePrice;
    private String approveDate;

    public String getCardPaymentCode() {
        return cardPaymentCode;
    }

    public void setCardPaymentCode(String cardPaymentCode) {
        this.cardPaymentCode = cardPaymentCode;
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

    public int getApprovePrice() {
        return approvePrice;
    }

    public void setApprovePrice(int approvePrice) {
        this.approvePrice = approvePrice;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    @Override
    public String toString() {
        return "CardPayment{" +
                "cardPaymentCode='" + cardPaymentCode + '\'' +
                ", cardCompany='" + cardCompany + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", approvePrice=" + approvePrice +
                ", approveDate='" + approveDate + '\'' +
                '}';
    }
}
