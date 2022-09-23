package ks44team04.dto;

import java.util.List;

public class PaymentTotal {
	
	private OrderUser orderUser;

    public OrderUser getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(OrderUser orderUser) {
		this.orderUser = orderUser;
	}
	
	//OrderUser 필드 임시 추가

	
	
	//주문정보
//	private String orderNum;
//    private String buyerId;
//    private String orderDate;
    
    

	private String couponCode;
    private String orderStatus;
    private int totalSum;
    private int totalPrice;
    private int couponPrice;
    private int usePoint;
    private int goodsDiscountPrice;
    private int postPrice;
    private int totalOrderPrice;
    private int finalConfirmPrice;
    private String finalConfirmDate;
    private String postAddressList;
    
    //주문상세정보
    private String orderDetailCode;
    private String goodsCode;
    private int orderAmount;
    private int orderOgPrice;
    private int orderPrice;
    private String postInfo;
    private String refundCheck;
    private String autoConfirmDate;
    private String orderConfirmDate;
    private int savePoint;
	
    //결제정보
    private String paymentCode;
    private String paymentMethod;
    private String paymentGroupCode;
    
    //카드결제
    private String cardPaymentCode;
    private String cardCompany;
    private String cardNumber;
    private int approvePrice;
    private String approveDate;
    
    //계좌결제
    private String accountPaymentCode;
    private String refundBank;
    private String refundAccount;
    
    private String goodsName;
    
    

	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
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
	public int getGoodsDiscountPrice() {
		return goodsDiscountPrice;
	}
	public void setGoodsDiscountPrice(int goodsDiscountPrice) {
		this.goodsDiscountPrice = goodsDiscountPrice;
	}
	public int getPostPrice() {
		return postPrice;
	}
	public void setPostPrice(int postPrice) {
		this.postPrice = postPrice;
	}
	public int getTotalOrderPrice() {
		return totalOrderPrice;
	}
	public void setTotalOrderPrice(int totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
	}
	public int getFinalConfirmPrice() {
		return finalConfirmPrice;
	}
	public void setFinalConfirmPrice(int finalConfirmPrice) {
		this.finalConfirmPrice = finalConfirmPrice;
	}
	public String getFinalConfirmDate() {
		return finalConfirmDate;
	}
	public void setFinalConfirmDate(String finalConfirmDate) {
		this.finalConfirmDate = finalConfirmDate;
	}
	public String getPostAddressList() {
		return postAddressList;
	}
	public void setPostAddressList(String postAddressList) {
		this.postAddressList = postAddressList;
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
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getOrderOgPrice() {
		return orderOgPrice;
	}
	public void setOrderOgPrice(int orderOgPrice) {
		this.orderOgPrice = orderOgPrice;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getPostInfo() {
		return postInfo;
	}
	public void setPostInfo(String postInfo) {
		this.postInfo = postInfo;
	}
	public String getRefundCheck() {
		return refundCheck;
	}
	public void setRefundCheck(String refundCheck) {
		this.refundCheck = refundCheck;
	}
	public String getAutoConfirmDate() {
		return autoConfirmDate;
	}
	public void setAutoConfirmDate(String autoConfirmDate) {
		this.autoConfirmDate = autoConfirmDate;
	}
	public String getOrderConfirmDate() {
		return orderConfirmDate;
	}
	public void setOrderConfirmDate(String orderConfirmDate) {
		this.orderConfirmDate = orderConfirmDate;
	}
	public int getSavePoint() {
		return savePoint;
	}
	public void setSavePoint(int savePoint) {
		this.savePoint = savePoint;
	}
	public String getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentGroupCode() {
		return paymentGroupCode;
	}
	public void setPaymentGroupCode(String paymentGroupCode) {
		this.paymentGroupCode = paymentGroupCode;
	}
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
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	@Override
	public String toString() {
		return "PaymentTotal [orderUser=" + orderUser + ", couponCode=" + couponCode + ", orderStatus=" + orderStatus
				+ ", totalSum=" + totalSum + ", totalPrice=" + totalPrice + ", couponPrice=" + couponPrice
				+ ", usePoint=" + usePoint + ", goodsDiscountPrice=" + goodsDiscountPrice + ", postPrice=" + postPrice
				+ ", totalOrderPrice=" + totalOrderPrice + ", finalConfirmPrice=" + finalConfirmPrice
				+ ", finalConfirmDate=" + finalConfirmDate + ", postAddressList=" + postAddressList
				+ ", orderDetailCode=" + orderDetailCode + ", goodsCode=" + goodsCode + ", orderAmount=" + orderAmount
				+ ", orderOgPrice=" + orderOgPrice + ", orderPrice=" + orderPrice + ", postInfo=" + postInfo
				+ ", refundCheck=" + refundCheck + ", autoConfirmDate=" + autoConfirmDate + ", orderConfirmDate="
				+ orderConfirmDate + ", savePoint=" + savePoint + ", paymentCode=" + paymentCode + ", paymentMethod="
				+ paymentMethod + ", paymentGroupCode=" + paymentGroupCode + ", cardPaymentCode=" + cardPaymentCode
				+ ", cardCompany=" + cardCompany + ", cardNumber=" + cardNumber + ", approvePrice=" + approvePrice
				+ ", approveDate=" + approveDate + ", accountPaymentCode=" + accountPaymentCode + ", refundBank="
				+ refundBank + ", refundAccount=" + refundAccount + ", goodsName=" + goodsName + "]";
	}
	
	

	
}
