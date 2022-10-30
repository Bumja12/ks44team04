package ks44team04.dto;

import java.util.List;

public class CouponUser {
	 
	private String buyerId;
	private List<CouponTotal> couponNow;
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public List<CouponTotal> getCouponNow() {
		return couponNow;
	}
	public void setCouponNow(List<CouponTotal> couponNow) {
		this.couponNow = couponNow;
	}
	@Override
	public String toString() {
		return "CouponUser [buyerId=" + buyerId + ", couponNow=" + couponNow + "]";
	}
	
	
	
	
	
}
