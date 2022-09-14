package ks44team04.dto;

public class Leave {

    private String leaveCode;
    private String loginId;
    private String leaveReason;
    private String leaveDate;
    private String userInfoDestroy;

    public String getLeaveCode() {
        return leaveCode;
    }

    public void setLeaveCode(String leaveCode) {
        this.leaveCode = leaveCode;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getUserInfoDestroy() {
        return userInfoDestroy;
    }

    public void setUserInfoDestroy(String userInfoDestroy) {
        this.userInfoDestroy = userInfoDestroy;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "leaveCode='" + leaveCode + '\'' +
                ", loginId='" + loginId + '\'' +
                ", leaveReason='" + leaveReason + '\'' +
                ", leaveDate='" + leaveDate + '\'' +
                ", userInfoDestroy='" + userInfoDestroy + '\'' +
                '}';
    }
}
