package ks44team04.dto;

import java.util.List;

public class Wishlist {

    private String wishCode;
    private String goodsCode;
    private String buyerId;
    private String regDate;

	//이미지 리스트 
	private List<FileDto> fileList;
	
    public List<FileDto> getFileList() {
		return fileList;
	}
	public void setFileList(List<FileDto> fileList) {
		this.fileList = fileList;
	}
	
	private Goods goodsInfo;
	public Goods getGoodsInfo() {
		return goodsInfo;
	}
	public void setGoodsInfo(Goods goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	
    public String getWishCode() {
        return wishCode;
    }

    public void setWishCode(String wishCode) {
        this.wishCode = wishCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "wishCode='" + wishCode + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", regDate='" + regDate + '\'' +
                ", goodsInfo='" + goodsInfo + '\'' +
                '}';
    }
}
