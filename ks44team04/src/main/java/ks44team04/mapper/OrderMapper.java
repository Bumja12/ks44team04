package ks44team04.mapper;

import ks44team04.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    void setOrderExchange(OrderExchange orderExchange);
    void setOrderReturn(OrderReturn orderReturn);

    String getOrderExchangeMaxCode();
    String getOrderReturnMaxCode();

    OrderDetail getOrderDetail(Map<String, Object> orderMap);

    void setReturnPost(Map<String, Object> returnPost);

    void setOrderDetailStatus(@Param(value = "orderDetailCode") String orderDetailCode,
                                     @Param(value = "orderStatus") String orderStatus);

    /* 페이징 테스트 */
    int getContentsCount();
    List<OrderDetail> getOrderListTest(Paging paging);

    /* 페이징 테스트 */

    List<OrderDetail> getOrderList(String userId);
    List<OrderDetail> getOrderListA(Map<String, String> orderMap);

    Goods getGoodsInfo(String goodsCode);

    void setOrder(Order order);

    String getOrderNum();

    void setOrderDetail(OrderDetail orderDetail);

    void addPostInfo(PostInfo postInfo);

    void setOrderDetailPost(@Param(value = "orderDetailCode") String orderDetailCode, @Param(value = "postInfo") String postInfo);

    void setCancelApprove(String orderDetailCode);
    void setExchangeApprove(Map<String, String> info);
    void setReturnApprove(String orderDetailCode);
}
