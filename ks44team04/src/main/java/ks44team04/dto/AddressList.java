package ks44team04.dto;

public class AddressList {
    private String addressList;
    private String buyerId;
    private String addressName;
    private String receiverName;
    private String postalCode;
    private String address;
    private String address2;
    private String phone;
    private String phone2;
    private String regDate;
    private String modifyRegDate;
    private String defaultAddressCheck;

    public String getAddressList() {
        return addressList;
    }

    public void setAddressList(String addressList) {
        this.addressList = addressList;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getModifyRegDate() {
        return modifyRegDate;
    }

    public void setModifyRegDate(String modifyRegDate) {
        this.modifyRegDate = modifyRegDate;
    }

    public String getDefaultAddressCheck() {
        return defaultAddressCheck;
    }

    public void setDefaultAddressCheck(String defaultAddressCheck) {
        this.defaultAddressCheck = defaultAddressCheck;
    }

    @Override
    public String toString() {
        return "AddressList{" +
                "addressList='" + addressList + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", addressName='" + addressName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", address='" + address + '\'' +
                ", address2='" + address2 + '\'' +
                ", phone='" + phone + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", regDate='" + regDate + '\'' +
                ", modifyRegDate='" + modifyRegDate + '\'' +
                ", defaultAddressCheck='" + defaultAddressCheck + '\'' +
                '}';
    }
}
