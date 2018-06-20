package com.ryu.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Service
 *
 * @author Administrator
 * @create 2018-06-20 10:12
 */

@Primary
@FeignClient(value = "microservice-eureka-client", fallback = SchedualServiceHystric.class)
public interface SchedualShowInfoService {

    @RequestMapping(value = "/showInfo", method = RequestMethod.GET)
    String showInfoFeignClient(@RequestParam(value = "name") String name);

}
