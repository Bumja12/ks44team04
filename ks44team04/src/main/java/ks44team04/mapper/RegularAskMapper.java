package ks44team04.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.RegularAsk;

@Mapper
public interface RegularAskMapper {

	// 자주 묻는 질문 목록 조회
	public List<RegularAsk> getRegularAskList (); 
	
	// 특정 자주 묻는 질문 조회
	public RegularAsk getRegularAskByPK(String regularAskPK); 
	
	// 자주 묻는 질문 수청 처리 
    public void modifyRegularAsk(RegularAsk regularAsk);
    
    // 자주 묻는 질문 등록 처리 
    public void addRegularAsk(RegularAsk regularAsk);
    
    // 마지막 인덱스에 저장되어 있는 자주 묻는 질문의 PK값을 조회
    public String getLastIndexOfRegularAskPK();
    
    // 자주 묻는 질문 검색
    public List<RegularAsk> searchRegularAsk(Map<String, Object> paramMap);
    
    // 자주 묻는 질문 삭제
    public void removeRegularAsk(String regularAskPK);
    
}
