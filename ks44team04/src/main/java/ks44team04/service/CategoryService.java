package ks44team04.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.dto.CustomerAskCategory;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.RegularAskCategory;
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
}
