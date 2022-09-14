package ks44team04.dto;

public class ReportRule {

    private String reportCode;
    private String reportReason;
    private String reportDate;
    private String userId;
    private String useCheck;
    private int penaltyPoint;

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }

    public String getReportReason() {
        return reportReason;
    }

    public void setReportReason(String reportReason) {
        this.reportReason = reportReason;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUseCheck() {
        return useCheck;
    }

    public void setUseCheck(String useCheck) {
        this.useCheck = useCheck;
    }

    public int getPenaltyPoint() {
        return penaltyPoint;
    }

    public void setPenaltyPoint(int penaltyPoint) {
        this.penaltyPoint = penaltyPoint;
    }

    @Override
    public String toString() {
        return "ReportRule{" +
                "reportCode='" + reportCode + '\'' +
                ", reportReason='" + reportReason + '\'' +
                ", reportDate='" + reportDate + '\'' +
                ", userId='" + userId + '\'' +
                ", useCheck='" + useCheck + '\'' +
                ", penaltyPoint=" + penaltyPoint +
                '}';
    }
}
