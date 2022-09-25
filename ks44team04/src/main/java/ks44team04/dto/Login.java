package ks44team04.dto;

public class Login {

   private int logCode;
   private String loginId;
   private String loginDate;
   private String logoutDate;

    public int getLogCode() {
        return logCode;
    }

    public void setLogCode(int logCode) {
        this.logCode = logCode;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(String logoutDate) {
        this.logoutDate = logoutDate;
    }

    @Override
    public String toString() {
        return "Login{" +
                "loginCode=" + logCode +
                ", loginId='" + loginId + '\'' +
                ", loginDate='" + loginDate + '\'' +
                ", logoutDate='" + logoutDate + '\'' +
                '}';
    }
}
