package ks44team04.util;

import ks44team04.dto.PointDeal;
import ks44team04.dto.PointDetail;
import ks44team04.service.PointService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    private final Logger log = LoggerFactory.getLogger(getClass());

    PointService pointService;

    public Test(PointService pointService) {
        this.pointService = pointService;
    }

    /*@GetMapping("/test")
    public String test(Model model,
                       @RequestParam(value = "test", required = false) Object test) {
        log.info("======================================================");
        log.info("{}", test);

        return "redirect:/test";
    }*/
    @GetMapping("/test")
    public String test() {
        PointDeal pointDeal = new PointDeal();
        pointDeal.setPointDealPrice(1);
        pointDeal.setPointDealReference("1");
        pointDeal.setPointDealReason("1");
        pointDeal.setUserId("buyer01");
        pointDeal.setStatus("적립");

        String result = pointService.addPointDeal(pointDeal);

        PointDetail pointDetail = new PointDetail();
        pointDetail.setUserId("buyer01");
        pointDetail.setPointDealDetail(1);
        pointDetail.setPointDealId(result);

        pointService.addPointDetailPlus(pointDetail);

        return "test";
    }
}
