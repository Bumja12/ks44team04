package ks44team04.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.Order;

@Mapper
public interface LedgerBookMapper {

   
    public String ledgerBook();
    
  //메인 화면 2022 결제 금액 테이블
    public List<Order> orderList(Map<String, Object> orderMap);
    
 //메인 화면 2022년 할인 통계 포인트 부분
    public List<Order> pointDiscountlist(Map<String, Object> orderMap);
    
    
    
}
