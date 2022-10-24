package ks44team04.service;

import ks44team04.mapper.UserMapper;
import ks44team04.dto.Dormant;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.Leave;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.Login;
import ks44team04.dto.Right;
import ks44team04.dto.Search;
import ks44team04.dto.Seller;
import ks44team04.dto.User;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);

    private final UserMapper userMapper;
    
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    
    /* =============== 구매자/판매자 등급관리 시작 =============== */
	//구매자 등급조건 누적 관리 대상 ID 목록
	public List<String> buyerTotalList() {
		return userMapper.buyerTotalList();
	}
	
	//판매자 등급조건 누적 관리 대상 ID 목록
	public List<String> sellerTotalList() {
		return userMapper.sellerTotalList();
	}
	
	//구매자 등급 관리 - buyer_total / tb_user / level_buyer_status
	public int buyerLevelManage(String userId) {
		return userMapper.buyerLevelManage(userId);
	}
	
	/* =============== 구매자/판매자 등급관리 끝 =============== */

    
    /* =============== 검색 시작 =============== */
    //판매자 검색
	public List<Seller> searchSellerList(Map<String, Object> searchMap) {
		List<Seller> sellerList = userMapper.searchSellerList(searchMap);
		return sellerList;
	}
    
    //회원검색
	public List<User> searchUserList(Search search) {
		List<User> userList = userMapper.searchUserList(search);
		if(userList != null) {
			for(User user : userList) {
				
				String userLevel = user.getUserLevel();
				
				if(userLevel != null) {
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
					}
				}else {
				user.setUserLevelName("-");
			}
			log.info("user.getUserLevelName(), {}", user.getUserLevelName());
			}
		}
		return userList;
	}
    /* =============== 검색 끝 =============== */
    
    
    /* =============== 휴면 시작 =============== */
    //(휴면해제2) 휴면해제 클릭시 휴면 테이블 '휴면해제'
    public void dormantToNormal2(String loginId) {
    	userMapper.dormantToNormal2(loginId);
    }
    
	//(휴면해제1) 휴면해제 클릭시 회원상태 '정상'
	public void dormantToNormal1(String userId) {
		userMapper.dormantToNormal1(userId);
	}
	
	//(휴면처리3) 휴면 테이블에 insert
	public void insertDormant(String userId) {
		userMapper.insertDormant(userId);
	}
	
	//(휴면처리2) 회원상태 '휴면'으로
	public void normalToDormant(String userId) {
		userMapper.normalToDormant(userId);
	}
	
	//(휴면처리1) 휴면 대상 아이디 목록
	public List<String> getDormantId() {
		return userMapper.getDormantId();
	}
	/* =============== 휴면 끝 =============== */
	
	
	/* =============== 탈퇴 시작 =============== */
    //10/13 회원 탈퇴
  	public int removeUser(String userId, String userRight, String userInfoKeep) {
  		
  		int resultRemove = 0;
  		
  		if(userInfoKeep.equals("탈퇴시까지")) {
  			// 권한별 삭제 
  			// 구매자
  			if(userRight.equals("buyer") || userRight.equals("seller_before")) {
  				resultRemove += userMapper.removeBuyerTotal(userId);
  				resultRemove += userMapper.removeBuyerLevelStatus(userId);
  				resultRemove += userMapper.removeCart(userId);
  				resultRemove += userMapper.removeWishlist(userId);
  				resultRemove += userMapper.removeAutoPayment(userId);
  				resultRemove += userMapper.updateRegularPostStatus(userId);
  				resultRemove += userMapper.removeAlertSend(userId);
  				resultRemove += userMapper.removeCouponStatus(userId);
  				resultRemove += userMapper.removeAddressList(userId);
  			}
  			// 판매자
  			if(userRight.equals("seller")) {
  				resultRemove += userMapper.removeSellerInfo(userId);
  				resultRemove += userMapper.removeSellerTotal(userId);
  				resultRemove += userMapper.removeSellerLevelStatus(userId);
  				resultRemove += userMapper.updateGoodsSaleCheck(userId);
  			}
  			// 공통 (1. 로그인이력 삭제 / 2. 회원 삭제 / 3. 탈퇴 테이블에 추가)
  			resultRemove += userMapper.moveToLeaveAtOnce(userId);
  			resultRemove += userMapper.removeLoginHistory(userId);
  			resultRemove += userMapper.removeUserInfo(userId);
  		}else {
  			//정보보관기간 1년 - userStatus '탈퇴'로 변경
  			resultRemove += userMapper.updateLeaveUserStatus(userId);
  			resultRemove += userMapper.moveToLeave1year(userId);
  		}
  		return resultRemove;
  	}
  	
  	// 10/13 회원 탈퇴를 위한 관리자 비밀번호
  	public String getAdminPw(String userPw) {
  		String adminPw = userMapper.getAdminPw(userPw);
  		return adminPw;
  	}
  	/* =============== 탈퇴 끝 =============== */
  	
    
    // 10/11 판매자 신청 승인 (seller 테이블)
    public void approveSeller(String sellerId, String approveId) {
    	userMapper.approveSeller(sellerId, approveId);
    }
    
	// 10/11 판매자 신청 승인 (user 테이블)
	public void approveSellerRight(String userId) {
		userMapper.approveSellerRight(userId);
	}
    
    // 10/11 이미 신청한 회원 판매자 등록 막기 (userId, sellerId 비교)
    public int isAddSeller(String sellerId) {
    	int cnt = userMapper.isAddSeller(sellerId);
    	System.out.println("이미 신청한 회원 판매자 등록 막기 : " + cnt);
    	return cnt;
    }
    
    // 10/10 판매자 휴대폰번호 중복체크
    public int phoneCheckS(String storePhone) {
    	int cnt = userMapper.phoneCheckS(storePhone);
    	System.out.println("판매자 휴대폰번호 중복체크 : " + cnt);
    	return cnt;
    }
    
    // 10/10 판매자 이메일 중복체크
    public int emailCheckS(String storeEmail) {
    	int cnt = userMapper.emailCheckS(storeEmail);
    	System.out.println("판매자 이메일 중복체크 : " + cnt);
    	return cnt;
    }
    
    // 10/10 판매자 상호명 중복체크
    public int storeNameCheck(String storeName) {
    	int cnt = userMapper.storeNameCheck(storeName);
    	System.out.println("판매자 상호명 중복체크 : " + cnt);
    	return cnt;
    }
    
    // 10/10 판매자코드 중복체크
    public int codeCheck(String sellerCode) {
    	int cnt = userMapper.codeCheck(sellerCode);
    	System.out.println("판매자 상호명 중복체크 : " + cnt);
    	return cnt;
    }
    
    //판매자 등록
    public void addSeller(Seller seller) {
    	int addSellerResult = userMapper.addSeller(seller);
    	System.out.println("판매자 등록 결과:" + addSellerResult);
    }
    
    // 10/8 회원 휴대폰번호 중복체크
    public int phoneCheckU(String userPhone) {
    	int cnt = userMapper.phoneCheckU(userPhone);
    	System.out.println("회원 휴대폰번호 중복체크 : " + cnt);
    	return cnt;
    }
    
    // 10/8 회원 이메일 중복체크
    public int emailCheckU(String userEmail) {
    	int cnt = userMapper.emailCheckU(userEmail);
    	System.out.println("회원 이메일 중복체크 : " + cnt);
    	return cnt;
    }
    
    // 10/8 회원 닉네임 중복체크
    public int nicknameCheck(String userNickname) {
    	int cnt = userMapper.nicknameCheck(userNickname);
    	System.out.println("회원 닉네임 중복체크 : " + cnt);
    	return cnt;
    }
    
	// 10/8 회원 아이디 중복체크
	public int idCheck(String userId) {
		int cnt = userMapper.idCheck(userId);
		System.out.println("아이디 중복체크 : " + cnt);
		return cnt;
	}
    
    //회원가입
    public void addUser(User user) {
    	int addUserResult = userMapper.addUser(user);
    	System.out.println("회원가입 결과:" + addUserResult);
    }
    
    //판매자 정보 수정
    public void modifySeller(Seller seller) {
    	userMapper.modifySeller(seller);
    }
    
	//회원 정보 수정
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
    
    //상품 카테고리 조회(판매자코드)
    public List<GoodsLargeCategory> getGoodsLargeCategory() {
    	List<GoodsLargeCategory> goodsLargeCategory = userMapper.getGoodsLargeCategory();
    	
    	return goodsLargeCategory;
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
				
				if(userLevel != null) {
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
					}
				}else {
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
