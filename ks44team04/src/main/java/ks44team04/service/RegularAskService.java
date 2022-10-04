package ks44team04.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ks44team04.dto.RegularAskCategory;
import ks44team04.mapper.CategoryManageMapper;

@org.springframework.stereotype.Service
public class RegularAskService {
	
	private static final Logger log = LoggerFactory.getLogger(RegularAskService.class);

	private final CategoryManageMapper categoryManageMapper;
	
	public RegularAskService(CategoryManageMapper categoryManageMapper) {
		this.categoryManageMapper = categoryManageMapper;
	}
	
	public RegularAskCategory getRegularAskCategory() {
		
		RegularAskCategory regularAskCategory = categoryManageMapper.getRegularAskCategory();
		log.info(regularAskCategory.toString());
		
		return null;
	}
}
