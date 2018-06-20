package com.ryu.service;

import org.springframework.stereotype.Component;

/**
 * override
 *
 * @author Administrator
 * @create 2018-06-20 14:36
 */

@Component
public class SchedualServiceHystric implements SchedualShowInfoService {
    @Override
    public String showInfoFeignClient(String name) {
        return "When you see this error page,it means " + name + " working successfully!" ;
    }
}
