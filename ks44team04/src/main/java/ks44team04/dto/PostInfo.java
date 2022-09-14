package ks44team04.dto;

public class PostInfo {

    private String postInfo;
    private String postList;
    private String regDate;
    private String postCompanyName;
    private String invoiceNumber;

    public String getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(String postInfo) {
        this.postInfo = postInfo;
    }

    public String getPostList() {
        return postList;
    }

    public void setPostList(String postList) {
        this.postList = postList;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getPostCompanyName() {
        return postCompanyName;
    }

    public void setPostCompanyName(String postCompanyName) {
        this.postCompanyName = postCompanyName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String toString() {
        return "PostInfo{" +
                "postInfo='" + postInfo + '\'' +
                ", postList='" + postList + '\'' +
                ", regDate='" + regDate + '\'' +
                ", postCompanyName='" + postCompanyName + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                '}';
    }
}
