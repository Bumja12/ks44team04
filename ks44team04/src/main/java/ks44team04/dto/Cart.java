package ks44team04.dto;

import java.util.List;

public class Cart {

   private String cartCode;
   private String goodsCode;
   private String buyerId;
   private int cartAmount;
   private String regDate;
   private String modifyDate;

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
	
    public String getCartCode() {
        return cartCode;
    }

    public void setCartCode(String cartCode) {
        this.cartCode = cartCode;
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

    public int getCartAmount() {
        return cartAmount;
    }

    public void setCartAmount(int cartAmount) {
        this.cartAmount = cartAmount;
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

    @Override
    public String toString() {
        return "Cart{" +
                "cartCode='" + cartCode + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", cartAmount=" + cartAmount +
                ", regDate='" + regDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                ", goodsInfo='" + goodsInfo + '\'' +
                '}';
    }
}
