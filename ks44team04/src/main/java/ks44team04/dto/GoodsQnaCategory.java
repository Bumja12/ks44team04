package ks44team04.dto;

public class GoodsQnaCategory {

    private String goodsQnaCategory;
    private String regId;
    private String categoryName;
    private String regDate;
    private String useCheck;

    public String getGoodsQnaCategory() {
        return goodsQnaCategory;
    }

    public void setGoodsQnaCategory(String goodsQnaCategory) {
        this.goodsQnaCategory = goodsQnaCategory;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUseCheck() {
        return useCheck;
    }

    public void setUseCheck(String useCheck) {
        this.useCheck = useCheck;
    }

    @Override
    public String toString() {
        return "GoodsQnaCategory{" +
                "goodsQnaCategory='" + goodsQnaCategory + '\'' +
                ", regId='" + regId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", regDate='" + regDate + '\'' +
                ", useCheck='" + useCheck + '\'' +
                '}';
    }
}
