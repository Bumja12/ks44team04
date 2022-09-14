package ks44team04.dto;

public class BuyerTotal {

    private String buyerTotal;
    private String buyerId;
    private int totalBuyerPrice;
    private String totalDate;

    public String getBuyerTotal() {
        return buyerTotal;
    }

    public void setBuyerTotal(String buyerTotal) {
        this.buyerTotal = buyerTotal;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public int getTotalBuyerPrice() {
        return totalBuyerPrice;
    }

    public void setTotalBuyerPrice(int totalBuyerPrice) {
        this.totalBuyerPrice = totalBuyerPrice;
    }

    public String getTotalDate() {
        return totalDate;
    }

    public void setTotalDate(String totalDate) {
        this.totalDate = totalDate;
    }

    @Override
    public String toString() {
        return "BuyerTotal{" +
                "buyerTotal='" + buyerTotal + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", totalBuyerPrice=" + totalBuyerPrice +
                ", totalDate='" + totalDate + '\'' +
                '}';
    }
}
