package ks44team04.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;

@org.springframework.stereotype.Service
public class Service {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public ResponseEntity<Object> getData(String url ) {
        ResponseEntity<Object> resultMap = new ResponseEntity<>(null, null, 200);
        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders header = new HttpHeaders();
            HttpEntity<?> entity = new HttpEntity<>(header);

            UriComponents uri = UriComponentsBuilder.fromHttpUrl(url).build();

            resultMap = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, Object.class);

        } catch (HttpClientErrorException | HttpServerErrorException e) {
            log.info(e.toString());
            return resultMap;
        }

        return resultMap;
    }
}