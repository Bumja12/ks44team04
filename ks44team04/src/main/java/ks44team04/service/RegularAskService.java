package ks44team04.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team04.dto.RegularAsk;
import ks44team04.mapper.RegularAskMapper;

@Service
public class RegularAskService {
	
	// Logger
	private static final Logger log = LoggerFactory.getLogger(RegularAskService.class);

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
}
