package ks44team04.dto;

public class GoodsQna {

    private int goodsQnaNum;
    private String goodsCode;
    private String goodsQnaCategory;
    private String buyerId;
    private String goodsQnaTitle;
    private String goodsQnaContent;
    private String regDate;
    private String modifyDate;
    private String secretCheck;
    private String goodsQnaPw;
    private String qnaStatus;
    
    
    
    private GoodsQnaAnswer goodsAnswerInfo;
    private User userInfo;
    private Goods goodsInfo;
    public GoodsQnaCategory goodsQnaCategoryInfo;

    public int getGoodsQnaNum() {
        return goodsQnaNum;
    }

    public void setGoodsQnaNum(int goodsQnaNum) {
        this.goodsQnaNum = goodsQnaNum;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsQnaCategory() {
        return goodsQnaCategory;
    }

    public void setGoodsQnaCategory(String goodsQnaCategory) {
        this.goodsQnaCategory = goodsQnaCategory;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getGoodsQnaTitle() {
        return goodsQnaTitle;
    }

    public void setGoodsQnaTitle(String goodsQnaTitle) {
        this.goodsQnaTitle = goodsQnaTitle;
    }

    public String getGoodsQnaContent() {
        return goodsQnaContent;
    }

    public void setGoodsQnaContent(String goodsQnaContent) {
        this.goodsQnaContent = goodsQnaContent;
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

    public String getSecretCheck() {
        return secretCheck;
    }

    public void setSecretCheck(String secretCheck) {
        this.secretCheck = secretCheck;
    }

    public String getGoodsQnaPw() {
        return goodsQnaPw;
    }

    public void setGoodsQnaPw(String goodsQnaPw) {
        this.goodsQnaPw = goodsQnaPw;
    }

    public String getQnaStatus() {
        return qnaStatus;
    }

    public void setQnaStatus(String qnaStatus) {
        this.qnaStatus = qnaStatus;
    }

    public GoodsQnaAnswer getGoodsAnswerInfo() {
        return goodsAnswerInfo;
    }

    public void setGoodsAnswerInfo(GoodsQnaAnswer goodsAnswerInfo) {
        this.goodsAnswerInfo = goodsAnswerInfo;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }

    public Goods getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(Goods goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public GoodsQnaCategory getGoodsQnaCategoryInfo() {
        return goodsQnaCategoryInfo;
    }

    public void setGoodsQnaCategoryInfo(GoodsQnaCategory goodsQnaCategoryInfo) {
        this.goodsQnaCategoryInfo = goodsQnaCategoryInfo;
    }

    @Override
    public String toString() {
        return "GoodsQna{" +
                "goodsQnaNum=" + goodsQnaNum +
                ", goodsCode='" + goodsCode + '\'' +
                ", goodsQnaCategory='" + goodsQnaCategory + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", goodsQnaTitle='" + goodsQnaTitle + '\'' +
                ", goodsQnaContent='" + goodsQnaContent + '\'' +
                ", secretCheck='" + secretCheck + '\'' +
                ", regDate='" + regDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                ", goodsQnaPw=" + goodsQnaPw +
                ", qnaStatus='" + qnaStatus + '\'' +
                ", goodsAnswerInfo=" + goodsAnswerInfo +
                ", userInfo=" + userInfo +
                ", goodsInfo=" + goodsInfo +
                ", goodsQnaCategoryInfo=" + goodsQnaCategoryInfo +
                '}';
    }
}
