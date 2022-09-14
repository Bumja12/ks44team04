package ks44team04.dto;

public class AlertSend {

    private String alertSend;
    private String alertCode;
    private String receiveId;
    private String sendId;
    private String receiveDate;
    private String sendDate;

    public String getAlertSend() {
        return alertSend;
    }

    public void setAlertSend(String alertSend) {
        this.alertSend = alertSend;
    }

    public String getAlertCode() {
        return alertCode;
    }

    public void setAlertCode(String alertCode) {
        this.alertCode = alertCode;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return "AlertSend{" +
                "alertSend='" + alertSend + '\'' +
                ", alertCode='" + alertCode + '\'' +
                ", receiveId='" + receiveId + '\'' +
                ", sendId='" + sendId + '\'' +
                ", receiveDate='" + receiveDate + '\'' +
                ", sendDate='" + sendDate + '\'' +
                '}';
    }
}
