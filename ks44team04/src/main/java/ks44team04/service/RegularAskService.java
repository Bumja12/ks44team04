package ks44team04.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.dto.RegularAskCategory;
import ks44team04.mapper.CategoryManageMapper;

@Service
public class RegularAskService {
	
	private static final Logger log = LoggerFactory.getLogger(RegularAskService.class);

// private final CategoryManageMapper categoryManageMapper;
	
	// public RegularAskService(CategoryManageMapper categoryManageMapper) {
		// this.categoryManageMapper = categoryManageMapper;
	// }
	
	public RegularAskCategory getRegularAskCategory() {
		
		// List<RegularAskCategory> regularAskCategoryList = categoryManageMapper.getRegularAskCategory();
		// log.info(regularAskCategoryList.toString());
		
		return null;
	}
}
