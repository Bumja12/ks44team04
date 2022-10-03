package ks44team04.mapper;

import ks44team04.dto.OrderDetail;
import ks44team04.dto.OrderExchange;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface OrderMapper {

    public void setOrderExchange(OrderExchange orderExchange);

    public String getOrderExchangeMaxCode();

    public OrderDetail getOrderDetail(Map<String, Object> orderMap);
}
