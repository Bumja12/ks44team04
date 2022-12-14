package ks44team04.dto;

import java.util.List;

public class Goods {

    private String goodsCode;
    private String goodsSmallCategory;
    private String sellerId;
    private String goodsName;
    private String goodsContent;
    private String goodsDetail;
    private int goodsPrice;
    private int goodsDiscountRate;
    private int goodsPostPrice;
    private int goodsStock;
    private String soldoutCheck;
    private String stopSaleCheck;
    private String packagePostCheck;
    private String regularDeliverCheck;
    private String regDate;
    private String modifyDate;
    private String goodsFile;
    
    private List<FileDto> fileList;
    private GoodsQnaAnswer goodsAnswerInfo;
    private GoodsQna goodsQnaInfo;
    private User userInfo;
    private GoodsSmallCategory goodsSmallCategoryInfo;
    private GoodsLargeCategory goodsLargeCategoryInfo;
    
    /* ~~~ 시작 ~~~ */
    
    /*이미지 업로드
	private FileDto fileInfo;
	public FileDto getFileInfo() {
		return fileInfo;
	}
	public void setFileInfo(FileDto fileInfo) {
		this.fileInfo = fileInfo;
	}*/
    
	//이미지 리스트 
	
    public List<FileDto> getFileList() {
		return fileList;
	}
	public void setFileList(List<FileDto> fileList) {
		this.fileList = fileList;
	}

	//문의 답변
	public GoodsQnaAnswer getGoodsAnswerInfo() {
		return goodsAnswerInfo;
	}
	public void setGoodsAnswerInfo(GoodsQnaAnswer goodsAnswerInfo) {
		this.goodsAnswerInfo = goodsAnswerInfo;
	}
	
	//문의
	public GoodsQna getGoodsQnaInfo() {
		return goodsQnaInfo;
	}
	public void setGoodsQnaInfo(GoodsQna goodsQnaInfo) {
		this.goodsQnaInfo = goodsQnaInfo;
	}
    
	//유저
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}
	
	//스몰카테고리
	public GoodsSmallCategory getGoodsSmallCategoryInfo() {
		return goodsSmallCategoryInfo;
	}
	public void setGoodsSmallCategoryInfo(GoodsSmallCategory goodsSmallCategoryInfo) {
		this.goodsSmallCategoryInfo = goodsSmallCategoryInfo;
	}
	
	//라지카테고리
	public GoodsLargeCategory getGoodsLargeCategoryInfo() {
		return goodsLargeCategoryInfo;
	}
	public void setGoodsLargeCategoryInfo(GoodsLargeCategory goodsLargeCategoryInfo) {
		this.goodsLargeCategoryInfo = goodsLargeCategoryInfo;
	}
	/* ~~~ 끝 ~~~ */
	
	public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsSmallCategory() {
        return goodsSmallCategory;
    }

    public void setGoodsSmallCategory(String goodsSmallCategory) {
        this.goodsSmallCategory = goodsSmallCategory;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }
    
	public String getGoodsDetail() {
		return goodsDetail;
    }
        
	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsDiscountRate() {
        return goodsDiscountRate;
    }

    public void setGoodsDiscountRate(int goodsDiscountRate) {
        this.goodsDiscountRate = goodsDiscountRate;
    }

    public int getGoodsPostPrice() {
        return goodsPostPrice;
    }

    public void setGoodsPostPrice(int goodsPostPrice) {
        this.goodsPostPrice = goodsPostPrice;
    }

    public int getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(int goodsStock) {
        this.goodsStock = goodsStock;
    }

    public String getSoldoutCheck() {
        return soldoutCheck;
    }

    public void setSoldoutCheck(String soldoutCheck) {
        this.soldoutCheck = soldoutCheck;
    }

    public String getStopSaleCheck() {
        return stopSaleCheck;
    }

    public void setStopSaleCheck(String stopSaleCheck) {
        this.stopSaleCheck = stopSaleCheck;
    }

    public String getPackagePostCheck() {
        return packagePostCheck;
    }

    public void setPackagePostCheck(String packagePostCheck) {
        this.packagePostCheck = packagePostCheck;
    }

    public String getRegularDeliverCheck() {
        return regularDeliverCheck;
    }

    public void setRegularDeliverCheck(String regularDeliverCheck) {
        this.regularDeliverCheck = regularDeliverCheck;
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

    public String getGoodsFile() {
        return goodsFile;
    }

    public void setGoodsFile(String goodsFile) {
        this.goodsFile = goodsFile;
    }
	@Override
	public String toString() {
		return "Goods [goodsCode=" + goodsCode + ", goodsSmallCategory=" + goodsSmallCategory + ", sellerId=" + sellerId
				+ ", goodsName=" + goodsName + ", goodsContent=" + goodsContent + ", goodsDetail=" + goodsDetail
				+ ", goodsPrice=" + goodsPrice + ", goodsDiscountRate=" + goodsDiscountRate + ", goodsPostPrice="
				+ goodsPostPrice + ", goodsStock=" + goodsStock + ", soldoutCheck=" + soldoutCheck + ", stopSaleCheck="
				+ stopSaleCheck + ", packagePostCheck=" + packagePostCheck + ", regularDeliverCheck="
				+ regularDeliverCheck + ", regDate=" + regDate + ", modifyDate=" + modifyDate + ", goodsFile="
				+ goodsFile + ", fileList=" + fileList + ", goodsAnswerInfo=" + goodsAnswerInfo + ", goodsQnaInfo="
				+ goodsQnaInfo + ", userInfo=" + userInfo + ", goodsSmallCategoryInfo=" + goodsSmallCategoryInfo
				+ ", goodsLargeCategoryInfo=" + goodsLargeCategoryInfo + "]";
	}


}
