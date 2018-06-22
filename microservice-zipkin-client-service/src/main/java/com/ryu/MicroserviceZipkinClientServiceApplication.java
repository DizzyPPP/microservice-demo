package com.ryu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@SpringBootApplication
public class MicroserviceZipkinClientServiceApplication {

    private static final Logger LOGGER = Logger.getLogger(MicroserviceZipkinClientServiceApplication.class.getName());

    @Autowired
    public RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

    @RequestMapping("/zipkin")
    public String callHome(){
        LOGGER.log(Level.INFO, "using Zipkin client service!!method is callHome");
        return restTemplate.getForObject("http://localhost:8988/clientinfo", String.class);
    }

    @RequestMapping("/maininfo")
    public String info(){
        LOGGER.log(Level.INFO, "using Zipkin client service!!method is info");
        return "<h1>using Zipkin client service</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceZipkinClientServiceApplication.class, args);
    }
}
