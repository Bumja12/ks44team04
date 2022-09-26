package ks44team04.dto;

public class GoodsAnswer {

    private String goodsQnaAnswer;
    private int goodsQnaNum;
    private String sellerId;
    private String goodsAnswerComment;
    private int answerDate;
    
    
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
	
    public String getGoodsQnaAnswer() {
        return goodsQnaAnswer;
    }

    public void setGoodsQnaAnswer(String goodsQnaAnswer) {
        this.goodsQnaAnswer = goodsQnaAnswer;
    }
    
    public int getGoodsQnaNum() {
        return goodsQnaNum;
    }

    public void setGoodsQnaNum(int goodsQnaNum) {
        this.goodsQnaNum = goodsQnaNum;
    }
    
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }
    
    public String getGoodsAnswerComment() {
    	return goodsAnswerComment;
    }
    
    public void setGoodsAnswerComment(String goodsAnswerComment) {
    	this.goodsAnswerComment = goodsAnswerComment;
    }
    
    public int getAnswerDate() {
    	return answerDate;
    }
    
    public void setAnswerDate(int answerDate) {
    	this.answerDate = answerDate;
    }
    
    @Override
    public String toString() {
        return "GoodsAnswer{" +
                "goodsQnaAnswer='" + goodsQnaAnswer + '\'' +
                ", goodsQnaNum='" + goodsQnaNum + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", goodsAnswerComment='" + goodsAnswerComment + '\'' +
                ", answerDate='" + answerDate + '\'' +
                '}';
    }
}
