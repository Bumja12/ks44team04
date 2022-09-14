package ks44team04.dto;

public class PointDeal {

    private String pointDealCode;
    private String userId;
    private String status;
    private int pointDealPrice;
    private String pointDealId;
    private String pointDealDate;
    private String pointEndDate;
    private String pointDealReason;
    private String pointDealReference;

    public String getPointDealCode() {
        return pointDealCode;
    }

    public void setPointDealCode(String pointDealCode) {
        this.pointDealCode = pointDealCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPointDealPrice() {
        return pointDealPrice;
    }

    public void setPointDealPrice(int pointDealPrice) {
        this.pointDealPrice = pointDealPrice;
    }

    public String getPointDealId() {
        return pointDealId;
    }

    public void setPointDealId(String pointDealId) {
        this.pointDealId = pointDealId;
    }

    public String getPointDealDate() {
        return pointDealDate;
    }

    public void setPointDealDate(String pointDealDate) {
        this.pointDealDate = pointDealDate;
    }

    public String getPointEndDate() {
        return pointEndDate;
    }

    public void setPointEndDate(String pointEndDate) {
        this.pointEndDate = pointEndDate;
    }

    public String getPointDealReason() {
        return pointDealReason;
    }

    public void setPointDealReason(String pointDealReason) {
        this.pointDealReason = pointDealReason;
    }

    public String getPointDealReference() {
        return pointDealReference;
    }

    public void setPointDealReference(String pointDealReference) {
        this.pointDealReference = pointDealReference;
    }

    @Override
    public String toString() {
        return "PointDeal{" +
                "pointDealCode='" + pointDealCode + '\'' +
                ", userId='" + userId + '\'' +
                ", status='" + status + '\'' +
                ", pointDealPrice=" + pointDealPrice +
                ", pointDealId='" + pointDealId + '\'' +
                ", pointDealDate='" + pointDealDate + '\'' +
                ", pointEndDate='" + pointEndDate + '\'' +
                ", pointDealReason='" + pointDealReason + '\'' +
                ", pointDealReference='" + pointDealReference + '\'' +
                '}';
    }
}
