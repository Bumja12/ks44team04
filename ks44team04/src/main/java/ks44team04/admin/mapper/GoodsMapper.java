package ks44team04.admin.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Goods;

@Mapper
public interface GoodsMapper {

	//상품 목록 조회
	public List<Goods> getGoodsList();
}