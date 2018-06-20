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
    ShowService showService;

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam String name){
        return showService.showInfoService(name);
    }

}
