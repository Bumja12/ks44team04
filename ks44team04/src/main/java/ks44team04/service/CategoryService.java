package ks44team04.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.dto.BoardCategory;
import ks44team04.dto.CustomerAskCategory;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.GoodsQnaCategory;
import ks44team04.dto.GoodsSmallCategory;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.RegularAskCategory;
import ks44team04.dto.ReportCategory;
import ks44team04.mapper.CategoryMapper;

@Service
public class CategoryService {
	
	// Logger
	// private static final Logger log = LoggerFactory.getLogger(RegularAskService.class);

	// 카테고리 매퍼 의존성 주입
	private final CategoryMapper categoryMapper;
	
	// 생성자 메소드
	public CategoryService(CategoryMapper categoryMapper) {
		this.categoryMapper = categoryMapper;
	}
	
	//==============================목록 조회============================== 
	
	// 구매자 등급 카테고리 목록 조희
	public List<LevelBuyerCategory> getLevelBuyerCategoryList(){
		
		// 구매자 등급 카테고리 목록
		List<LevelBuyerCategory> levelBuyerCategoryList = categoryMapper.getLevelBuyerCategoryList();
		
		return levelBuyerCategoryList; 
		
	}
	
	// 판매자 등급 카테고리 목록 조희
	public List<LevelSellerCategory> getLevelSellerCategoryList(){
		
		// 판매자 등급 카테고리 목록
		List<LevelSellerCategory> levelSellerCategoryList = categoryMapper.getLevelSellerCategoryList();
		
		return levelSellerCategoryList;
	}
	
	// 고객 문의 카테고리 목록 조희
	public List<CustomerAskCategory> getCustomerAskCategoryList(){
		
		// 고객 문의 카테고리 목록
		List<CustomerAskCategory> customerAskCategoryList = categoryMapper.getCustomerAskCategoryList();
		
		return customerAskCategoryList;
	}
	
	// 자주 묻는 질문 카테고리 목록 조희
	public List<RegularAskCategory> getRegularAskCategoryList(){
		
		// 자주 묻는 질문 카테고리 목록
		List<RegularAskCategory> regularAskCategoryList = categoryMapper.getRegularAskCategoryList();
		
		return regularAskCategoryList;
	}
	
	
	// 게시판 카테고리 목록 조희
	public List<BoardCategory> getBoardCategoryList(){
		
		// 게시판 카테고리 목록
		List<BoardCategory> boardCategoryList = categoryMapper.getBoardCategoryList();

		return boardCategoryList;
	}

	// 신고 대상 카테고리 목록 조희
	public List<ReportCategory> getReportCategoryList(){
		
		// 신고 대상 카테고리 목록
		List<ReportCategory> reportCategoryList = categoryMapper.getReportCategoryList();
		
		return reportCategoryList;
	}
	
	// 판매 상품 카테고리 대분류 목록 조희
	public List<GoodsLargeCategory> getGoodsLargeCategoryList(){
		
		// 판매 상품 카테고리 대분류 목록
		List<GoodsLargeCategory> goodsLargeCategoryList = categoryMapper.getGoodsLargeCategoryList();

		return goodsLargeCategoryList;
	}
	
	// 판매 상품 카테고리 소분류 목록 조희
	public List<GoodsSmallCategory> getGoodsSmallCategoryList(){
		
		// 판매 상품 카테고리 소분류 목록
		List<GoodsSmallCategory> goodsSmallCategoryList = categoryMapper.getGoodsSmallCategoryList();
		
		return goodsSmallCategoryList;
	}
	
	// 상품 문의 카테고리 목록 조희
	public List<GoodsQnaCategory> getGoodsQnaCategoryList(){
		
		// 상품 문의 카테고리 목록
		List<GoodsQnaCategory> goodsQnaCategoryList = categoryMapper.getGoodsQnaCategoryList();
		
		return goodsQnaCategoryList;
	}

	//==============================목록 조회============================== 
	
	//==============================내역 조회============================== 
	
	// 특정 구매자 등급 카테고리 조희
	public LevelBuyerCategory getLevelBuyerCategoryByPK(String levelCode) {
		
		// 특정 구매자 등급 카테고리
		LevelBuyerCategory levelBuyerCategory = categoryMapper.getLevelBuyerCategoryByPK(levelCode);
		
		return levelBuyerCategory;
	}
	
