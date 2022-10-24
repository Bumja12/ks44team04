package ks44team04.mapper;

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

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
	
    
	/* =============== 구매자/판매자 등급관리 시작 =============== */
	//구매자 등급조건 누적 관리 대상 ID 목록
	public List<String> buyerTotalList();
	
	//(스케줄러) 구매자 등급조건 누적 관리 - 6개월 누적구매금액
	public int buyerTotal(String userId);
	
	//판매자 등급조건 누적 관리 대상 ID 목록
	
	
	//(스케줄러) 판매자 등급조건 누적 관리 - 12개월 누적판매금액, 건수, 별점평균
	
	/* =============== 구매자/판매자 등급관리 끝 =============== */

	
    /* =============== 검색 시작 =============== */
    //판매자 검색
  	public List<Seller> searchSellerList(Map<String, Object> searchMap);
    
    //회원검색
  	public List<User> searchUserList(Search search);
    /* =============== 검색 끝 =============== */
    
    
    /* =============== 휴면 시작 =============== */
    //(휴면해제2) 휴면해제 클릭시 휴면 테이블 '휴면해제'
    public int dormantToNormal2(String loginId);

    //(휴면해제1) 휴면해제 클릭시 회원상태 '정상'
    public int dormantToNormal1(String userId);
    
    //(휴면처리3) 휴면 테이블에 insert
    public int insertDormant(String userId);
    
    //(휴면처리2) 회원상태 '휴면'으로
    public int normalToDormant(String userId);
    
    //(휴면처리1) 휴면 대상 아이디 목록
    public List<String> getDormantId();
    /* =============== 휴면 끝 =============== */
    
    
    /* =============== 회원 탈퇴 시작 =============== */
    //(판매자) 판매상품 판매중지여부 Y로 변경
    public int updateGoodsSaleCheck(String userId);
    
    //(판매자) 판매자 등급현황 삭제
    public int removeSellerLevelStatus(String userId);
    
    //(판매자) 판매자 등급조건 누적 관리 삭제
    public int removeSellerTotal(String userId);
    
    //(판매자) 판매자 정보 지우기
    public int removeSellerInfo(String userId);
    
    //(구매자) 배송지목록 정보 지우기
    public int removeAddressList(String userId);
    
    //(구매자) 쿠폰보유현황 삭제
    public int removeCouponStatus(String userId);
    
    //(구매자) 알림전송내역 삭제
    public int removeAlertSend(String userId);
    
    //(구매자) 정기배송현황 상태 취소로 수정
    public int updateRegularPostStatus(String userId);
    
    //(구매자) 자동 결제 정보 삭제
    public int removeAutoPayment(String userId);
    
    //(구매자) 관심상품 삭제
    public int removeWishlist(String userId);
    
    //(구매자) 장바구니 삭제
    public int removeCart(String userId);
    
    //(구매자) 구매자 등급현황 삭제
    public int removeBuyerLevelStatus(String userId);
    
    //(구매자) 구매자 등급조건 누적 관리 삭제
    public int removeBuyerTotal(String userId);
    
    //(공통3-1) 탈퇴 테이블에 추가 정보보관기간: 1년
    public int moveToLeave1year(String userId);
    
    //(공통3-2) 탈퇴 테이블에 추가 정보보관기간: 탈퇴시까지
    public int moveToLeaveAtOnce(String userId);
    
    //(공통2) 로그인 이력 삭제
    public int removeLoginHistory(String userId);
    
    //(공통1) 회원 정보 지우기
    public int removeUserInfo(String userId);
    
    //(공통) 정보보관기간 1년일경우 회원 상태 변경
    public int updateLeaveUserStatus(String userId);
    
    //회원 탈퇴를 위한 관리자 비밀번호
  	public String getAdminPw(String userPw);
    /* =============== 회원 탈퇴 끝 =============== */
    
    
    //판매자 신청 승인(seller 테이블)
    public int approveSeller(@Param(value="sellerId")String sellerId, @Param(value="approveId")String approveId);
    
    //판매자 신청 승인 (user 테이블)
    public int approveSellerRight(String userId);
    
    //이미 판매자신청 한 회원 판매자신청 불가
    public int isAddSeller(String sellerId);
    
    //판매자 등록
    public int addSeller(Seller seller);
    
    
    /* =============== 회원,판매자 등록 / 중복체크 시작 =============== */
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
	/* =============== 회원,판매자 등록 / 중복체크 끝 =============== */
	   
	
	/* =============== 회원, 판매자 수정 시작 =============== */
	// 10/13 판매자 정보 수정
	public int modifySeller(Seller seller);

	//회원 정보 수정
	public int modifyUser(User user);
	/* =============== 회원, 판매자 수정 끝 =============== */
	
	
	/* =============== 조회 시작 =============== */
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
	/* =============== 조회 끝 =============== */
	
	//로그인
    public String userLogin(String userId);
    
    public User getLoginUserInfo(String userId);
}
