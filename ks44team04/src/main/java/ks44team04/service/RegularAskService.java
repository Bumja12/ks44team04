package ks44team04.service;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.dto.RegularAsk;
import ks44team04.mapper.RegularAskMapper;

@Service
public class RegularAskService {
	
	// Logger
	// private static final Logger log = LoggerFactory.getLogger(RegularAskService.class);

	// 자주 묻는 질문 매퍼 의존성 주입
	private final RegularAskMapper regularAskMapper;
	
	// 생성자 메소드
	public RegularAskService(RegularAskMapper regularAskMapper) {
		this.regularAskMapper = regularAskMapper;
	}
	
	// 자주 묻는 질문 목록 조회
	public List<RegularAsk> getRegularAskList(){
		
		// 자주 묻는 질문 목록
		List<RegularAsk> regularAskList = regularAskMapper.getRegularAskList();
		// log.info(regularAskList.toString());
		return regularAskList;
	}
	
	// 특정 자주 묻는 질문 조회
	public RegularAsk getRegularAskByPK(String regularAskPK) {
		
		// 특정 자주 묻는 질문
		RegularAsk regularAsk = regularAskMapper.getRegularAskByPK(regularAskPK);
		// System.out.println(regularAsk.toString());
		return regularAsk;
	}
	
	//자주 묻는 질문 수청 처리 
    public void modifyRegularAsk(RegularAsk regularAsk) {
    	
    	regularAskMapper.modifyRegularAsk(regularAsk);
    };
    
    // 마지막 인덱스에 저장되어 있는 자주 묻는 질문의 PK값을 조회
    public String getLastIndexOfRegularAskPK() {
    	
    	// 마지막 인덱스에 저장되어 있는 자주 묻는 질문의 PK값
    	String lastIndexOfRegularAskPK = regularAskMapper.getLastIndexOfRegularAskPK();
    	// System.out.println(lastIndexOfRegularAskPK);
    	return lastIndexOfRegularAskPK;
    };
    
    // 자주 묻는 질문 등록 처리 
    public void addRegularAsk(RegularAsk regularAsk) {
    	
    	regularAskMapper.addRegularAsk(regularAsk);
    }
    
    // 자주 묻는 질문 검색
    public List<RegularAsk> searchRegularAsk(Map<String, Object> paramMap){
    	
    	List<RegularAsk> searchResult = regularAskMapper.searchRegularAsk(paramMap);
    	// System.out.println(searchResult);
    	
		return searchResult;
    }
    
    // 자주 묻는 질문 삭제
    public void removeRegularAsk(String regularAskPK) {
    	
    	regularAskMapper.removeRegularAsk(regularAskPK);
    };

}
