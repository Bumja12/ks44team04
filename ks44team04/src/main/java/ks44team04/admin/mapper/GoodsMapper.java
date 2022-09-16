package ks44team04.admin.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Goods;

@Mapper
public interface GoodsMapper {
	
	//상품 수정
	public int modifyGoods(Goods goods);
	
	//특정 상품 정보 조회
	public Goods getGoodsInfoByCode(String goodsCode);

	//상품 목록 조회
	public List<Goods> getGoodsList();
}