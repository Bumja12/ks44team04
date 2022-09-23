package ks44team04.dto;

public class Seller {

    private String sellerCode;
    private String sellerId;
    private String storeName;
    private String sellerSort;
    private String bankName;
    private String account;
    private String accountHolder;
    private String licenseNum;
    private String storeAddress;
    private String storePhone;
    private String storeEmail;
    private String licenseImg;
    private String onlineLicenceImg;
    private String approveAskDate;
    private String approveDate;
    private String approveCheck;
    private String approveId;
    
    private Goods goodsInfo;
    public Goods getGoodsInfo() {
		return goodsInfo;
	}

	public void setGoodsInfo(Goods goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getSellerSort() {
        return sellerSort;
    }

    public void setSellerSort(String sellerSort) {
        this.sellerSort = sellerSort;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    public String getLicenseImg() {
        return licenseImg;
    }

    public void setLicenseImg(String licenseImg) {
        this.licenseImg = licenseImg;
    }

    public String getOnlineLicenceImg() {
        return onlineLicenceImg;
    }

    public void setOnlineLicenceImg(String onlineLicenceImg) {
        this.onlineLicenceImg = onlineLicenceImg;
    }

    public String getApproveAskDate() {
        return approveAskDate;
    }

    public void setApproveAskDate(String approveAskDate) {
        this.approveAskDate = approveAskDate;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    public String getApproveCheck() {
        return approveCheck;
    }

    public void setApproveCheck(String approveCheck) {
        this.approveCheck = approveCheck;
    }

    public String getApproveId() {
        return approveId;
    }

    public void setApproveId(String approveId) {
        this.approveId = approveId;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerCode='" + sellerCode + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", storeName='" + storeName + '\'' +
                ", sellerSort='" + sellerSort + '\'' +
                ", bankName='" + bankName + '\'' +
                ", account='" + account + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", licenseNum='" + licenseNum + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storePhone='" + storePhone + '\'' +
                ", storeEmail='" + storeEmail + '\'' +
                ", licenseImg='" + licenseImg + '\'' +
                ", onlineLicenceImg='" + onlineLicenceImg + '\'' +
                ", approveAskDate='" + approveAskDate + '\'' +
                ", approveDate='" + approveDate + '\'' +
                ", approveCheck='" + approveCheck + '\'' +
                ", approveId='" + approveId + '\'' +
                '}';
    }
}
