package ks44team04.dto;

public class Coupon {

    private String couponCode;
    private String couponName;
    private int discountPrice;
    private int priceTerms;
    private String endDate;
    private String regId;
    private String regDate;

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public int getPriceTerms() {
        return priceTerms;
    }

    public void setPriceTerms(int priceTerms) {
        this.priceTerms = priceTerms;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "couponCode='" + couponCode + '\'' +
                ", couponName='" + couponName + '\'' +
                ", discountPrice=" + discountPrice +
                ", priceTerms=" + priceTerms +
                ", endDate='" + endDate + '\'' +
                ", regId='" + regId + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}
