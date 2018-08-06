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

/**
 * 使用@FeignClient注解对该接口进行代理,使用value或者name标注要调用的服务(一般是用于服务发现),
 * spring cloud在启动应用时,Feign会扫描包下所有使用@FeignClient注解的接口,生成代理,并且注册到Spring容器之中
 * Feign在生成代理时候会为每一个代理的接口方法生成一个RestTemplate对象,该对象封装了Http所有的请求信息
 * 此处表明使用MICROSERVICE-EUREKA-CLIENT服务的showInfo接口
 */
@FeignClient(value = "microservice-eureka-client")
public interface SchedualShowInfoService {

    @RequestMapping(value = "/showInfo", method = RequestMethod.GET)
    String showInfoFeignClient(@RequestParam(value = "name") String name);

}
