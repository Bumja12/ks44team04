package ks44team04.mapper;


import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.Order;

@Mapper
public interface LedgerBookMapper {

   
    public String ledgerBook();
    
  //특정 주문 목록
    public Order orderList(String sellerId);
    
    
}
