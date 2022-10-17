package ks44team04.dto;

public class Order {

    private String orderNum;
    private String buyerId;
    private String couponCode;
    private String orderDate;
    private String orderStatus;
    private int totalSum;
    private int totalPrice;
    private int couponPrice;
    private int usePoint;
    private int goodsDiscountPrice;
    private int postPrice;
    private int totalOrderPrice;
    private int finalConfirmPrice;
    private String finalConfirmDate;
    private String postAddressList;
    private OrderDetail OrderDetailDto;
    private Goods GoodsDto;

    public OrderDetail getOrderDetailDto() {
		return OrderDetailDto;
	}

	public void setOrderDetailDto(OrderDetail orderDetailDto) {
		OrderDetailDto = orderDetailDto;
	}

	public Goods getGoodsDto() {
		return GoodsDto;
	}

	public void setGoodsDto(Goods goodsDto) {
		GoodsDto = goodsDto;
	}

	private int toInt(String str) {
        return Integer.parseInt(str);
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }
    public void setTotalSum(String totalSum) {
        this.totalSum = toInt(totalSum);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = toInt(totalPrice);
    }

    public int getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(int couponPrice) {
        this.couponPrice = couponPrice;
    }
    public void setCouponPrice(String  couponPrice) {
        this.couponPrice = toInt(couponPrice);
    }

    public int getUsePoint() {
        return usePoint;
    }

    public void setUsePoint(int usePoint) {
        this.usePoint = usePoint;
    }
    public void setUsePoint(String usePoint) {
        this.usePoint = toInt(usePoint);
    }

    public int getGoodsDiscountPrice() {
        return goodsDiscountPrice;
    }

    public void setGoodsDiscountPrice(int goodsDiscountPrice) {
        this.goodsDiscountPrice = goodsDiscountPrice;
    }
    public void setGoodsDiscountPrice(String goodsDiscountPrice) {
        this.goodsDiscountPrice = toInt(goodsDiscountPrice);
    }

    public int getPostPrice() {
        return postPrice;
    }

    public void setPostPrice(int postPrice) {
        this.postPrice = postPrice;
    }
    public void setPostPrice(String postPrice) {
        this.postPrice = toInt(postPrice);
    }

    public int getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(int totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }
    public void setTotalOrderPrice(String totalOrderPrice) {
        this.totalOrderPrice = toInt(totalOrderPrice);
    }

    public int getFinalConfirmPrice() {
        return finalConfirmPrice;
    }

    public void setFinalConfirmPrice(int finalConfirmPrice) {
        this.finalConfirmPrice = finalConfirmPrice;
    }
    public void setFinalConfirmPrice(String finalConfirmPrice) {
        this.finalConfirmPrice = toInt(finalConfirmPrice);
    }

    public String getFinalConfirmDate() {
        return finalConfirmDate;
    }

    public void setFinalConfirmDate(String finalConfirmDate) {
        this.finalConfirmDate = finalConfirmDate;
    }

    public String getPostAddressList() {
        return postAddressList;
    }

    public void setPostAddressList(String postAddressList) {
        this.postAddressList = postAddressList;
    }

    @Override
	public String toString() {
		return "Order [orderNum=" + orderNum + ", buyerId=" + buyerId + ", couponCode=" + couponCode + ", orderDate="
				+ orderDate + ", orderStatus=" + orderStatus + ", totalSum=" + totalSum + ", totalPrice=" + totalPrice
				+ ", couponPrice=" + couponPrice + ", usePoint=" + usePoint + ", goodsDiscountPrice="
				+ goodsDiscountPrice + ", postPrice=" + postPrice + ", totalOrderPrice=" + totalOrderPrice
				+ ", finalConfirmPrice=" + finalConfirmPrice + ", finalConfirmDate=" + finalConfirmDate
				+ ", postAddressList=" + postAddressList + ", OrderDetailDto=" + OrderDetailDto + ", GoodsDto="
				+ GoodsDto + "]";
	}
}
