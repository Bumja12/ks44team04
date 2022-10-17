package ks44team04.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.BoardCategory;
import ks44team04.dto.CustomerAskCategory;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.GoodsQnaCategory;
import ks44team04.dto.GoodsSmallCategory;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.RegularAskCategory;
import ks44team04.dto.ReportCategory;

@Mapper
public interface CategoryMapper {

	//==============================목록 조회============================== 

	// 구매자 등급 카테고리 목록 조희
	public List<LevelBuyerCategory> getLevelBuyerCategoryList();
	
	// 판매자 등급 카테고리 목록 조희
	public List<LevelSellerCategory> getLevelSellerCategoryList();
	
	// 고객 문의 카테고리 목록 조희
	public List<CustomerAskCategory> getCustomerAskCategoryList();
	
	// 자주 묻는 질문 카테고리 목록 조희
	public List<RegularAskCategory> getRegularAskCategoryList();
	
	// 게시판 카테고리 목록 조희
	public List<BoardCategory> getBoardCategoryList();
	
	// 신고 대상 카테고리 목록 조희
	public List<ReportCategory> getReportCategoryList();
	
	// 판매 상품 카테고리 대분류 목록 조희
	public List<GoodsLargeCategory> getGoodsLargeCategoryList();
	
	// 판매 상품 카테고리 소분류 목록 조희
	public List<GoodsSmallCategory> getGoodsSmallCategoryList();
	
	// 상품 문의 카테고리 목록 조희
	public List<GoodsQnaCategory> getGoodsQnaCategoryList();
	
	//==============================목록 조회============================== 
	
	//==============================내역 조회============================== 
	
	// 특정 구매자 등급 카테고리 조희
	public LevelBuyerCategory getLevelBuyerCategoryByPK(String levelCode); 
	
	
	//==============================내역 조회============================== 
	
}
