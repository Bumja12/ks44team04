package ksmart.ocltest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart.ocltest.dto.Member;

@Mapper
public interface MemberMapper {
	//회원 목록 조회
	public List<Member> getMemberList(Map<String, Object> paramMap);
	
}
