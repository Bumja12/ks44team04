package ks44team04.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.PaymentTotal;

@Mapper
public interface PaymentMapper {
	
	//특정결제상세번호 조회
	public PaymentTotal getPaymentDetail(String orderDetailCode);
	
	//결제상세
	public List<PaymentTotal> paymentDetailList();
	
	//결제내역
	public List<PaymentTotal> paymentList();
	
}
