package com.ryu.controlller;

import com.ryu.service.SchedualShowInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @author Administrator
 * @create 2018-06-20 10:16
 */

@RestController
public class ShowInfoController {

    @Autowired
    SchedualShowInfoService schedualShowInfoService;

    @RequestMapping(value = "/showInfo", method = RequestMethod.GET)
    public String showInfo(@RequestParam String name){
        return schedualShowInfoService.showInfoFeignClient(name);
    }


}
