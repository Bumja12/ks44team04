package ks44team04.admin.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.admin.mapper.CouponMapper;

@Service
public class CouponService {

	private final CouponMapper couponMapper;
	private static final Logger log = LoggerFactory.getLogger(CouponService.class);

	
	public CouponService(CouponMapper couponMapper) {
		this.couponMapper = couponMapper;
	}
	
	@PostConstruct
	public void couponService() {
		log.info("couponService bean 생성");
	}
	
	
}
