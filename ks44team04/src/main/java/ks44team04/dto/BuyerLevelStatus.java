package ks44team04.dto;

public class BuyerLevelStatus {

   private String levelStatusCode;
   private String buyerId;
   private String levelCode;
   private String levelChangeDate;
   private int totalBuyerPrice;

    public String getLevelStatusCode() {
        return levelStatusCode;
    }

    public void setLevelStatusCode(String levelStatusCode) {
        this.levelStatusCode = levelStatusCode;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getLevelChangeDate() {
        return levelChangeDate;
    }

    public void setLevelChangeDate(String levelChangeDate) {
        this.levelChangeDate = levelChangeDate;
    }

    public int getTotalBuyerPrice() {
        return totalBuyerPrice;
    }

    public void setTotalBuyerPrice(int totalBuyerPrice) {
        this.totalBuyerPrice = totalBuyerPrice;
    }

    @Override
    public String toString() {
        return "BuyerLevelStatus{" +
                "levelStatusCode='" + levelStatusCode + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", levelCode='" + levelCode + '\'' +
                ", levelChangeDate='" + levelChangeDate + '\'' +
                ", totalBuyerPrice=" + totalBuyerPrice +
                '}';
    }
}
