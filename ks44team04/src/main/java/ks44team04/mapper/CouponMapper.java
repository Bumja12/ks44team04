package ks44team04.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Coupon;
import ks44team04.dto.CouponStatus;

@Mapper
public interface CouponMapper {

	//회원쿠폰보유 검색
	public List<Coupon> searchCouponStatus(Map<String, Object> searchMap);

	//쿠폰목록 검색
	public List<Coupon> searchCouponList(Map<String, Object> searchMap);

	//쿠폰발급
	public void couponIssue(CouponStatus couponStatus);

	//쿠폰생성
	public void couponCreate(Coupon coupon);

	//쿠폰목록
	public List<Coupon> couponList();

	//쿠폰보유현황
	public List<CouponStatus> couponStatus();

	public List<CouponStatus> getCouponStatus(String userId);

	public void deleteCouponStatus(String couponStatusCode);
	
}
