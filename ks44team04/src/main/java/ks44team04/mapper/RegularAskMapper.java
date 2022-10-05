package ks44team04.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.RegularAsk;

@Mapper
public interface RegularAskMapper {

	// 자주 묻는 질문 목록 조회
	public List<RegularAsk> getRegularAskList (); 
	
	// 특정 자주 묻는 질문 조회
	public RegularAsk getRegularAskByPK(String regularAskPK); 
	
}
