package ks44team04.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks44team04.admin.mapper.GoodsMapper;
import ks44team04.dto.Goods;

@Service
public class GoodsService {
	
    private final GoodsMapper goodsMapper;
	
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}
	
	//상품 목록 조회
	public List<Goods> getGoodsList() {
		List<Goods> goodsList = goodsMapper.getGoodsList();
		return goodsList;
	}
}
