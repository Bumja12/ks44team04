package ks44team04;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import ks44team04.admin.controller.*;
import ks44team04.mapper.AddressMapper;
import ks44team04.mapper.OrderMapper;
import ks44team04.mapper.RegularPostMapper;
import ks44team04.service.AddressService;
import ks44team04.service.OrderService;
import ks44team04.service.RegularPostService;
import ks44team04.service.Service;
import ks44team04.user.controller.UserAddressController;
import ks44team04.user.controller.UserOrderController;
import ks44team04.user.controller.UserRegularAskController;
import ks44team04.user.controller.UserRegularPostController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class bumja {

    @Mock
    AddressMapper a;
    @Mock
    OrderMapper b;
    @Mock
    RegularPostMapper c;
    @Mock
    UserRegularPostController d;


    Service service = new Service();
    Gson gson = new Gson();
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    void test() {
        List<String> list = new ArrayList<>();
        list.add("equals");
        list.add("toString");
        list.add("hashCode");
        list.add("setMockitoInterceptor");
        list.add("getMockitoInterceptor");
        list.add("wait");
        list.add("getClass");
        list.add("notify");
        list.add("notifyAll");

        System.out.println("getSimpleName() : " + a.getClass().getName());
        for(Method method : a.getClass().getMethods()){
            if(!list.contains(method.getName())) {
                System.out.println("method          : " + method.getName());
            }
        }

        System.out.println("getSimpleName() : " + b.getClass().getName());
        for(Method method : b.getClass().getMethods()){
            if(!list.contains(method.getName())) {
                System.out.println("method          : " + method.getName());
            }
        }

        System.out.println("getSimpleName() : " + c.getClass().getName());
        for(Method method : c.getClass().getMethods()){
            if(!list.contains(method.getName())) {
                System.out.println("method          : " + method.getName());
            }
        }

        System.out.println("getSimpleName() : " + d.getClass().getName());
        for(Method method : d.getClass().getMethods()){
            if(!list.contains(method.getName())) {
                System.out.println("method          : " + method.getName());
            }
        }
    }

    /*
    @Test
    void test() {
        String userId = "buyer01";

        ResponseEntity<Object> test = service.getData("https://apis.tracker.delivery/carriers/kr.logen/tracks/33816734302");
        log.info("---------------------------------------------------------------------");
        log.info("{}", test);

        Object json = test.getBody();
        String strJson = gson.toJson(json);

        JsonElement jsonElementTree = gson.toJsonTree(json);
        String result = jsonElementTree.getAsJsonObject()
                .get("state").getAsJsonObject()
                .get("text").getAsString();

        log.info("---------------------------------------------------------------------");
        log.info("{}", result);
    }
    */

    /*
    @Test
    void test2() {

        ResponseEntity<Object> companyObj = service.getData("https://apis.tracker.delivery/carriers");
        String companyStr = gson.toJson(companyObj.getBody());
        JsonArray companyArr = gson.toJsonTree(companyObj.getBody()).getAsJsonArray();
        for (JsonElement jsonElement : companyArr) {
            log.info("{}", jsonElement.getAsJsonObject().get("id").getAsString());
        }
        log.info("{}", companyStr);

        addressService.getAddressListCode();
    }
     */
}