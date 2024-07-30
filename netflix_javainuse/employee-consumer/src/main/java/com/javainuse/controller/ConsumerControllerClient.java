package com.javainuse.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


@Slf4j
@Component
public class ConsumerControllerClient {

    @Autowired
    private RestTemplate restTemplate;

    public void getEmployee() throws RestClientException, IOException {
        String baseUrl = "http://localhost:8080/employee";
        // RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = null;

        try {
            response = restTemplate.exchange(baseUrl,
                    HttpMethod.GET, getHeaders(), String.class);
        } catch (Exception ex) {
            log.info(ex.getMessage());
        }
        log.info(response.getBody());
    }

    private static HttpEntity<?> getHeaders() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }
}


