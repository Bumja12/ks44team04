package ks44team04.service;

import org.springframework.stereotype.Service;

import ks44team04.mapper.LedgerBookMapper;

@Service
public class LedgerBookService {
	private final LedgerBookMapper ledgerBookMapper;
 
    public LedgerBookService(LedgerBookMapper ledgerBookMapper) {
        this.ledgerBookMapper = ledgerBookMapper;
    }
    
     
    
}
