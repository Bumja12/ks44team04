package ks44team04.mapper;

import ks44team04.dto.Right;
import ks44team04.dto.Dormant;
import ks44team04.dto.Leave;
import ks44team04.dto.Login;
import ks44team04.dto.Seller;
import ks44team04.dto.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public String userLogin(String userId);
    public User getLoginUserInfo(String userId);
    
	//회원 가입
	public int addUser(User user);
    
	//회원 수정
	public int modifyUser(User user);
	
	//특정 판매자 정보 조회
	public Seller getSellerInfoById(String sellerId);
	
	//특정 회원 정보 조회
	public User getUserInfoById(String userId);
	
	//로그 조회
	public List<Login> getLoginList();
	
	//탈퇴회원 목록 조회
	public List<Leave> getLeaveList();
	
	//휴면회원 목록 조회
    public List<Dormant> getDormantList();
    
	//판매자 목록 조회
	public List<Seller> getSellerList();

	//회원 권한 조회
	public List<Right> getRightList();
	
	//회원 목록 조회
	public List<User> getUserList();
   
}
