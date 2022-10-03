package ks44team04.service;

import ks44team04.dto.OrderDetail;
import ks44team04.dto.OrderExchange;
import ks44team04.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public String getOrderExchangeMaxCode() {
        return orderMapper.getOrderExchangeMaxCode();
    }

    public OrderDetail getOrderDetail(Map<String, Object> orderMap) {
        return orderMapper.getOrderDetail(orderMap);
    }
}
