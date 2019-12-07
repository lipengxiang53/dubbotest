package com.consumer.test.controller;

import com.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Lee53
 * @Date 2019-12-07 21:47
 */
@RestController
public class TestController {
    @Reference(version ="1.0.0")
    private TestService testService;

    @RequestMapping("/ins")
    public String ins(){
        testService.ins();
        return "ins";
    }

    @RequestMapping("/del")
    public String del(){
        testService.del();
        return "del";
    }

    @RequestMapping("/upd")
    public String upd(){
        testService.upd();
        return "upd";
    }

    @RequestMapping("/sel")
    public String sel(){
        testService.sel();
        return "sel";
    }

}
