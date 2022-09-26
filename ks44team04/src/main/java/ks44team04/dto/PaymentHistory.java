package ks44team04.dto;

public class PaymentHistory {

	 private int couponPrice;
	 private int usePoint;
	 private String orderStatus;
	 private String goodsName;
	 private int savePoint;
	 private int orderPrice;
	 private int orderAmount;
	 
	public int getCouponPrice() {
		return couponPrice;
	}
	public void setCouponPrice(int couponPrice) {
		this.couponPrice = couponPrice;
	}
	public int getUsePoint() {
		return usePoint;
	}
	public void setUsePoint(int usePoint) {
		this.usePoint = usePoint;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getSavePoint() {
		return savePoint;
	}
	public void setSavePoint(int savePoint) {
		this.savePoint = savePoint;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	@Override
	public String toString() {
		return "PaymentHistory [couponPrice=" + couponPrice + ", usePoint=" + usePoint + ", orderStatus=" + orderStatus
				+ ", goodsName=" + goodsName + ", savePoint=" + savePoint + ", orderPrice=" + orderPrice
				+ ", orderAmount=" + orderAmount + "]";
	}
	 
	
}
