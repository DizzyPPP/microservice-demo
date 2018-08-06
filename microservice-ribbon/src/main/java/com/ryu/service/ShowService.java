package com.ryu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * show Info
 *
 * @author Administrator
 * @create 2018-06-20 9:40
 */

/**
 * 使用RestTemplate消费MICROSERVICE-EUREKA-CLIENT服务的showInfo接口,也可以直接使用url来指明服务
 * 由于Ribbon会根据服务名来选择具体的服务实例,运行时会用url代替具体实例,因此建议使用服务名
 */
@Service
public class ShowService {

    @Autowired
    RestTemplate restTemplate;

    public String showInfoService(String name){
        return restTemplate.getForObject("http://MICROSERVICE-EUREKA-CLIENT/showInfo?name=" + name, String.class);
    }


}
