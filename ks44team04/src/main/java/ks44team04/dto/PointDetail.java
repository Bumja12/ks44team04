package ks44team04.dto;

public class PointDetail {

    private String pointDetail;
    private String userId;
    private int pointDealDetail;
    private String pointDetailCode;
    private String pointDetailSave;
    private String pointDealId;
    private String treatDate;
    private String pointEndDate;

    public String getPointDetail() {
        return pointDetail;
    }

    public void setPointDetail(String pointDetail) {
        this.pointDetail = pointDetail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPointDealDetail() {
        return pointDealDetail;
    }

    public void setPointDealDetail(int pointDealDetail) {
        this.pointDealDetail = pointDealDetail;
    }

    public String getPointDetailCode() {
        return pointDetailCode;
    }

    public void setPointDetailCode(String pointDetailCode) {
        this.pointDetailCode = pointDetailCode;
    }

    public String getPointDetailSave() {
        return pointDetailSave;
    }

    public void setPointDetailSave(String pointDetailSave) {
        this.pointDetailSave = pointDetailSave;
    }

    public String getPointDealId() {
        return pointDealId;
    }

    public void setPointDealId(String pointDealId) {
        this.pointDealId = pointDealId;
    }

    public String getTreatDate() {
        return treatDate;
    }

    public void setTreatDate(String treatDate) {
        this.treatDate = treatDate;
    }

    public String getPointEndDate() {
        return pointEndDate;
    }

    public void setPointEndDate(String pointEndDate) {
        this.pointEndDate = pointEndDate;
    }

    @Override
    public String toString() {
        return "PointDetail{" +
                "pointDetail='" + pointDetail + '\'' +
                ", userId='" + userId + '\'' +
                ", pointDealDetail=" + pointDealDetail +
                ", pointDetailCode='" + pointDetailCode + '\'' +
                ", pointDetailSave='" + pointDetailSave + '\'' +
                ", pointDealId='" + pointDealId + '\'' +
                ", treatDate='" + treatDate + '\'' +
                ", pointEndDate='" + pointEndDate + '\'' +
                '}';
    }
}
