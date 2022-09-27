package ks44team04.dto;

public class User {

    private String userId;
    private String userPw;
    private String userName;
    private String userGender;
    private String userNickname;
    private String userAddress;
    private String userAddress2;
    private String userPhone;
    private String userEmail;
    private String userRight;
    private String userLevelName;
    private String userRegDate;
    private String userUpdateDate;
    private String userStatus;
    private int userPenalty;
    private int userPoint;
    private String userInfoKeep;
    private String userLevel;
    private LevelSellerCategory levelSeller;
    private LevelBuyerCategory levelBuyer;
    private Right rightDto;

    public LevelSellerCategory getLevelSeller() {
    	return levelSeller;
    }
    
    public void setLevelSeller(LevelSellerCategory levelSeller) {
    	this.levelSeller = levelSeller;
    }
    
    public LevelBuyerCategory getLevelBuyer() {
    	return levelBuyer;
    }
    
    public void setLevelBuyer(LevelBuyerCategory levelBuyer) {
    	this.levelBuyer = levelBuyer;
    }
    
	public Right getRightDto() {
		return rightDto;
	}
	
	public void setRightDto(Right rightDto) {
		this.rightDto = rightDto;
	}
    
    public String getUserLevelName() {
		return userLevelName;
	}

	public void setUserLevelName(String userLevelName) {
		this.userLevelName = userLevelName;
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    
    public String getUserAddress2() {
        return userAddress2;
    }

    public void setUserAddress2(String userAddress2) {
        this.userAddress2 = userAddress2;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserRight() {
        return userRight;
    }

    public void setUserRight(String userRight) {
        this.userRight = userRight;
    }

    public String getUserRegDate() {
        return userRegDate;
    }

    public void setUserRegDate(String userRegDate) {
        this.userRegDate = userRegDate;
    }

    public String getUserUpdateDate() {
        return userUpdateDate;
    }

    public void setUserUpdateDate(String userUpdateDate) {
        this.userUpdateDate = userUpdateDate;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public int getUserPenalty() {
        return userPenalty;
    }

    public void setUserPenalty(int userPenalty) {
        this.userPenalty = userPenalty;
    }

    public int getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }

    public String getUserInfoKeep() {
        return userInfoKeep;
    }

    public void setUserInfoKeep(String userInfoKeep) {
        this.userInfoKeep = userInfoKeep;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userName='" + userName + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userRight='" + userRight + '\'' +
                ", userRightName='" + userLevelName + '\'' +
                ", userRegDate='" + userRegDate + '\'' +
                ", userUpdateDate='" + userUpdateDate + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", userPenalty=" + userPenalty +
                ", userPoint=" + userPoint +
                ", userInfoKeep='" + userInfoKeep + '\'' +
                ", userLevel='" + userLevel + '\'' +
                '}';
    }
}
