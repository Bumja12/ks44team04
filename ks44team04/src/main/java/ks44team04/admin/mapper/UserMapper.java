package ks44team04.admin.mapper;

import ks44team04.dto.Level;
import ks44team04.dto.Report;
import ks44team04.dto.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public String userLogin(String userId);
    public User getLoginUserInfo(String userId);
    
	//회원 권한 조회
	public List<Level> getLevelList();
	
	//회원 목록 조회
	public List<User> getUserList();
    
    //신고 리스트
    public List<Report> getReportList();
    
   
}
