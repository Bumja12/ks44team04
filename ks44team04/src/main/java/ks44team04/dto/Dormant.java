package ks44team04.dto;

public class Dormant {

    private String dormantCode;
    private String loginId;
    private String dormantStatus;
    private String dormantChangeDate;

	public String getDormantCode() {
        return dormantCode;
    }

    public void setDormantCode(String dormantCode) {
        this.dormantCode = dormantCode;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getDormantStatus() {
        return dormantStatus;
    }

    public void setDormantStatus(String dormantStatus) {
        this.dormantStatus = dormantStatus;
    }

    public String getDormantChangeDate() {
        return dormantChangeDate;
    }

    public void setDormantChangeDate(String dormantChangeDate) {
        this.dormantChangeDate = dormantChangeDate;
    }

    @Override
    public String toString() {
        return "Dormant{" +
                "dormantCode='" + dormantCode + '\'' +
                ", loginId='" + loginId + '\'' +
                ", dormantStatus='" + dormantStatus + '\'' +
                ", dormantChangeDate='" + dormantChangeDate + '\'' +
                '}';
    }
}
