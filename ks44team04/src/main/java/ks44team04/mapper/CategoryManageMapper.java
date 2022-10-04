package ks44team04.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.RegularAskCategory;

@Mapper
public interface CategoryManageMapper {
	
	public List<RegularAskCategory>  getRegularAskCategory();
	
}
