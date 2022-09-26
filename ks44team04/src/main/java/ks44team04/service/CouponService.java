package ks44team04.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.mapper.CouponMapper;
import ks44team04.dto.Coupon;

@Service
public class CouponService {

	private static final Logger log = LoggerFactory.getLogger(CouponService.class);
	private final CouponMapper couponMapper;

	
	public CouponService(CouponMapper couponMapper) {
		this.couponMapper = couponMapper;
	}
	
	@PostConstruct
	public void couponService() {
		log.info("couponService bean 생성");
	}
	
	public List<Coupon> couponList() {
		
		List<Coupon> couponList = couponMapper.couponList();
		
		return couponList;
		
	}
	
}
