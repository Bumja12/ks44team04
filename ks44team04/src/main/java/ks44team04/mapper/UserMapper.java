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
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    public String userLogin(String userId);
    public User getLoginUserInfo(String userId);
    
    //유저 마이페이지 
    public String myPage();
    
    //판매자 신청 승인(seller 테이블)
    public int approveSeller(@Param(value="sellerId")String sellerId, @Param(value="approveId")String approveId);
    
    //판매자 신청 승인 (user 테이블)
    public int approveSellerRight(String userId);
    
    //이미 판매자신청 한 회원 판매자신청 불가
    public int isAddSeller(String sellerId);
    
    //판매자 등록
    public int addSeller(Seller seller);
    
    //판매자 휴대폰번호 중복체크
    public int phoneCheckS(String storePhone);
    
    //판매자 이메일 중복체크
    public int emailCheckS(String storeEmail);
    
    //판매자 상호명 중복체크
    public int storeNameCheck(String storeName);
    
    //판매자코드 중복체크
    public int codeCheck(String sellerCode);
    
    //회원 휴대폰번호 중복체크
    public int phoneCheckU(String userPhone);
    
    //회원 이메일 중복체크
    public int emailCheckU(String userEmail);
    
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
