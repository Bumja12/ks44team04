package ks44team04.admin.service;

import ks44team04.admin.mapper.UserMapper;
import ks44team04.dto.Report;
import ks44team04.dto.User;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public String userLogin(String userId){
        String result = userMapper.userLogin(userId);
        return result;
    }

    public User getLoginUserInfo(String userId) {
        User loginUserInfo = userMapper.getLoginUserInfo(userId);
        return loginUserInfo;
    }
    
    //신고 리스트 
    public List<Report> getReportList(){
    	List<Report> reportList = userMapper.getReportList();
		return reportList;
	}

}
