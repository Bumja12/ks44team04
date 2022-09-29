package ks44team04;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import ks44team04.service.AddressService;
import ks44team04.service.Service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
class bumja {

    @Mock
    AddressService addressService;

    Service service = new Service();
    Gson gson = new Gson();
    private final Logger log = LoggerFactory.getLogger(getClass());

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
}