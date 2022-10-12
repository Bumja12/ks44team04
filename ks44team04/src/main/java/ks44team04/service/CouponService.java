package ks44team04.service;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import ks44team04.dto.PaymentTotal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.mapper.CouponMapper;
import ks44team04.dto.Coupon;
import ks44team04.dto.CouponStatus;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
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

	//쿠폰목록검색
	public List<Coupon> searchCouponStatus(Map<String, Object> searchMap) {

		List<Coupon> couponStatus = couponMapper.searchCouponStatus(searchMap);

		return couponStatus;
	}

	//쿠폰목록검색
	public List<Coupon> searchCouponList(Map<String, Object> searchMap) {

		List<Coupon> couponList = couponMapper.searchCouponList(searchMap);

		return couponList;
	}

	// 쿠폰생성
	public void couponCreate(Coupon coupon){

		couponMapper.couponCreate(coupon);

	}

	// 쿠폰발급
	public void couponIssue(CouponStatus couponStatus){

		couponMapper.couponIssue(couponStatus);
	}

	// 쿠폰보유현황
	public List<CouponStatus> couponStatus() {

		List<CouponStatus> couponStatus = couponMapper.couponStatus();

		return couponStatus;
	}

	// 쿠폰목록
	public List<Coupon> couponList() {

		List<Coupon> couponList = couponMapper.couponList();

		return couponList;

	}

	public List<CouponStatus> getCouponStatus(String userId) {
		return couponMapper.getCouponStatus(userId);
	}

	public void deleteCouponStatus(String couponStatusCode) {
		couponMapper.deleteCouponStatus(couponStatusCode);
	}

}
