package ks44team04.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team04.dto.CustomerAskCategory;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.RegularAskCategory;

@Mapper
public interface CategoryMapper {

	// 구매자 등급 카테고리 목록 조희
	public List<LevelBuyerCategory> getLevelBuyerCategoryList();
	
	// 판매자 등급 카테고리 목록 조희
	public List<LevelSellerCategory> getLevelSellerCategoryList();
	
	// 고객 문의 카테고리 목록 조희
	public List<CustomerAskCategory> getCustomerAskCategoryList();
	
	// 자주 묻는 질문 카테고리 목록 조희
	public List<RegularAskCategory> getRegularAskCategoryList();
	
}
