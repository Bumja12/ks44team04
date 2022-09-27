package ks44team04.dto;

public class CouponStatus {

	private String couponStatusCode;
    private String couponCode;
    private String buyerId;
    private String adminId;
    private String couponIssueDate;

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

	@Override
	public String toString() {
		return "CouponStatus [couponStatusCode=" + couponStatusCode + ", couponCode=" + couponCode + ", buyerId="
				+ buyerId + ", adminId=" + adminId + ", couponIssueDate=" + couponIssueDate + "]";
	}

   
}
