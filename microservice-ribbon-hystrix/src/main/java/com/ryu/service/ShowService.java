package com.ryu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



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
        return "Error Service "+ name + " ,Hystrix is working!";
    }

}
