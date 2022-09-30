package ks44team04.service;

import ks44team04.mapper.UserMapper;
import ks44team04.dto.Dormant;
import ks44team04.dto.Goods;
import ks44team04.dto.Leave;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.Login;
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
    
    //판매자 신청
    public void addSeller(Seller seller) {
    	int addSellerResult = userMapper.addSeller(seller);
    	System.out.println("회원가입 결과:" + addSellerResult);
    }
    
    //회원가입
    public void addUser(User user) {
    	int addUserResult = userMapper.addUser(user);
    	System.out.println("회원가입 결과:" + addUserResult);
    }
    
	//회원수정
	public void modifyUser(User user) {
		userMapper.modifyUser(user);
	}
    
	//특정 판매자 판매상품 조회
	public List<Goods> getGoodsList(String sellerId) {
    	List<Goods> goodsList = userMapper.getGoodsList(sellerId);
    	
    	return goodsList;
    }
	

	//특정 판매자 상세정보 조회
	public Seller getSellerInfoById(String sellerId) {
		Seller seller = userMapper.getSellerInfoById(sellerId);
		
		return seller;
	}
	
	//특정 회원 상세정보 조회(판매자만)
	public Seller getUserInfoByIdS(String sellerId) {
		Seller seller = userMapper.getUserInfoByIdS(sellerId);
		
		return seller;
	}
	
	//특정 회원 정보 조회
	public User getUserInfoById(String userId) {
		User user = userMapper.getUserInfoById(userId);
		
		return user;
	}
    
    //로그 조회
    public List<Login> getLoginList() {
    	List<Login> loginList = userMapper.getLoginList();
    	
    	return loginList;
    }
    
    //탈퇴회원 목록 조회
    public List<Leave> getLeaveList() {
    	List<Leave> leaveList = userMapper.getLeaveList();
    	
    	return leaveList;
    }
    
    //휴면회원 목록 조회
    public List<Dormant> getDormantList() {
    	List<Dormant> dormantList = userMapper.getDormantList();
    	
    	return dormantList;
    }
    
    //판매자 목록 조회
    public List<Seller> getSellerList() {
    	List<Seller> sellerList = userMapper.getSellerList();
    	
    	return sellerList;
    }
    
    //레벨 조회
	public List<LevelBuyerCategory> getLevelBuyer() {
		List<LevelBuyerCategory> levelBuyer = userMapper.getLevelBuyer();
		
		return levelBuyer;
	}
	public List<LevelSellerCategory> getLevelSeller() {
		List<LevelSellerCategory> levelSeller = userMapper.getLevelSeller();
		
		return levelSeller;
	}
    
    //권한 조회
	public List<Right> getRightList() {
		List<Right> rightList = userMapper.getRightList();
		
		return rightList;
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
