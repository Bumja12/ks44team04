package ks44team04.dto;

public class Alert {

    private String alertCode;
    private String alertContent;
    private String regId;
    private String regDate;
    private String modifyId;
    private String modifyDate;

    public String getAlertCode() {
        return alertCode;
    }

    public void setAlertCode(String alertCode) {
        this.alertCode = alertCode;
    }

    public String getAlertContent() {
        return alertContent;
    }

    public void setAlertContent(String alertContent) {
        this.alertContent = alertContent;
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

    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "alertCode='" + alertCode + '\'' +
                ", alertContent='" + alertContent + '\'' +
                ", regId='" + regId + '\'' +
                ", regDate='" + regDate + '\'' +
                ", modifyId='" + modifyId + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                '}';
    }
}
