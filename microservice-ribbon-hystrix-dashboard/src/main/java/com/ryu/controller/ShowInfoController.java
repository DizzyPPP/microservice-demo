package com.ryu.controller;

import com.ryu.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @author Administrator
 * @create 2018-06-20 9:45
 */

@RestController
public class ShowInfoController {

    @Autowired
    private ShowService showService;

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam String name){
        return showService.showInfoService(name);
    }

    @RequestMapping("/showTest")
    public String showTest(@RequestParam String name){
        return showService.showTestString(name);
    }

    @RequestMapping("/showTime")
    public String showTime(@RequestParam String name){
        return showService.showCurrentTime(name);
    }

    @RequestMapping("/showplus")
    public String showEmul(@RequestParam int a, @RequestParam int b, @RequestParam String name){
        return showService.plusAndshowName(a, b, name);
    }
}
