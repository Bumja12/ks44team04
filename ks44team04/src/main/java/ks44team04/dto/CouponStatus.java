package ks44team04.dto;

import java.util.List;

public class CouponStatus {
	
	private String couponStatusCode;
    private String couponCode;
    private String buyerId;
    private String adminId;
    private String couponIssueDate;
    private Coupon couponInfo;
    private List<Coupon> coupon;

    public String getCouponStatusCode() {
        return couponStatusCode;
    }

    public void setCouponStatusCode(String couponStatusCode) {
        this.couponStatusCode = couponStatusCode;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getCouponIssueDate() {
        return couponIssueDate;
    }

    public void setCouponIssueDate(String couponIssueDate) {
        this.couponIssueDate = couponIssueDate;
    }

    public Coupon getCouponInfo() {
        return couponInfo;
    }

    public void setCouponInfo(Coupon couponInfo) {
        this.couponInfo = couponInfo;
    }

    public List<Coupon> getCoupon() {
        return coupon;
    }

    public void setCoupon(List<Coupon> coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "CouponStatus{" +
                "couponStatusCode='" + couponStatusCode + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", adminId='" + adminId + '\'' +
                ", couponIssueDate='" + couponIssueDate + '\'' +
                ", couponInfo=" + couponInfo +
                ", coupon=" + coupon +
                '}';
    }
}
