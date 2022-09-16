package ks44team04.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks44team04.admin.mapper.GoodsMapper;
import ks44team04.dto.Goods;

@Service
public class GoodsService {
	
	//의존성 주
    private final GoodsMapper goodsMapper;
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}
	
	//상품 수정
	public void modifyGoods(Goods goods) {
		goodsMapper.modifyGoods(goods);
	}
	
	//특정상품 조회
	public Goods getGoodsInfoByCode(String goodsCode) {
		Goods goods = goodsMapper.getGoodsInfoByCode(goodsCode);
		return goods;
	}
	
	//상품 목록 조회
	public List<Goods> getGoodsList() {
		List<Goods> goodsList = goodsMapper.getGoodsList();
		return goodsList;
	}
}
