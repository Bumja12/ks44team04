package ks44team04.admin.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team04.admin.mapper.GoodsMapper;
import ks44team04.dto.Goods;

@Service
@Transactional
public class GoodsService {
	
	//의존성 주입
    private final GoodsMapper goodsMapper;
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}
	
	@PostConstruct
	public void goodsServiceInit() {
	}
	
	//상품 삭제
	public void removeGoods(String goods) {
		goodsMapper.removeGoods(goods);
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
