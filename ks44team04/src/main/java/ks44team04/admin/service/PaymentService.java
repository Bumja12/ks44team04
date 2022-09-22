package ks44team04.admin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.admin.mapper.PaymentMapper;
import ks44team04.dto.PaymentTotal;

@Service
public class PaymentService {
	
	private final PaymentMapper paymentMapper;
	private static final Logger log = LoggerFactory.getLogger(PaymentService.class);

	public PaymentService(PaymentMapper paymentMapper) {
		this.paymentMapper = paymentMapper;
	}
	
	public void paymentService() {
		log.info("paymentService bean 생성");
	}
	
	public List<PaymentTotal> paymentList(){
		
		List<PaymentTotal> paymentTotal = paymentMapper.paymentList();
		
		return paymentTotal;
	}
}
