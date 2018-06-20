package com.ryu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @author Administrator
 * @create 2018-06-20 10:46
 */

@RestController
public class NewErrorController {

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String printErrorMes(){
        return "<h1>Oooops,Wrong Page,Please local error messages at dashboard</h1>";
    }

}
