package ks44team04.dto;

public class AccountPayment {

    private String accountPaymentCode;
    private String refundBank;
    private String refundAccount;
    private int approvePrice;
    private String approveDate;

    public String getAccountPaymentCode() {
        return accountPaymentCode;
    }

    public void setAccountPaymentCode(String accountPaymentCode) {
        this.accountPaymentCode = accountPaymentCode;
    }

    public String getRefundBank() {
        return refundBank;
    }

    public void setRefundBank(String refundBank) {
        this.refundBank = refundBank;
    }

    public String getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount;
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
        return "AccountPayment{" +
                "accountPaymentCode='" + accountPaymentCode + '\'' +
                ", refundBank='" + refundBank + '\'' +
                ", refundAccount='" + refundAccount + '\'' +
                ", approvePrice=" + approvePrice +
                ", approveDate='" + approveDate + '\'' +
                '}';
    }
}
