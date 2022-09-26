package ks44team04.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsQna;

@Mapper
public interface GoodsMapper {
	
	//상품 문의 조회
	public List<GoodsQna> getGoodsQna();
	
	//상품 삭제
	public void goodsRemove(String goods);
	
	//상품 수정
	public int goodsModify(Goods goods);
	
	//특정 상품 정보 조회
	public Goods getGoodsInfoByCode(String goodsCode);

	//상품 목록 조회
	public List<Goods> getGoodsList();
}