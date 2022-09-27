package ks44team04;

import ks44team04.dto.CouponStatus;
import ks44team04.dto.RegularPostHistory;
import ks44team04.service.CouponService;
import ks44team04.service.RegularPostService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class bumja {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private CouponService couponService;
    @Autowired
    private RegularPostService regularPostService;


    @Test
    void test() {
        String userId = "buyer01";
        List<RegularPostHistory> test = regularPostService.getRegularPostHistory(userId);
        log.info("===================================================, {}", test);

    }
}