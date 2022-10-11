package ks44team04.dto;

public class OrderDetailStr {

    private String orderDetailCode;
    private String orderNum;
    private String goodsCode;
    private String orderAmount;
    private String orderOgPrice;
    private String orderPrice;
    private String orderStatus;
    private String postInfo;
    private String refundCheck;
    private String autoConfirmDate;
    private String orderConfirmDate;
    private String savePoint;
    private Goods goods;
    private Order order;

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

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderOgPrice() {
        return orderOgPrice;
    }

    public void setOrderOgPrice(String orderOgPrice) {
        this.orderOgPrice = orderOgPrice;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
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

    public String getSavePoint() {
        return savePoint;
    }

    public void setSavePoint(String savePoint) {
        this.savePoint = savePoint;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderDetailStr{" +
                "orderDetailCode='" + orderDetailCode + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", orderOgPrice='" + orderOgPrice + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", postInfo='" + postInfo + '\'' +
                ", refundCheck='" + refundCheck + '\'' +
                ", autoConfirmDate='" + autoConfirmDate + '\'' +
                ", orderConfirmDate='" + orderConfirmDate + '\'' +
                ", savePoint='" + savePoint + '\'' +
                ", goods=" + goods +
                ", order=" + order +
                '}';
    }
}
