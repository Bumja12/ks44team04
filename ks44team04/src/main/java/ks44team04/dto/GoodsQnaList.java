package ks44team04.dto;

public class GoodsQnaList {

    private String goodsQna;
    private String goodsCode;
    private String goodsQnaCategory;
    private String buyerId;
    private String goodsQnaTitle;
    private String goodsQnaContent;
    private String goodsQnaDate;
    private String secretCheck;
    private int goodsQnaPw;
    private String sellerId;
    private String goodsQnaAnswer;
    private String answerDate;
    
    
	private User userInfo;
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
	
	private Goods goodsInfo;
	public Goods getGoodsInfo() {
		return goodsInfo;
	}
	public void setGoodsInfo(Goods goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	
	public GoodsQnaCategory goodsQnaCategoryInfo;
	public GoodsQnaCategory getGoodsQnaCategoryInfo() {
		return goodsQnaCategoryInfo;
	}
	public void setGoodsQnaCategoryInfo(GoodsQnaCategory goodsQnaCategoryInfo) {
		this.goodsQnaCategoryInfo = goodsQnaCategoryInfo;
	}
	
    public String getGoodsQna() {
        return goodsQna;
    }

    public void setGoodsQna(String goodsQna) {
        this.goodsQna = goodsQna;
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

    public String getGoodsQnaDate() {
        return goodsQnaDate;
    }

    public void setGoodsQnaDate(String goodsQnaDate) {
        this.goodsQnaDate = goodsQnaDate;
    }

    public String getSecretCheck() {
        return secretCheck;
    }

    public void setSecretCheck(String secretCheck) {
        this.secretCheck = secretCheck;
    }

    public int getGoodsQnaPw() {
        return goodsQnaPw;
    }

    public void setGoodsQnaPw(int goodsQnaPw) {
        this.goodsQnaPw = goodsQnaPw;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getGoodsQnaAnswer() {
        return goodsQnaAnswer;
    }

    public void setGoodsQnaAnswer(String goodsQnaAnswer) {
        this.goodsQnaAnswer = goodsQnaAnswer;
    }

    public String getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(String answerDate) {
        this.answerDate = answerDate;
    }

    @Override
    public String toString() {
        return "GoodsQndList{" +
                "goodsQna='" + goodsQna + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", goodsQnaCategory='" + goodsQnaCategory + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", goodsQnaTitle='" + goodsQnaTitle + '\'' +
                ", goodsQnaContent='" + goodsQnaContent + '\'' +
                ", goodsQnaDate='" + goodsQnaDate + '\'' +
                ", secretCheck='" + secretCheck + '\'' +
                ", goodsQnaPw=" + goodsQnaPw +
                ", sellerId='" + sellerId + '\'' +
                ", goodsQnaAnswer='" + goodsQnaAnswer + '\'' +
                ", answerDate='" + answerDate + '\'' +
                '}';
    }
}
