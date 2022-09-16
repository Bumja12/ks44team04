package ks44team04.admin.service;

import ks44team04.admin.mapper.UserMapper;
import ks44team04.dto.Level;
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
    
    
	//회원가입
	public void addUser(User user) {
        int result = userMapper.addUser(user);
        System.out.println("회원가입 결과:" + result);
    }
    
    //레벨 조회
	public List<Level> getLevelList() {
		List<Level> LevelList = userMapper.getLevelList();
		
		return LevelList;
	}
    
	//전체 회원 목록 조회
	public List<User> getUserList() {
		List<User> userList = userMapper.getUserList();
		
		if(userList != null) {
			for(User user : userList) {
				String userRight = user.getUserRight();
				
				if(userRight == "admin") {
					user.setUserRightName("관리자");
				}else if(userRight == "seller") {
					user.setUserRightName("판매자");
				}else if(userRight == "buyer") {
					user.setUserRightName("구매자");
				}else if(userRight == "seller_before") {
					user.setUserRightName("판매자 승인 전");
				}else {
					user.setUserRightName("회원");
				}
			}
		}
		return userList;
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
