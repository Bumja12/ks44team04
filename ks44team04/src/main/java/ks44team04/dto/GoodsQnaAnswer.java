package ks44team04.dto;

public class GoodsQnaAnswer {

    private String goodsAnswerCode;
    private int goodsQnaNum;
    private String sellerId;
    private String goodsAnswerContent;
    private String regDate;
    private String modifyDate;
    
    
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
	
    public String getGoodsAnswerCode() {
        return goodsAnswerCode;
    }

    public void setGoodsAnswerCode(String goodsAnswerCode) {
        this.goodsAnswerCode = goodsAnswerCode;
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
    
    public String getGoodsAnswerContent() {
    	return goodsAnswerContent;
    }
    
    public void setGoodsAnswerContent(String goodsAnswerContent) {
    	this.goodsAnswerContent = goodsAnswerContent;
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
    
    @Override
    public String toString() {
        return "GoodsAnswer{" +
                "goodsAnswerCode='" + goodsAnswerCode + '\'' +
                ", goodsQnaNum='" + goodsQnaNum + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", goodsAnswerContent='" + goodsAnswerContent + '\'' +
                ", regDate='" + regDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                '}';
    }
}
