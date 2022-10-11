package ks44team04.order;

import ks44team04.dto.OrderDetailStr;
import ks44team04.service.OrderService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.mock.mockito.MockBean;

public class OrderTest {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @MockBean
    OrderService orderService;

    @Test
    void curdateTest() {
        OrderDetailStr orderDetailStr = new OrderDetailStr();
        orderDetailStr.setGoodsCode("asd,asd");
        log.info("{}", orderDetailStr.getGoodsCode().split(",").length);


    }
}
