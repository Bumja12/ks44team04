package ks44team04.dto;

public class GoodsLargeCategory {

    private String goodsLargeCategory;
    private String goodsCategory;
    private String regId;
    private String useCheck;
    private String regDate;

    public String getGoodsLargeCategory() {
        return goodsLargeCategory;
    }

    public void setGoodsLargeCategory(String goodsLargeCategory) {
        this.goodsLargeCategory = goodsLargeCategory;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getUseCheck() {
        return useCheck;
    }

    public void setUseCheck(String useCheck) {
        this.useCheck = useCheck;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "GoodsLargeCategory{" +
                "goodsLargeCategory='" + goodsLargeCategory + '\'' +
                ", goodsCategory='" + goodsCategory + '\'' +
                ", regId='" + regId + '\'' +
                ", useCheck='" + useCheck + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}
