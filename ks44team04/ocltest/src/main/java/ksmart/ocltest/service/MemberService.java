package ksmart.ocltest.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart.ocltest.dto.Member;
import ksmart.ocltest.mapper.MemberMapper;


@Service
@Transactional
public class MemberService {
	
	private static final Logger log = LoggerFactory.getLogger(MemberService.class);

	private MemberMapper memberMapper;

	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	
	public List<Member> getMemberList(Map<String, Object> paramMap){
		
		List<Member> memberList = memberMapper.getMemberList(paramMap);
		
		return memberList;
	}
	
	
	
}
