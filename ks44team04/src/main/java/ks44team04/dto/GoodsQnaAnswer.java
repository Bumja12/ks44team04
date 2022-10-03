package ks44team04.dto;

public class GoodsQnaAnswer {

    private String goodsQnaAnswer;
    private int goodsQnaNum;
    private String sellerId;
    private String goodsAnswerContent;
    private String answerDate;

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

    public String getGoodsAnswerContent() {
        return goodsAnswerContent;
    }

    public void setGoodsAnswerContent(String goodsAnswerContent) {
        this.goodsAnswerContent = goodsAnswerContent;
    }

    public String getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(String answerDate) {
        this.answerDate = answerDate;
    }

    @Override
    public String toString() {
        return "GoodsQnaAnswer{" +
                "goodsQnaAnswer='" + goodsQnaAnswer + '\'' +
                ", goodsQnaNum=" + goodsQnaNum +
                ", sellerId='" + sellerId + '\'' +
                ", goodsAnswerContent='" + goodsAnswerContent + '\'' +
                ", answerDate='" + answerDate + '\'' +
                '}';
    }
}
