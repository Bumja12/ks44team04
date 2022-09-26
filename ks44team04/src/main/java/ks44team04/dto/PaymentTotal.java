package ks44team04.dto;

public class PaymentTotal {
	
	private String orderDetailCode;
	private int couponPrice;
	private int usePoint;
	private String orderStatus;
	private String goodsCode;
	private String goodsName;
	private int savePoint;
	private int orderPrice;
	private int orderAmount;
	private String paymentMethod;
	private String cardCompany;
    private String cardNumber;
    private int approvePrice;
    private String refundBank;
    private String refundAccount;
	
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
	
	public String getOrderDetailCode() {
		return orderDetailCode;
	}
	public void setOrderDetailCode(String orderDetailCode) {
		this.orderDetailCode = orderDetailCode;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
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
	@Override
	public String toString() {
		return "PaymentTotal [orderDetailCode=" + orderDetailCode + ", couponPrice=" + couponPrice + ", usePoint="
				+ usePoint + ", orderStatus=" + orderStatus + ", goodsCode=" + goodsCode + ", goodsName=" + goodsName
				+ ", savePoint=" + savePoint + ", orderPrice=" + orderPrice + ", orderAmount=" + orderAmount
				+ ", paymentMethod=" + paymentMethod + ", cardCompany=" + cardCompany + ", cardNumber=" + cardNumber
				+ ", approvePrice=" + approvePrice + ", refundBank=" + refundBank + ", refundAccount=" + refundAccount
				+ "]";
	}
	

}
