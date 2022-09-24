package ks44team04.admin.service;

import ks44team04.admin.mapper.UserMapper;
import ks44team04.dto.Right;
import ks44team04.dto.Seller;
import ks44team04.dto.User;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	
	private static final Logger log = LoggerFactory.getLogger(UserService.class);


    private final UserMapper userMapper;
    
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    
    //회원가입
    public void addUser(User user) {
    	int result = userMapper.addUser(user);
    	System.out.println("회원가입 결과:" + result);
    }
    
    //판매자 목록 조회
    public List<Seller> getSellerList() {
    	List<Seller> sellerList = userMapper.getSellerList();
    	
    	return sellerList;
    }
    
    //레벨 조회
	public List<Right> getRightList() {
		List<Right> RightList = userMapper.getRightList();
		
		return RightList;
	}
    
	//전체 회원 목록 조회
	public List<User> getUserList() {
		List<User> userList = userMapper.getUserList();
		
		if(userList != null) {
			for(User user : userList) {
				
				String userLevel = user.getUserLevel();
				String lvName = userLevel.substring(userLevel.length() - 2);
				
				if(userLevel.contains("Buyer")) {
					if(lvName.equals("01")) {
						user.setUserLevelName("씨앗");
					}else if(lvName.equals("02")) {
						user.setUserLevelName("새싹");
					}else if(lvName.equals("03")) {
						user.setUserLevelName("잎새");
					}else if(lvName.equals("04")) {
						user.setUserLevelName("열매");
					}
				}else if(userLevel.contains("Seller")) {
					if(lvName.equals("01")) {
						user.setUserLevelName("물방울");
					}else if(lvName.equals("02")) {
						user.setUserLevelName("시냇물");
					}else if(lvName.equals("03")) {
						user.setUserLevelName("호수");
					}else if(lvName.equals("04")) {
						user.setUserLevelName("강");
					}
				}else if(userLevel != null) {
					user.setUserLevelName("-");
				}
				log.info("user.getUserLevelName(), {}", user.getUserLevelName());
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
    
}
