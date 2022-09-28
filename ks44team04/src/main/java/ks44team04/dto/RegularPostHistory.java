package ks44team04.dto;

public class RegularPostHistory {

    private String regularPostHistoryCode;
    private String regularPostStatus;
    private String orderNum;
    private String paymentHistoryCode;
    private String postRegDate;
    private RegularPostStatus regularPostStatusInfo;
    private OrderDetail orderDetail;
    private Goods goods;
    private Order order;

    public String getRegularPostHistoryCode() {
        return regularPostHistoryCode;
    }

    public void setRegularPostHistoryCode(String regularPostHistoryCode) {
        this.regularPostHistoryCode = regularPostHistoryCode;
    }

    public String getRegularPostStatus() {
        return regularPostStatus;
    }

    public void setRegularPostStatus(String regularPostStatus) {
        this.regularPostStatus = regularPostStatus;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getPaymentHistoryCode() {
        return paymentHistoryCode;
    }

    public void setPaymentHistoryCode(String paymentHistoryCode) {
        this.paymentHistoryCode = paymentHistoryCode;
    }

    public String getPostRegDate() {
        return postRegDate;
    }

    public void setPostRegDate(String postRegDate) {
        this.postRegDate = postRegDate;
    }

    public RegularPostStatus getRegularPostStatusInfo() {
        return regularPostStatusInfo;
    }

    public void setRegularPostStatusInfo(RegularPostStatus regularPostStatusInfo) {
        this.regularPostStatusInfo = regularPostStatusInfo;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
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
        return "RegularPostHistory{" +
                "regularPostHistoryCode='" + regularPostHistoryCode + '\'' +
                ", regularPostStatus='" + regularPostStatus + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", paymentHistoryCode='" + paymentHistoryCode + '\'' +
                ", postRegDate='" + postRegDate + '\'' +
                ", regularPostStatusInfo=" + regularPostStatusInfo +
                ", orderDetail=" + orderDetail +
                ", goods=" + goods +
                ", order=" + order +
                '}';
    }
}
