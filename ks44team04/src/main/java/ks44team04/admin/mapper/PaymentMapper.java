package ks44team04.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.PaymentTotal;

@Mapper
public interface PaymentMapper {
	
	public List<PaymentTotal> paymentDetailList();
	
	public List<PaymentTotal> paymentList();
	
}
