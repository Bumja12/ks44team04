package ks44team04.dto;

public class Report {

    private String reportHistoryCode;
    private String reportedId;
    private String reportingId;
    private String reportCategory;
    private String reportCode;
    private String reportWhat;
    private String reportReason;
    private String boardFile;
    private String reportDate;
    private String reportResult;
    private String reportResultReason;
    private String reportResultDate;
    private String reportApproveId;
    private int penaltyPoint;
    private int totalPenaltyPoint;
    private int banDate;
    private ReportCategory reportCategoryDto;
    private ReportRule reportRuleDto;
    

    public ReportRule getReportRuleDto() {
		return reportRuleDto;
	}

	public void setReportRuleDto(ReportRule reportRuleDto) {
		this.reportRuleDto = reportRuleDto;
	}

	public ReportCategory getReportCategoryDto() {
		return reportCategoryDto;
	}

	public void setReportCategoryDto(ReportCategory reportCategoryDto) {
		this.reportCategoryDto = reportCategoryDto;
	}

	public String getReportHistoryCode() {
        return reportHistoryCode;
    }

    public void setReportHistoryCode(String reportHistoryCode) {
        this.reportHistoryCode = reportHistoryCode;
    }

    public String getReportedId() {
        return reportedId;
    }

    public void setReportedId(String reportedId) {
        this.reportedId = reportedId;
    }

    public String getReportingId() {
        return reportingId;
    }

    public void setReportingId(String reportingId) {
        this.reportingId = reportingId;
    }

    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }

    public String getReportWhat() {
        return reportWhat;
    }

    public void setReportWhat(String reportWhat) {
        this.reportWhat = reportWhat;
    }

    public String getReportReason() {
        return reportReason;
    }

    public void setReportReason(String reportReason) {
        this.reportReason = reportReason;
    }

    public String getBoardFile() {
        return boardFile;
    }

    public void setBoardFile(String boardFile) {
        this.boardFile = boardFile;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportResult() {
        return reportResult;
    }

    public void setReportResult(String reportResult) {
        this.reportResult = reportResult;
    }

    public String getReportResultReason() {
        return reportResultReason;
    }

    public void setReportResultReason(String reportResultReason) {
        this.reportResultReason = reportResultReason;
    }

    public String getReportResultDate() {
        return reportResultDate;
    }

    public void setReportResultDate(String reportResultDate) {
        this.reportResultDate = reportResultDate;
    }

    public String getReportApproveId() {
        return reportApproveId;
    }

    public void setReportApproveId(String reportApproveId) {
        this.reportApproveId = reportApproveId;
    }

    public int getPenaltyPoint() {
        return penaltyPoint;
    }

    public void setPenaltyPoint(int penaltyPoint) {
        this.penaltyPoint = penaltyPoint;
    }

    public int getTotalPenaltyPoint() {
        return totalPenaltyPoint;
    }

    public void setTotalPenaltyPoint(int totalPenaltyPoint) {
        this.totalPenaltyPoint = totalPenaltyPoint;
    }

    public int getBanDate() {
        return banDate;
    }

    public void setBanDate(int banDate) {
        this.banDate = banDate;
    }

    @Override
	public String toString() {
		return "Report [reportHistoryCode=" + reportHistoryCode + ", reportedId=" + reportedId + ", reportingId="
				+ reportingId + ", reportCategory=" + reportCategory + ", reportCode=" + reportCode + ", reportWhat="
				+ reportWhat + ", reportReason=" + reportReason + ", boardFile=" + boardFile + ", reportDate="
				+ reportDate + ", reportResult=" + reportResult + ", reportResultReason=" + reportResultReason
				+ ", reportResultDate=" + reportResultDate + ", reportApproveId=" + reportApproveId + ", penaltyPoint="
				+ penaltyPoint + ", totalPenaltyPoint=" + totalPenaltyPoint + ", banDate=" + banDate
				+ ", reportCategoryDto=" + reportCategoryDto + ", reportRuleDto=" + reportRuleDto + "]";
	}
}
