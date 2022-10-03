package ks44team04.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ks44team04.mapper.GoodsMapper;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.GoodsQna;

@Service
@Transactional
public class GoodsService {
	
	//의존성 주입
    private final GoodsMapper goodsMapper;
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}
	
	//상품 목록 조회
	public List<Goods> getGoodsList() {
		List<Goods> goodsList = goodsMapper.getGoodsList();
		return goodsList;
	}
	
	//상품 검색
	public List<Goods> getGoodsListSearch(Map<String,Object> paramMap) {
		List<Goods> goodsList = goodsMapper.getGoodsListSearch(paramMap);
		return goodsList;
	}
	
	//카테고리 대분류 조회
	public List<GoodsLargeCategory> goodsLargeCategoryList(){
		List<GoodsLargeCategory> largeCategoryList = goodsMapper.goodsLargeCategoryList();
		return largeCategoryList;
	}
	
	//특정상품 조회
	public Goods getGoodsInfoByCode(String goodsCode) {
		Goods goods = goodsMapper.getGoodsInfoByCode(goodsCode);
		return goods;
	}
	
	//상품 수정
	public int goodsModify(Goods goods) {
		int result = goodsMapper.goodsModify(goods);
		return result;
	}
	
	//상품 등록
	public void goodsAdd(Goods goods) {
		goodsMapper.goodsAdd(goods);
	}
	
	//코드 증가
	public String getGoodsNewCode(String sellerId) {
		String goodsNewCode = goodsMapper.getGoodsNewCode(sellerId);
		return goodsNewCode;
	}
	
	//상품 삭제
	public void goodsRemove(String goodsCode) {
		goodsMapper.goodsRemove(goodsCode);
	}
	
	//상품 삭제를 위한 관리자 비밀번호
	public String getAdminPw(String userPw) {
		String adminPw = goodsMapper.getAdminPw(userPw);
		return adminPw;
	}
	
	//상품 문의 조회
	public List<GoodsQna> getGoodsQna() {
		List<GoodsQna> goodsQna = goodsMapper.getGoodsQna();
		return goodsQna;
	}
	
	//문의 검색
	public List<GoodsQna> getGoodsQnaSearch(Map<String,Object> paramMap) {
		List<GoodsQna> goodsQna = goodsMapper.getGoodsQnaSearch(paramMap);
		return goodsQna;
	}
	
	//상품 문의 답변 조회
	//public List<GoodsAnswer> getGoodsAnswer(){
	//	List<GoodsAnswer> goodsAnswer = goodsMapper.getGoodsAnswer();
	//	return goodsAnswer;
	//}
}