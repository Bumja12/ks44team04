package ks44team04.dto;

public class BoardCategory {

	private String boardCategory;
	private String categoryName;
	private String regId;
	private String regDate;
	private String useCheck;

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
