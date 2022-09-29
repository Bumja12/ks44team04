package ks44team04.service;

import ks44team04.dto.OrderExchange;
import ks44team04.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
