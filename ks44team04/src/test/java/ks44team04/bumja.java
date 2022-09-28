package ks44team04;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import ks44team04.service.Service;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonBuilderCustomizer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class bumja {
    private GsonBuilderCustomizer gsonBuilderCustomizer;
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    Service service;
    @Autowired
    Gson gson;

    @Test
    void test() {
        String userId = "buyer01";

        ResponseEntity<Object> test = service.getData("https://apis.tracker.delivery/carriers/kr.logen/tracks/33816734302");
        log.info("---------------------------------------------------------------------");
        log.info("{}", test);

        Object json = test.getBody();
        //JsonObject state = jsonObject.get("state").getAsJsonObject();
        log.info("---------------------------------------------------------------------");
        log.info("{}", json);

        String strJson = gson.toJson(json);
        JsonElement jsonElementTree = gson.toJsonTree(json);
        String result = jsonElementTree.getAsJsonObject()
                .get("state").getAsJsonObject()
                .get("id").getAsString();

        log.info("---------------------------------------------------------------------");
        log.info("{}", result);


    }
}