package ks44team04.user.controller;

import com.google.gson.Gson;
import ks44team04.dto.RegularPostHistory;
import ks44team04.service.AddressService;
import ks44team04.service.OrderService;
import ks44team04.service.RegularPostService;
import ks44team04.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/regularpost")
public class UserRegularPostController {

    private final Logger log = LoggerFactory.getLogger(getClass());
    private final RegularPostService regularPostService;
    private final AddressService addressService;
    private final OrderService orderService;
    private final Service service;
    private final Gson gson;

    public UserRegularPostController(RegularPostService regularPostService, AddressService addressService, OrderService orderService, Service service, Gson gson) {
        this.regularPostService = regularPostService;
        this.addressService = addressService;
        this.orderService = orderService;
        this.service = service;
        this.gson = gson;
    }

    @GetMapping("/list")
    public String regularPostList(Model model) {

        return "user/regularPost/regularPostList";
    }


    @GetMapping("/modify")
    public String regularPostModify(Model model) {

        return "regularPostExchange";
    }

    @GetMapping("/delete")
    public String regularPostDelete(Model model) {

        return "user/regularPost/regularPostDelete";
    }

    @GetMapping("/skip")
    public String regularPostSkip(Model model) {

        return "user/regularPost/regularPostSkip";
    }

    /*
    @GetMapping("/postcheck/{postCode}")
    public String postCheck(@PathVariable(value = "postCode") String postInfo) {
        PostInfo post = addressService.getPostInfo(postInfo);
        String pcn = post.getPostCompanyName();
        String in = post.getInvoiceNumber();
        String company = "";

        ResponseEntity<Object> companyObj = service.getData("https://apis.tracker.delivery/carriers");
        JsonArray companyArray = gson.toJsonTree(companyObj.getBody()).getAsJsonArray();
        for (JsonElement jsonElement : companyArray) {
            if(jsonElement.getAsJsonObject().get("name").getAsString().contains(pcn)) {
                company = jsonElement.getAsJsonObject().get("id").getAsString();
            }
        }
        return "redirect:https://tracker.delivery/#/" + company + "/" + in;
    }*/

    @GetMapping("/history")
    public String regularPostHistory(Model model) {
        String userId = "buyer01";
        List<RegularPostHistory> regularPostHistory = regularPostService.getRegularPostHistory(userId);
        model.addAttribute("regularPostHistory", regularPostHistory);
        return "user/regularPost/regularPostHistory";
    }

    /*
    @GetMapping("/confirm/{orderdetailcode}")
    public String regularPostConfirm(@PathVariable(value = "orderdetailcode") String orderDetailCode) {
        orderService.setOrderDetailStatus(orderDetailCode, "구매확정");
        return "redirect:/user/regularPostHistory";
    }

     */

/*
    @GetMapping("/exchange/{orderdetailcode}")
    public String regularPostExchange(@PathVariable(value = "orderdetailcode") String orderDetailCode,
                                      Model model) {
        Map<String, Object> orderMap = new HashMap<>();
        orderMap.put("orderDetailCode", orderDetailCode);
        OrderDetail orderDetail = orderService.getOrderDetail(orderMap);
        model.addAttribute("orderDetail", orderDetail);

        return "user/regularPost/regularPostExchange";
    }

 */
/*
    @PostMapping("/exchange")
    public String regularPostExchange(OrderExchange orderExchange) {
        String orderExchangeMaxCode = orderService.getOrderExchangeMaxCode();
        String exchangeAskCode = CodeIndex.codeIndex(orderExchangeMaxCode, 15);
        String sessionId = "buyer01";

        orderExchange.setExchangeAskCode(exchangeAskCode);
        orderExchange.setBuyerId(sessionId);

        orderService.setOrderExchange(orderExchange);
        orderService.setOrderDetailStatus(orderExchange.getOrderDetailCode(), "교환요청");

        return "redirect:/user/regularpost/history";
    }

 */
/*
    @PostMapping("/returnaddress")
    public String setReturnPost(@RequestParam("postType") String postType,
                                @RequestParam("orderDetailCode") String orderDetailCode,
                                @RequestParam("postCompany") String postCompany,
                                @RequestParam("invoiceNumber") String invoiceNumber) {
        Map<String, Object> returnPost = new HashMap<>();
        returnPost.put("postType", postType);
        returnPost.put("orderDetailCode", orderDetailCode);
        returnPost.put("postCompany", postCompany);
        returnPost.put("invoiceNumber", invoiceNumber);
        orderService.setReturnPost(returnPost);
        if (postType.equals("exchange")) {
            orderService.setOrderDetailStatus(orderDetailCode, "교환처리중");
        } else if (postType.equals("refund")) {
            orderService.setOrderDetailStatus(orderDetailCode, "환불처리중");
        }
        return "redirect:/user/regularpost/history";
    }

 */
}