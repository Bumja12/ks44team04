package ks44team04.dto;

public class BoardComment {

    private String boardComment;
    private String boardCode;
    private String userId;
    private String commentContent;
    private String regDate;
    private String modifyDate;
    private int reportAmount;

	private User userInfo;
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
	public BoardCategory boardCategoryInfo;
	public BoardCategory getBoardCategoryInfo() {
		return boardCategoryInfo;
	}
	public void setBoardCategoryInfo(BoardCategory boardCategoryInfo) {
		this.boardCategoryInfo = boardCategoryInfo;
	}
	private Board boardInfo;
	public Board getBoardInfo() {
		return boardInfo;
	}
	public void setBoardInfo(Board boardInfo) {
		this.boardInfo = boardInfo;
	}
    
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

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public int getReportAmount() {
        return reportAmount;
    }

    public void setReportAmount(int reportAmount) {
        this.reportAmount = reportAmount;
    }

    @Override
    public String toString() {
        return "BoardComment{" +
                "boardComment='" + boardComment + '\'' +
                ", boardCode='" + boardCode + '\'' +
                ", userId='" + userId + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", regDate='" + regDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                ", reportAmount=" + reportAmount +
                '}';
    }
}
