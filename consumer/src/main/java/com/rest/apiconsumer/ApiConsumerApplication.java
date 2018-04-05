package com.rest.apiconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiConsumerApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApiConsumerApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiConsumerApplication.class, args);
    }
}

@RestController
class restTemplateTest{

    @GetMapping(path = "/put")
    public void runPutRequest(@RequestParam(value = "val", required = false) Integer val){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put("http://localhost:8080/putMap", val);
    }
}
