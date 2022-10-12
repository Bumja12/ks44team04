package ks44team04.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Coupon;
import ks44team04.dto.CouponStatus;

@Mapper
public interface CouponMapper {

	public List<Coupon> searchCouponStatus(Map<String, Object> searchMap);

	public List<Coupon> searchCouponList(Map<String, Object> searchMap);

	public void couponIssue(CouponStatus couponStatus);

	public void couponCreate(Coupon coupon);

	public List<Coupon> couponList();
	
	public List<CouponStatus> couponStatus();

	public List<CouponStatus> getCouponStatus(String userId);

	public void deleteCouponStatus(String couponStatusCode);
	
}
