package ks44team04.dto;

public class GoodsQnaCategory {

    private String goodsQnaCategory; // 상품 문의 카테고리 PK
    private String regId;       	 // 회원 아이디 FK(등록인)
    private String categoryName; 	 // 카테고리명
    private String regDate;			 // 등록일
    private String modifyDate;		 // 수정일
    private String useCheck;		 // 사용 여부
    
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
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getUseCheck() {
		return useCheck;
	}
	public void setUseCheck(String useCheck) {
		this.useCheck = useCheck;
	}
	
	@Override
	public String toString() {
		return "GoodsQnaCategory [goodsQnaCategory=" + goodsQnaCategory + ", regId=" + regId + ", categoryName="
				+ categoryName + ", regDate=" + regDate + ", modifyDate=" + modifyDate + ", useCheck=" + useCheck + "]";
	}
    
}
