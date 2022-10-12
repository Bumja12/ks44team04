package ks44team04.dto;

public class GoodsSmallCategory {

    private String goodsSmallCategoryPK;
    private String goodsLargeCategoryFK;
    private String smallCategoryName;
    private String regId;
    private String useCheck;
    private String regDate;
    
	public String getGoodsSmallCategoryPK() {
		return goodsSmallCategoryPK;
	}
	public void setGoodsSmallCategoryPK(String goodsSmallCategoryPK) {
		this.goodsSmallCategoryPK = goodsSmallCategoryPK;
	}
	public String getGoodsLargeCategoryFK() {
		return goodsLargeCategoryFK;
	}
	public void setGoodsLargeCategoryFK(String goodsLargeCategoryFK) {
		this.goodsLargeCategoryFK = goodsLargeCategoryFK;
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
		return "GoodsSmallCategory [goodsSmallCategoryPK=" + goodsSmallCategoryPK + ", goodsLargeCategoryFK="
				+ goodsLargeCategoryFK + ", smallCategoryName=" + smallCategoryName + ", regId=" + regId + ", useCheck="
				+ useCheck + ", regDate=" + regDate + "]";
	}

}
