package com.mahmud.spring_webclient.controlller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.jfr.ContentType;
import org.apache.coyote.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

@RestController
@RequestMapping("/")
public class GetMethodController {
    private final String url = "http://localhost:3000";

    @GetMapping("/get")
    public ResponseEntity<JsonNode> performGetOperation() throws JsonProcessingException {
        RestClient restClient = RestClient.create();
         String result = restClient.get()
                .uri(url)
                .retrieve().body(String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree(result);

        return new ResponseEntity<>(json,HttpStatus.OK);
    }

}
