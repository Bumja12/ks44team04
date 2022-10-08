package ks44team04.mapper;

import ks44team04.dto.Dormant;
import ks44team04.dto.Goods;
import ks44team04.dto.GoodsLargeCategory;
import ks44team04.dto.Leave;
import ks44team04.dto.LevelBuyerCategory;
import ks44team04.dto.LevelSellerCategory;
import ks44team04.dto.Login;
import ks44team04.dto.Right;
import ks44team04.dto.Seller;
import ks44team04.dto.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public String userLogin(String userId);
    public User getLoginUserInfo(String userId);
    
    //판매자 등록
    public int addSeller(Seller seller);
    
    //회원 휴대폰번호 중복체크
    public int phoneCheck(String userPhone);
    
    //회원 이메일 중복체크
    public int emailCheck(String userEmail);
    
    //회원 닉네임 중복체크
    public int nicknameCheck(String userNickname);

    //회원 아이디 중복체크
	public int idCheck(String userId);
    
	//회원 가입
	public int addUser(User user);
    
	//회원 수정
	public int modifyUser(User user);
	
	//특정 판매자 판매상품 조회
	public List<Goods> getGoodsList(String sellerId);
	
	//특정 판매자 상세정보 조회
	public Seller getSellerInfoById(String sellerId);
	
	//특정 회원 상세정보 조회(판매자만)
	public Seller getUserInfoByIdS(String sellerId);
	
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

	//상품 카테고리 조회(판매자코드)
	public List<GoodsLargeCategory> getGoodsLargeCategory();
	
	//회원 레벨 조회
	public List<LevelBuyerCategory> getLevelBuyer();
	public List<LevelSellerCategory> getLevelSeller();
	
	//회원 권한 조회
	public List<Right> getRightList();
	
	//회원 목록 조회
	public List<User> getUserList();
   
}
