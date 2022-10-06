package ks44team04.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.dto.RegularAskCategory;
import ks44team04.mapper.CategoryManageMapper;

@Service
public class CategoryManageService {
	
	// Logger
	private static final Logger log = LoggerFactory.getLogger(RegularAskService.class);

	// 카테고리 관리 매퍼 의존성 주입
	private final CategoryManageMapper categoryManageMapper;
	
	// 생성자 메소드
	public CategoryManageService(CategoryManageMapper categoryManageMapper) {
		this.categoryManageMapper = categoryManageMapper;
	}
	
	// 자주 묻는 질문 카테고리 목록 조희
	public List<RegularAskCategory> getRegularAskCategoryList(){
		
		// 자주 묻는 질문 카테고리 목록
		List<RegularAskCategory> regularAskCategoryList = categoryManageMapper.getRegularAskCategoryList();
		// log.info(regularAskCategoryList.toString());
		
		return regularAskCategoryList;
	}
	
}
