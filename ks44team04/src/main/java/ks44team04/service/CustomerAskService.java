package ks44team04.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks44team04.dto.CustomerAsk;
import ks44team04.mapper.CustomerAskMapper;

@Service
public class CustomerAskService {
	
	// 고객 문의 매퍼 의존성 주입
	private final CustomerAskMapper customerAskMapper;
	
	// 생성자 메소드
	public CustomerAskService(CustomerAskMapper customerAskMapper) {
		this.customerAskMapper = customerAskMapper;
	}
	
	// 고객 문의 목록 조회
	public List<CustomerAsk> getCustomerAskList(){
		
		// 고객 문의 목록
		List<CustomerAsk> customerAskList = customerAskMapper.getCustomerAskList();
		
		return customerAskList;
	}
}
