package ks44team04.service;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks44team04.dto.Order;
import ks44team04.mapper.LedgerBookMapper;

@Service
public class LedgerBookService {
	private final LedgerBookMapper ledgerBookMapper;
 
    public LedgerBookService(LedgerBookMapper ledgerBookMapper) {
        this.ledgerBookMapper = ledgerBookMapper;
    }
    
    //메인 화면 2022 결제 금액 테이블 
    public List<Order> orderList(Map<String, Object> orderMap) {
    	List<Order> orderList = ledgerBookMapper.orderList(orderMap);
    	return orderList;
    }
    
    //메인 화면 2022년 할인 통계 포인트 부분 
    public List<Order> pointDiscountlist(Map<String, Object> orderMap) {
    	List<Order> pointDiscountlist = ledgerBookMapper.pointDiscountlist(orderMap);
    	return pointDiscountlist;
    }
     
    //메인 화면에 차트 부분
    public List<Order> mainCartList(Map<String, Object> orderMap){
    	
    	List<Order> mainCartList = ledgerBookMapper.mainCartlist(orderMap);
    	return mainCartList;
    }
    
}
