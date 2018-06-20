package com.ryu.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Service
 *
 * @author Administrator
 * @create 2018-06-20 10:12
 */

@FeignClient(value = "microservice-eureka-client")
public interface SchedualShowInfoService {

    @RequestMapping(value = "/showInfo", method = RequestMethod.GET)
    String showInfoFeignClient(@RequestParam(value = "name") String name);

}
