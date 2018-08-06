package com.ryu.service;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @create 2018-06-20 14:36
 */

/**
 * 使用fallback属性时候,需要使用@Component注解，保证fallback指定的类能被Spring容器扫描到
 */

@Component
public class SchedualServiceHystric implements SchedualShowInfoService {
    @Override
    public String showInfoFeignClient(String name) {
        return "When you see this error page,it means " + name + " working successfully!" ;
    }
}
