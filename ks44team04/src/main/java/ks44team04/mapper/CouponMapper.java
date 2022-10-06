package ks44team04.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Coupon;
import ks44team04.dto.CouponStatus;

@Mapper
public interface CouponMapper {

	public void couponCreate(Coupon coupon);

	public List<Coupon> couponList();
	
	public List<CouponStatus> couponStatus();

	public List<CouponStatus> getCouponStatus(String userId);
	
}
