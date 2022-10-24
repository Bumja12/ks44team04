package ks44team04.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.CustomerAsk;

@Mapper
public interface CustomerAskMapper {
	
	// 고객 문의 목록 조회
	public List<CustomerAsk> getCustomerAskList(); 
	
}
