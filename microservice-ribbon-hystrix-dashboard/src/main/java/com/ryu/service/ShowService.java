package com.ryu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * show Info
 *
 * @author Administrator
 * @create 2018-06-20 9:40
 */

@Service
public class ShowService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "showInfoErrorMes")
    public String showInfoService(String name){
        return restTemplate.getForObject("http://MICROSERVICE-EUREKA-CLIENT/showInfo?name=" + name, String.class);
    }

    public String showInfoErrorMes(String name){
        return "Error Service "+ name + " ,Hystrix showInfoErrorMes is working!";
    }

    @HystrixCommand(fallbackMethod = "showTestStringErrorMes")
    public String showTestString(String name){
        return restTemplate.getForObject("http://MICROSERVICE-EUREKA-CLIENT/showTest?name=" + name, String.class);
    }

    public String showTestStringErrorMes(String name){
        return "Error Service "+ name + " ,Hystrix showTestStringErrorMes is working!";
    }

    @HystrixCommand(fallbackMethod = "showCurrentTimeErrorMes")
    public String showCurrentTime(String name){
        return restTemplate.getForObject("http://MICROSERVICE-EUREKA-CLIENT/showTime?name=" + name, String.class);
    }

    public String showCurrentTimeErrorMes(String name){
        return "Error Service "+ name + " ,Time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime()) + ", Hystrix showCurrentTimeErrorMes is working!";
    }


}
