package ks44team04.dto;

public class Board {

    private String boardCode;
    private String boardCategory;
    private String userId;
    private String boardTitle;
    private String boardContent;
    private String boardFile;
    private String boardTag;
    private String fixCheck;
    private int viewAmount;
    private int likeAmount;
    private String regDate;
    private String modifyDate;
    private int reportAmount;
    private int savePoint;

    public String getBoardCode() {
        return boardCode;
    }

    public void setBoardCode(String boardCode) {
        this.boardCode = boardCode;
    }

    public String getBoardCategory() {
        return boardCategory;
    }

    public void setBoardCategory(String boardCategory) {
        this.boardCategory = boardCategory;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public String getBoardFile() {
        return boardFile;
    }

    public void setBoardFile(String boardFile) {
        this.boardFile = boardFile;
    }

    public String getBoardTag() {
        return boardTag;
    }

    public void setBoardTag(String boardTag) {
        this.boardTag = boardTag;
    }

    public String getFixCheck() {
        return fixCheck;
    }

    public void setFixCheck(String fixCheck) {
        this.fixCheck = fixCheck;
    }

    public int getViewAmount() {
        return viewAmount;
    }

    public void setViewAmount(int viewAmount) {
        this.viewAmount = viewAmount;
    }

    public int getLikeAmount() {
        return likeAmount;
    }

    public void setLikeAmount(int likeAmount) {
        this.likeAmount = likeAmount;
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

    public int getSavePoint() {
        return savePoint;
    }

    public void setSavePoint(int savePoint) {
        this.savePoint = savePoint;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardCode='" + boardCode + '\'' +
                ", boardCategory='" + boardCategory + '\'' +
                ", userId='" + userId + '\'' +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardContent='" + boardContent + '\'' +
                ", boardFile='" + boardFile + '\'' +
                ", boardTag='" + boardTag + '\'' +
                ", fixCheck='" + fixCheck + '\'' +
                ", viewAmount=" + viewAmount +
                ", likeAmount=" + likeAmount +
                ", regDate='" + regDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                ", reportAmount=" + reportAmount +
                ", savePoint=" + savePoint +
                '}';
    }
}
