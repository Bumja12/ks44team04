package ks44team04.dto;

import java.util.List;

public class GoodsLargeCategory {

    private String goodsLargeCategoryPK;
    private String categoryName;
    private String regId;
    private String useCheck;
    private String regDate;
    
	public String getGoodsLargeCategoryPK() {
		return goodsLargeCategoryPK;
	}
	public void setGoodsLargeCategoryPK(String goodsLargeCategoryPK) {
		this.goodsLargeCategoryPK = goodsLargeCategoryPK;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
		return "GoodsLargeCategory [goodsLargeCategoryPK=" + goodsLargeCategoryPK + ", categoryName=" + categoryName
				+ ", regId=" + regId + ", useCheck=" + useCheck + ", regDate=" + regDate + "]";
	}
	
}
