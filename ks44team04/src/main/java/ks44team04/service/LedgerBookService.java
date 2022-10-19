package ks44team04.service;


import java.util.HashMap;
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
    
    //판매자 메인 화면 상단 부분
    public List<Order> mainTop(Map<String, Object> orderMap) {
    	List<Order> mainTop = ledgerBookMapper.mainTop(orderMap);
    	return mainTop;
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
    
   //판매자 매출 통계 카테고리별 결제 금액 그래프(비율포함)
    public List<Order> paymentAmount(Map<String, Object> orderMap){
    	
    	List<Order> paymentAmount = ledgerBookMapper.paymentAmount(orderMap);
    	return paymentAmount;
    }
    
    
    //판매자 매출 통계 카테고리별 교환 테이블 부분
    public List<Order> orderExchange(Map<String, Object> orderMap){
    	
    	List<Order> orderExchange = ledgerBookMapper.orderExchange(orderMap);
    	return orderExchange;
    }
    
    //판매자 매출 통계 카테고리별 반품 테이블 부분 
    public Map<String, Object> orderReturn(Map<String, Object> orderMap){
    	List<Map<String, String>> cateInfoList = ledgerBookMapper.orderReturnCateList(orderMap);
    	orderMap.put("cateInfoList", cateInfoList);
    	List<Map<String, String>> orderReturn = ledgerBookMapper.orderReturn(orderMap);
    	Map<String, Object> orderReturnMap = new HashMap<String, Object>();
    	orderReturnMap.put("cateInfoList", cateInfoList);
    	orderReturnMap.put("orderReturn", orderReturn);
    	return orderReturnMap;
    }
    
}
