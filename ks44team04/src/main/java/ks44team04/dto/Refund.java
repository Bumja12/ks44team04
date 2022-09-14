package ks44team04.dto;

public class Refund {

    private String refundCode;
    private String cancelRefundCheck;
    private String refundGroupCode;
    private String refundMethod;
    private int refundPrice;
    private int totalRefundPrice;
    private String approveCheck;
    private String refundAskDate;
    private String refundApproveDate;

    public String getRefundCode() {
        return refundCode;
    }

    public void setRefundCode(String refundCode) {
        this.refundCode = refundCode;
    }

    public String getCancelRefundCheck() {
        return cancelRefundCheck;
    }

    public void setCancelRefundCheck(String cancelRefundCheck) {
        this.cancelRefundCheck = cancelRefundCheck;
    }

    public String getRefundGroupCode() {
        return refundGroupCode;
    }

    public void setRefundGroupCode(String refundGroupCode) {
        this.refundGroupCode = refundGroupCode;
    }

    public String getRefundMethod() {
        return refundMethod;
    }

    public void setRefundMethod(String refundMethod) {
        this.refundMethod = refundMethod;
    }

    public int getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(int refundPrice) {
        this.refundPrice = refundPrice;
    }

    public int getTotalRefundPrice() {
        return totalRefundPrice;
    }

    public void setTotalRefundPrice(int totalRefundPrice) {
        this.totalRefundPrice = totalRefundPrice;
    }

    public String getApproveCheck() {
        return approveCheck;
    }

    public void setApproveCheck(String approveCheck) {
        this.approveCheck = approveCheck;
    }

    public String getRefundAskDate() {
        return refundAskDate;
    }

    public void setRefundAskDate(String refundAskDate) {
        this.refundAskDate = refundAskDate;
    }

    public String getRefundApproveDate() {
        return refundApproveDate;
    }

    public void setRefundApproveDate(String refundApproveDate) {
        this.refundApproveDate = refundApproveDate;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "refundCode='" + refundCode + '\'' +
                ", cancelRefundCheck='" + cancelRefundCheck + '\'' +
                ", refundGroupCode='" + refundGroupCode + '\'' +
                ", refundMethod='" + refundMethod + '\'' +
                ", refundPrice=" + refundPrice +
                ", totalRefundPrice=" + totalRefundPrice +
                ", approveCheck='" + approveCheck + '\'' +
                ", refundAskDate='" + refundAskDate + '\'' +
                ", refundApproveDate='" + refundApproveDate + '\'' +
                '}';
    }
}
