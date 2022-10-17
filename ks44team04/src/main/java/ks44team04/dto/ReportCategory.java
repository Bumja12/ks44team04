package ks44team04.dto;

public class ReportCategory {

    private String reportCategory; // 신고 카테고리 PK
    private String categoryName;   // 카테고리명
    private String userId;		   // 회원 아이디 FK(등록인)
    private String regDate;		   // 등록일
    private String useCheck;	   // 사용 여부

    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        return "ReportCategory{" +
                "reportCategory='" + reportCategory + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", userId='" + userId + '\'' +
                ", regDate='" + regDate + '\'' +
                ", useCheck='" + useCheck + '\'' +
                '}';
    }
}
