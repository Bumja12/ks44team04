package ks44team04.mapper;

import ks44team04.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    public void setOrderExchange(OrderExchange orderExchange);
    public void setOrderReturn(OrderReturn orderReturn);

    public String getOrderExchangeMaxCode();
    public String getOrderReturnMaxCode();

    public OrderDetail getOrderDetail(Map<String, Object> orderMap);

    public void setReturnPost(Map<String, Object> returnPost);

    public void setOrderDetailStatus(@Param(value = "orderDetailCode") String orderDetailCode,
                                     @Param(value = "orderStatus") String orderStatus);

    public List<OrderDetail> getOrderList(String userId);
    public List<OrderDetail> getOrderListA(@Param(value = "sellerId") String sellerId,
                                             @Param(value = "status") String status);

    public Goods getGoodsInfo(String goodsCode);

    public void setOrder(Order order);

    public String getOrderNum();

    public void setOrderDetail(OrderDetail orderDetail);

    public void addPostInfo(PostInfo postInfo);

    public void setOrderDetailPost(@Param(value = "orderDetailCode") String orderDetailCode, @Param(value = "postInfo") String postInfo);

    public void setCancelApprove(String orderDetailCode);
    public void setExchangeApprove(String orderDetailCode);
    public void setReturnApprove(String orderDetailCode);
}