	// 특정 판매자 등급 카테고리 조희
	public LevelSellerCategory getLevelSellerCategoryByPK(String levelCode) {
		
		// 특정 판매자 등급 카테고리
		LevelSellerCategory levelSellerCategory = categoryMapper.getLevelSellerCategoryByPK(levelCode);
		
		return levelSellerCategory;
	}
	
	// 특정 고객 문의 카테고리 조희
	public CustomerAskCategory getCustomerAskCategoryByPK(String askCategory) {
		
		// 특정 고객 문의 카테고리
		CustomerAskCategory customerAskCategory = categoryMapper.getCustomerAskCategoryByPK(askCategory);
		
		return  customerAskCategory;
	}
	
	// 특정 자주 묻는 질문 카테고리 조희
	public RegularAskCategory getRegularAskCategoryByPK(String regularAskCategory) {
		
		// 특정 자주 묻는 질문 카테고리
		RegularAskCategory regularAsk = categoryMapper.getRegularAskCategoryByPK(regularAskCategory);
		
		return regularAsk;
	}
	
	// 특정 게시판 카테고리 조희
	public BoardCategory getBoardCategoryByPK(String boardCategory) {
		
		// 특정 게시판 카테고리
		BoardCategory board = categoryMapper.getBoardCategoryByPK(boardCategory);
		
		return board;
	}
	
	// 특정 신고 대상 카테고리 조희
	public ReportCategory getReportCategoryByPK(String reportCategory) {
		
		// 특정 신고 대상 카테고리
		ReportCategory report = categoryMapper.getReportCategoryByPK(reportCategory);
		
		return report;
	}
	
	// 특정 판매 상품 카테고리 대분류 조희
	public GoodsLargeCategory getGoodsLargeCategoryByPK(String goodsLargeCategory) {
		
		// 특정 판매 상품 카테고리 대분류
		GoodsLargeCategory goodsLarge = categoryMapper.getGoodsLargeCategoryByPK(goodsLargeCategory);
		
		return goodsLarge;
	}
	
	// 특정 판매 상품 카테고리 소분류 조희
	public GoodsSmallCategory getGoodsSmallCategoryByPK(String goodsSmallCategory) {
		
		// 특정 판매 상품 카테고리 소분류
		GoodsSmallCategory goodsSmall = categoryMapper.getGoodsSmallCategoryByPK(goodsSmallCategory);
		
		return goodsSmall;
	}
	
	// 특정 상품 문의 카테고리 조희
	public GoodsQnaCategory getGoodsQnaCategoryByPK(String goodsQnaCategory) {
		
		// 특정 상품 문의 카테고리 
		GoodsQnaCategory goodsQna = categoryMapper.getGoodsQnaCategoryByPK(goodsQnaCategory);
		
		return goodsQna;
	}
	
	//==============================내역 조회============================== 
	
	// 구매자 등급 카테고리 수청 처리 
    public void modifyLevelBuyerCategory(LevelBuyerCategory levelBuyerCategory) {
    	
    	categoryMapper.modifyLevelBuyerCategory(levelBuyerCategory);
    };

	
	//==============================수정 처리============================== 
	
	
	//==============================등록 처리============================== 
    
    // 구매자 등급 카테고리 등록 처리
    public void addLevelBuyerCategory(LevelBuyerCategory levelBuyerCategory) {
    	
    	categoryMapper.addLevelBuyerCategory(levelBuyerCategory);
    }
    
    // 마지막 인덱스에 저장되어 있는 PK값을 조회
    public String getLastIndexOfLevelBuyerCategoryPK() {
    	
    	// 마지막 인덱스에 저장되어 있는 PK값
    	String lastIndexOfLevelBuyerCategoryPK = categoryMapper.getLastIndexOfLevelBuyerCategoryPK();
    	
    	return lastIndexOfLevelBuyerCategoryPK;
    };

    //==============================등록 처리============================== 
    
    //==============================삭제 처리============================== 
    
    // 구매자 등급 카테고리 삭제 처리
    public void removeLevelBuyerCategory(String levelCode) {
    	
    	categoryMapper.removeLevelBuyerCategory(levelCode);
    }
    
    //==============================삭제 처리============================== 
    
    //==============================검색 처리============================== 
    
    // 구매자 등급 카테고리 검색 처리
    public List<LevelBuyerCategory> searchLevelBuyerCategory(Map<String, Object> paramMap){
    	
    	// 구매자 등급 카테고리 검색 결과
    	List<LevelBuyerCategory> searchResult = categoryMapper.searchLevelBuyerCategory(paramMap);
    	
    	return searchResult;
    }
    
    //==============================검색 처리============================== 
    
}
