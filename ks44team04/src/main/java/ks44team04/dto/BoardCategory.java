package ks44team04.dto;

public class BoardCategory {

	private String boardCategory; // 게시판 카테고리 PK
	private String categoryName;  // 카테고리명
	private String regId;   	  // 회원 아이디 FK(등록)
	private String regDate; 	  // 등록일 
	private String useCheck; 	  // 사용 여부

	public String getBoardCategory() {
		return boardCategory;
	}

	public void setBoardCategory(String boardCategory) {
		this.boardCategory = boardCategory;
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
		return "BoardCategory{" + "boardCategory='" + boardCategory + '\'' + ", categoryName='" + categoryName + '\''
				+ ", regId='" + regId + '\'' + ", regDate='" + regDate + '\'' + ", useCheck='" + useCheck + '\'' + '}';
	}
}
