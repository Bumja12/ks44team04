package ks44team04.dto;

public class Right {

    private String userRight;
    private String RightStatus;
    private String regId;
    private String regDate;
    private String useCheck;

 
    public String getUserRight() {
		return userRight;
	}


	public void setUserRight(String userRight) {
		this.userRight = userRight;
	}


	public String getRightStatus() {
		return RightStatus;
	}


	public void setRightStatus(String rightStatus) {
		RightStatus = rightStatus;
	}


	public String getRegId() {
		return regId;
	}


	public void setRegId(String regId) {
		this.regId = regId;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	public String getUseCheck() {
		return useCheck;
	}


	public void setUseCheck(String useCheck) {
		this.useCheck = useCheck;
	}


	@Override
    public String toString() {
        return "Level{" +
                "userLevel='" + userRight + '\'' +
                ", levelStatus='" + RightStatus + '\'' +
                ", regId='" + regId + '\'' +
                ", regDate='" + regDate + '\'' +
                ", useCheck='" + useCheck + '\'' +
                '}';
    }
}
