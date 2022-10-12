package ks44team04.service;

import ks44team04.dto.*;
import ks44team04.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class OrderService {

    private final OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }


    public void setOrderExchange(OrderExchange orderExchange) {
        orderMapper.setOrderExchange(orderExchange);
    }
    public void setOrderReturn(OrderReturn orderReturn) {
        orderMapper.setOrderReturn(orderReturn);
    }

    public String getOrderExchangeMaxCode() {
        return orderMapper.getOrderExchangeMaxCode();
    }
    public String getOrderReturnMaxCode() {
        return orderMapper.getOrderReturnMaxCode();
    }

    public OrderDetail getOrderDetail(Map<String, Object> orderMap) {
        return orderMapper.getOrderDetail(orderMap);
    }

    public void setReturnPost(Map<String, Object> returnPost) {
        orderMapper.setReturnPost(returnPost);
    }

    public void setOrderDetailStatus(String orderDetailCode, String orderStatus) {
        orderMapper.setOrderDetailStatus(orderDetailCode, orderStatus);
    }

    public List<OrderDetail> getOrderList(String userId) {
        return orderMapper.getOrderList(userId);
    }
    public List<OrderDetail> getOrderListA(String sellerId, String status) {
        return orderMapper.getOrderListA(sellerId, status);
    }

    public Goods getGoodsInfo(String goodsCode) {
        return orderMapper.getGoodsInfo(goodsCode);
    }

    public void setOrder(Order order) {
        orderMapper.setOrder(order);
    }

    public String getOrderNum() {
        return orderMapper.getOrderNum();
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        orderMapper.setOrderDetail(orderDetail);
    }

    public String addPostInfo(PostInfo postInfo) {
        orderMapper.addPostInfo(postInfo);
        return postInfo.getPostInfo();
    }

    public void setOrderDetailPost(String orderDetailCode, String postInfo) {
        orderMapper.setOrderDetailPost(orderDetailCode, postInfo);
    }
}
