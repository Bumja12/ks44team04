package ks44team04.dto;

public class Wishlist {

    private String wishGoods;
    private String goodsCode;
    private String buyerId;
    private String regDate;

    public String getWishGoods() {
        return wishGoods;
    }

    public void setWishGoods(String wishGoods) {
        this.wishGoods = wishGoods;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "wishGoods='" + wishGoods + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}
