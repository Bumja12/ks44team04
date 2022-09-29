package ks44team04.mapper;

import ks44team04.dto.OrderExchange;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    public void setOrderExchange(OrderExchange orderExchange);

    public String getOrderExchangeMaxCode();
}
