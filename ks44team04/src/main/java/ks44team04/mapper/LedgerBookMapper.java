package ks44team04.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.Order;

@Mapper
public interface LedgerBookMapper {

   
    public String ledgerBook();
    
   //판매자 메인 화면 상단 부분
    public List<Order> mainTop(Map<String, Object> orderMap);
    
  //판매자 메인 화면 2022 결제 금액 테이블
    public List<Order> orderList(Map<String, Object> orderMap);
    
  //판매자 메인 화면 2022년 할인 통계 포인트 부분
    public List<Order> pointDiscountlist(Map<String, Object> orderMap);
    
  //판매자 메인 화면에 차트 부분
    public List<Order> mainCartlist(Map<String,Object> orderMap);
    
  //판매자 매출 통계 카테고리별 결제 금액 그래프(비율포함)
    public List<Order> paymentAmount(Map<String,Object> orderMap);
    
  //판매자 매출 통계 카테고리별 교환 테이블 부분  
    public List<Order> orderExchange(Map<String,Object> orderMap);
    
  //판매자 매출 통계 카테고리별 반품 테이블 부분   
    //public List<Order> orderReturn(Map<String,Object> orderMap);
    //판매자 매출 통계 카테고리별 반품 테이블 부분   
    public List<Map<String, String>> orderReturn(Map<String,Object> orderMap);
    
    //카테고리 조회
    public List<Map<String, String>> orderReturnCateList(Map<String,Object> orderMap);
    
}
