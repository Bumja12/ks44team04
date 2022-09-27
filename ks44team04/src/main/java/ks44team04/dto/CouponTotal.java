package ks44team04.dto;

public class CouponTotal {

    private String couponName;
    private int discountPrice;
    private int priceTerms;
    private String endDate;
    private String regId;
    private String regDate;

	
	private String couponStatusCode;
    private String couponCode;
    private String buyerId;
    private String adminId;
    private String couponIssueDate;
    
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public int getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	public int getPriceTerms() {
		return priceTerms;
	}
	public void setPriceTerms(int priceTerms) {
		this.priceTerms = priceTerms;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
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
		return "CouponTotal [couponName=" + couponName + ", discountPrice=" + discountPrice + ", priceTerms="
				+ priceTerms + ", endDate=" + endDate + ", regId=" + regId + ", regDate=" + regDate
				+ ", couponStatusCode=" + couponStatusCode + ", couponCode=" + couponCode + ", buyerId=" + buyerId
				+ ", adminId=" + adminId + ", couponIssueDate=" + couponIssueDate + "]";
	}
    
    
    
}
