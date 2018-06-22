package com.ryu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RefreshScope
@EnableEurekaClient
public class MicroserviceRabbitmqConfigClientApplication {

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/getFoo")
    public String getConfigReturn(){
        return "get <h1>" + foo + "</h1> from remote config file";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceRabbitmqConfigClientApplication.class, args);
    }
}
