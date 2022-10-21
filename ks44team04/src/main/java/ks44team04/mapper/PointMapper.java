package ks44team04.mapper;

import ks44team04.dto.Coupon;
import ks44team04.dto.PointDeal;
import ks44team04.dto.PointDetail;
import ks44team04.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PointMapper {

	public List<PointDeal> searchPointHistory(Map<String, Object> searchMap);
	public List<User> searchUserList(Map<String, Object> searchMap);

	public List<PointDeal> pointHistory();

	public int getUserPoint(String userId);

	public void addPointDeal(PointDeal pointDeal);
	public void addPointDetailPlus(PointDetail pointDetail);
	public void addPointDetailMinus(String dealId);
}
