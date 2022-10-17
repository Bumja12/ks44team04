package ks44team04.dto;

import java.util.List;

public class GoodsLargeCategory {

    private String goodsLargeCategory; // 판매 상품 카테고리 대분류 PK
    private String goodsCategory;	   // 카테고리 대분류
    private String regId; 			   // 회원 아이디 FK(작성자)
    private String useCheck; 		   // 사용 여부
    private String regDate; 		   // 등록일
    private List<GoodsSmallCategory> goodsSmallCategoryInfo;
    
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
	public List<GoodsSmallCategory> getGoodsSmallCategoryInfo() {
		return goodsSmallCategoryInfo;
	}
	public void setGoodsSmallCategoryInfo(List<GoodsSmallCategory> goodsSmallCategoryInfo) {
		this.goodsSmallCategoryInfo = goodsSmallCategoryInfo;
	}
	
	@Override
	public String toString() {
		return "GoodsLargeCategory [goodsLargeCategory=" + goodsLargeCategory + ", goodsCategory=" + goodsCategory
				+ ", regId=" + regId + ", useCheck=" + useCheck + ", regDate=" + regDate + ", goodsSmallCategoryInfo="
				+ goodsSmallCategoryInfo + "]";
	}

    
}
