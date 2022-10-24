package ks44team04.dto;

public class BoardComment {

    private String boardComment;
    private String boardCode;
    private String userId;
    private String commentContent;
    private String coRegDate;
    private String coModifyDate;

	private User userInfo;
	public BoardCategory boardCategoryInfo;
	private Board boardInfo;
	public String getBoardComment() {
		return boardComment;
	}
	public void setBoardComment(String boardComment) {
		this.boardComment = boardComment;
	}
	public String getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(String boardCode) {
		this.boardCode = boardCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCoRegDate() {
		return coRegDate;
	}
	public void setCoRegDate(String coRegDate) {
		this.coRegDate = coRegDate;
	}
	public String getCoModifyDate() {
		return coModifyDate;
	}
	public void setCoModifyDate(String coModifyDate) {
		this.coModifyDate = coModifyDate;
	}
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
	public BoardCategory getBoardCategoryInfo() {
		return boardCategoryInfo;
	}
	public void setBoardCategoryInfo(BoardCategory boardCategoryInfo) {
		this.boardCategoryInfo = boardCategoryInfo;
	}
	public Board getBoardInfo() {
		return boardInfo;
	}
	public void setBoardInfo(Board boardInfo) {
		this.boardInfo = boardInfo;
	}
	@Override
	public String toString() {
		return "BoardComment [boardComment=" + boardComment + ", boardCode=" + boardCode + ", userId=" + userId
				+ ", commentContent=" + commentContent + ", coRegDate=" + coRegDate + ", coModifyDate=" + coModifyDate
				+ ", userInfo=" + userInfo + ", boardCategoryInfo=" + boardCategoryInfo + ", boardInfo=" + boardInfo
				+ "]";
	}
	
	
}
