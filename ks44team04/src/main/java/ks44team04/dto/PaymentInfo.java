package ks44team04.dto;

import java.util.List;

public class PaymentInfo {
	
	private List<PaymentHistory> paymentHistory;
	
	
	public List<PaymentHistory> getPaymentHistory() {
		return paymentHistory;
	}
	public void setPaymentHistory(List<PaymentHistory> paymentHistory) {
		this.paymentHistory = paymentHistory;
	}

	
	private String orderNum;
    private String buyerId;
    private String orderDate;
    
    public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return "PaymentInfo [paymentHistory=" + paymentHistory + ", orderNum=" + orderNum + ", buyerId=" + buyerId
				+ ", orderDate=" + orderDate + "]";
	}

    
}
