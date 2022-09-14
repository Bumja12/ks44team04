package ks44team04.dto;

public class BoardLike {

    private String boardLike;
    private String boardCode;
    private String userId;
    private String likeRegDate;

    public String getBoardLike() {
        return boardLike;
    }

    public void setBoardLike(String boardLike) {
        this.boardLike = boardLike;
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

    public String getLikeRegDate() {
        return likeRegDate;
    }

    public void setLikeRegDate(String likeRegDate) {
        this.likeRegDate = likeRegDate;
    }

    @Override
    public String toString() {
        return "BoardLike{" +
                "boardLike='" + boardLike + '\'' +
                ", boardCode='" + boardCode + '\'' +
                ", userId='" + userId + '\'' +
                ", likeRegDate='" + likeRegDate + '\'' +
                '}';
    }
}
