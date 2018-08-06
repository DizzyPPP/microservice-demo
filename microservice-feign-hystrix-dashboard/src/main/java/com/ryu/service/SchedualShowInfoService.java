package com.ryu.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @create 2018-06-20 10:12
 */

/**
 * Feign使用断路器可以直接在@FeignClient增加fallback参数并且指定实现类(实现@FeignClient注解的接口的类)即可
 * 注:@Primary用来解决@Autowired发现多个类型而导致无法注入的问题，也可以使用@Qualifier注解要使用的Bean
 *
 */
@Primary
@FeignClient(value = "microservice-eureka-client", fallback = SchedualServiceHystric.class)
public interface SchedualShowInfoService {

    @RequestMapping(value = "/showInfo", method = RequestMethod.GET)
    String showInfoFeignClient(@RequestParam(value = "name") String name);

}
