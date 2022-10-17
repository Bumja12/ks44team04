package ks44team04.service;


import org.springframework.stereotype.Service;

import ks44team04.dto.Order;
import ks44team04.mapper.LedgerBookMapper;

@Service
public class LedgerBookService {
	private final LedgerBookMapper ledgerBookMapper;
 
    public LedgerBookService(LedgerBookMapper ledgerBookMapper) {
        this.ledgerBookMapper = ledgerBookMapper;
    }
    
    //특정 주문 내역 
    public Order orderList(String sellerId) {
    	Order order = ledgerBookMapper.orderList(sellerId);
    	return order;
    }
     
    
}
