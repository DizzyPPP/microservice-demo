package com.ryu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class MicroserviceEurekaClientApplication {

    @Value("${server.port}")
    String port;

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam String name){
        return  name + " is login in port " + port +", showInfo is working!" ;
    }

    @RequestMapping("/showTest")
    public String showTest(@RequestParam String name){
        return  name + "is login in port " + port +", showTestString is working!";
    }

    @RequestMapping("/showTime")
    public String showTime(@RequestParam String name){
        return  name + " is login in port " + port + ", Time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime()) + ", showCurrentTime is working!";
    }

    @RequestMapping("/showplus")
    public String showplus(@RequestParam int a, @RequestParam int b, @RequestParam String name){
        int c = a + b;
        return  name + " is login in port " + port + ", sum c is a+b="+ c +", showplus is working!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaClientApplication.class, args);
    }
}
