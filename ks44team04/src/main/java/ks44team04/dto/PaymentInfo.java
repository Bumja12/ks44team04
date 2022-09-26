package ks44team04.dto;

import java.util.List;

public class PaymentInfo {
	
	private List<PaymentTotal> paymentTotal;
	
	public List<PaymentTotal> getPaymentTotal() {
		return paymentTotal;
	}
	public void setPaymentTotal(List<PaymentTotal> paymentTotal) {
		this.paymentTotal = paymentTotal;
	}
	
	private String orderNum;
    private String buyerId;
    private String orderDate;
    private String approveDate;
    
    public String getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(String approveDate) {
		this.approveDate = approveDate;
	}
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
		return "PaymentInfo [paymentTotal=" + paymentTotal + ", orderNum=" + orderNum + ", buyerId=" + buyerId
				+ ", orderDate=" + orderDate + ", approveDate=" + approveDate + "]";
	}
	
    
}
