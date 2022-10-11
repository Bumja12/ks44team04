package ks44team04.dto;

// 자주 묻는 질문
public class RegularAsk {

    private String regularAskPK; // 자주 묻는 질문 PK
    private String regularAskCategory; // 자주 묻는 질문 카테고리 
    private String categoryName; // 자주 묻는 질문 카테고리 이름
    private String regId; // 회원 아이디 FK(작성자)
    private String regularAskTitle; // 제목
    private String regularAskContent; // 내용
    private String useCheck; // 사용 여부
    private String regDate; // 등록일
    private String updateDate; // 수정일
    
	public String getRegularAskPK() {
		return regularAskPK;
	}
	public void setRegularAskPK(String regularAskPK) {
		this.regularAskPK = regularAskPK;
	}
	public String getRegularAskCategory() {
		return regularAskCategory;
	}
	public void setRegularAskCategory(String regularAskCategory) {
		this.regularAskCategory = regularAskCategory;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getRegularAskTitle() {
		return regularAskTitle;
	}
	public void setRegularAskTitle(String regularAskTitle) {
		this.regularAskTitle = regularAskTitle;
	}
	public String getRegularAskContent() {
		return regularAskContent;
	}
	public void setRegularAskContent(String regularAskContent) {
		this.regularAskContent = regularAskContent;
	}
	public String getUseCheck() {
		return useCheck;
	}
	public void setUseCheck(String useCheck) {
		this.useCheck = useCheck;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "RegularAsk [regularAskPK=" + regularAskPK + ", regularAskCategory=" + regularAskCategory
				+ ", categoryName=" + categoryName + ", regId=" + regId + ", regularAskTitle=" + regularAskTitle
				+ ", regularAskContent=" + regularAskContent + ", useCheck=" + useCheck + ", regDate=" + regDate
				+ ", updateDate=" + updateDate + "]";
	}
}
