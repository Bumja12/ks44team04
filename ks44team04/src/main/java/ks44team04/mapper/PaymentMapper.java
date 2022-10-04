package ks44team04.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.PaymentTotal;

@Mapper
public interface PaymentMapper {
	
	//결제상세내역 검색
	public List<PaymentTotal> searchPaymentDetail(Map<String, Object> searchMap);
	//결제내역 검색
	public List<PaymentTotal> searchPaymentList(Map<String, Object> searchMap);
	
	//주문취소삭제
	public int removeCancel(String orderDetailCode);
	//교환삭제
	public int removeExchange(String orderDetailCode);
	//반환삭제
	public int removeReturn(String orderDetailCode);
	//리뷰댓글삭제
	public int removeReviewComment(String orderDetailCode);
	//리뷰삭제
	public int removeReview(String orderDetailCode);
	//주문상세번호삭제
	public int removeDetailCode(String orderDetailCode);
	
	//결제상세번호만 조회
	public boolean detailCodeCheck(String orderDetailCode);
	
	//특정결제상세번호로 조회
	public PaymentTotal getPaymentDetail(String orderDetailCode);
	
	//결제상세
	public List<PaymentTotal> paymentDetail();
	
	//결제내역
	public List<PaymentTotal> paymentList();
	
}
