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


@SpringBootApplication
@RestController
public class MicroserviceClientZipkinApplication {

    private static final Logger LOGGER = Logger.getLogger(MicroserviceClientZipkinApplication.class.getName());

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

    @RequestMapping("/callHome")
    public String callHome(){
        LOGGER.log(Level.INFO,"using Zipkin client!!method is callHome");
        return restTemplate.getForObject("http://localhost:8989/maininfo", String.class);
    }

    @RequestMapping("/clientinfo")
    public String info(){
        LOGGER.log(Level.INFO,"using Zipkin client!!method is info");
        return "<h1>using Zipkin client</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceClientZipkinApplication.class, args);
    }

}
