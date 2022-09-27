package ks44team04.service;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ks44team04.mapper.GoodsMapper;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsQna;

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
	
	//상품 문의 답변 조회
	//public List<GoodsAnswer> getGoodsAnswer(){
	//	List<GoodsAnswer> goodsAnswer = goodsMapper.getGoodsAnswer();
	//	return goodsAnswer;
	//}
	
	//상품 문의 조회
	public List<GoodsQna> getGoodsQna() {
		List<GoodsQna> goodsQna = goodsMapper.getGoodsQna();
		return goodsQna;
	}
	
	//상품 삭제
	public void goodsRemove(String goods) {
		goodsMapper.goodsRemove(goods);
	}
	
	//상품 등록
	public void goodsAdd(Goods goods) {
		int result = goodsMapper.goodsAdd(goods);
		System.out.println("상품 등록 결과:" + result);
	}
	
	//상품 수정
	public int goodsModify(Goods goods) {
		int result = goodsMapper.goodsModify(goods);
		return result;
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
