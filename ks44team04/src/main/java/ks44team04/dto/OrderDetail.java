package ks44team04.dto;

public class OrderDetail {

    private String orderDetailCode;
    private String orderNum;
    private String goodsCode;
    private int orderAmount;
    private int orderOgPrice;
    private int orderPrice;
    private String orderStatus;
    private String postInfo;
    private String refundCheck;
    private String autoConfirmDate;
    private String orderConfirmDate;
    private int savePoint;

    public String getOrderDetailCode() {
        return orderDetailCode;
    }

    public void setOrderDetailCode(String orderDetailCode) {
        this.orderDetailCode = orderDetailCode;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getOrderOgPrice() {
        return orderOgPrice;
    }

    public void setOrderOgPrice(int orderOgPrice) {
        this.orderOgPrice = orderOgPrice;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(String postInfo) {
        this.postInfo = postInfo;
    }

    public String getRefundCheck() {
        return refundCheck;
    }

    public void setRefundCheck(String refundCheck) {
        this.refundCheck = refundCheck;
    }

    public String getAutoConfirmDate() {
        return autoConfirmDate;
    }

    public void setAutoConfirmDate(String autoConfirmDate) {
        this.autoConfirmDate = autoConfirmDate;
    }

    public String getOrderConfirmDate() {
        return orderConfirmDate;
    }

    public void setOrderConfirmDate(String orderConfirmDate) {
        this.orderConfirmDate = orderConfirmDate;
    }

    public int getSavePoint() {
        return savePoint;
    }

    public void setSavePoint(int savePoint) {
        this.savePoint = savePoint;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailCode='" + orderDetailCode + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderOgPrice=" + orderOgPrice +
                ", orderPrice=" + orderPrice +
                ", orderStatus='" + orderStatus + '\'' +
                ", postInfo='" + postInfo + '\'' +
                ", refundCheck='" + refundCheck + '\'' +
                ", autoConfirmDate='" + autoConfirmDate + '\'' +
                ", orderConfirmDate='" + orderConfirmDate + '\'' +
                ", savePoint=" + savePoint +
                '}';
    }
}
