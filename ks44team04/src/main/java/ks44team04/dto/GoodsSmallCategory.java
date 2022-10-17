package ks44team04.dto;

public class GoodsSmallCategory {

    private String goodsSmallCategory; // 판매 상품 카테고리 소분류 PK
    private String goodsLargeCategory; // 판매 상품 카테고리 대분류 FK
    private String smallCategoryName;  // 판매 상품 소분류
    private String regId;			   // 회원 아이디 FK(작성자)
    private String useCheck; 	       // 등록일
    private String regDate;			   // 사용 여부

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
