package ks44team04.mapper;

import ks44team04.dto.PointDeal;
import ks44team04.dto.PointDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PointMapper {
	
	public List<PointDeal> pointHistory();

	public int getUserPoint(String userId);

	public void addPointDeal(PointDeal pointDeal);
	public void addPointDetailPlus(PointDetail pointDetail);
}
