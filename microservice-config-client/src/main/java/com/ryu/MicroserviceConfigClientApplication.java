package com.ryu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MicroserviceConfigClientApplication {

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/getFoo")
    public String getConfigReturn(){
        return "get <h1>" + foo + "</h1> from remote config file";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigClientApplication.class, args);
    }
}
