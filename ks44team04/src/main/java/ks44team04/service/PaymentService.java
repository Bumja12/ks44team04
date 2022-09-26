package ks44team04.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.mapper.PaymentMapper;
import ks44team04.dto.PaymentTotal;

@Service
public class PaymentService {
	
	private final PaymentMapper paymentMapper;
	private static final Logger log = LoggerFactory.getLogger(PaymentService.class);

	public PaymentService(PaymentMapper paymentMapper) {
		this.paymentMapper = paymentMapper;
	}
	
	@PostConstruct
	public void paymentService() {
		log.info("paymentService bean 생성");
	}
	
	//결제상세
	public List<PaymentTotal> paymentDetailList(){
		
		List<PaymentTotal> paymentDetailList = paymentMapper.paymentDetailList();
		
		return paymentDetailList;
	}
	
	//결제내역
	public List<PaymentTotal> paymentList(){
		
		List<PaymentTotal> paymentList = paymentMapper.paymentList();
		
		return paymentList;
		
	}
	
	
}
