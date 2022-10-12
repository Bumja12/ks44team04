package ks44team04.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsAnswer;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.GoodsQna;
import ks44team04.dto.GoodsQnaCategory;

@Mapper
public interface GoodsMapper {
	
	//상품 목록 조회
	public List<Goods> getGoodsList();
	
	//상품 검색
	public List<Goods> getGoodsListSearch(Map<String, Object> searchMap);
	
	//특정 상품 정보 조회
	public Goods getGoodsInfoByCode(String goodsCode);
	
	//카테고리 대분류 조회
	public List<GoodsLargeCategory> goodsLargeCategoryList();
	
	//상품 수정
	public int goodsModify(Goods goods);
	
	//상품 등록
	public void goodsAdd(Goods goods);
	
	//마지막 상품코드
	public String getGoodsNewCode(String sellerId);
	
	//상품 삭제
	public void goodsRemove(String goodsCode);
	
	//상품 삭제를 위한 관리자 비밀번호
	public String getAdminPw(String userPw);
	
	//상품 문의 조회
	public List<GoodsQna> getGoodsQna();
	
	//문의 검색
	public List<GoodsQna> getGoodsQnaSearch(Map<String, Object> searchMap);
	
	//특정 문의 조회
	public List<GoodsQna> getGoodsQnaInfoByCode(String goodsCode);
	
	//문의 카테고리 조회
	public List<GoodsQnaCategory> goodsQnaCategoryList();
	
	//문의 등록
	public int goodsQnaAdd(GoodsQna goodsQna);
	
	//상품 문의 답변 조회
	public List<GoodsAnswer> getGoodsAnswer();
	
	//유저 권한 불러오기
	public String userRight(String userId);
	
	//문의 한 유저만 열람 가능 쿼리
	public String qnaBuyerView(String userId);
	
	//해당 상품 판매자 문의 열람 가능 쿼리
	public String qnaSellerView(String userId);
	
}