package com.ryu.service;

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

    public String showInfoService(String name){
        return restTemplate.getForObject("http://MICROSERVICE-EUREKA-CLIENT/showInfo?name=" + name, String.class);
    }


}
