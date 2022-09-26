package ks44team04.admin.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Coupon;

@Mapper
public interface CouponMapper {
	
	public List<Coupon> couponList();
	
}
