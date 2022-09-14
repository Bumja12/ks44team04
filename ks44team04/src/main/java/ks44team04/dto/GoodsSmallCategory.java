package ks44team04.dto;

public class GoodsSmallCategory {

    private String goodsSmallCategory;
    private String goodsLargeCategory;
    private String smallCategoryName;
    private String regId;
    private String useCheck;
    private String regDate;

    public String getGoodsSmallCategory() {
        return goodsSmallCategory;
    }

    public void setGoodsSmallCategory(String goodsSmallCategory) {
        this.goodsSmallCategory = goodsSmallCategory;
    }

    public String getGoodsLargeCategory() {
        return goodsLargeCategory;
    }

    public void setGoodsLargeCategory(String goodsLargeCategory) {
        this.goodsLargeCategory = goodsLargeCategory;
    }

    public String getSmallCategoryName() {
        return smallCategoryName;
    }

    public void setSmallCategoryName(String smallCategoryName) {
        this.smallCategoryName = smallCategoryName;
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
        return "GoodsSmallCategory{" +
                "goodsSmallCategory='" + goodsSmallCategory + '\'' +
                ", goodsLargeCategory='" + goodsLargeCategory + '\'' +
                ", smallCategoryName='" + smallCategoryName + '\'' +
                ", regId='" + regId + '\'' +
                ", useCheck='" + useCheck + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}