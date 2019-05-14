package com.ltp.controller;

import com.ltp.service.AsynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName springboot-task
 * @ClassName AsynController
 * @Auther Ltp
 * @Date 2019/5/13 10:54
 * @Description 控制层
 * @Version 1.0
 */
@RestController
public class AsynController {
    @Autowired
    private AsynService asynService;

    @GetMapping(value = "/hello")
    public String hello() {
        asynService.asynMthod();
        return "哈哈哈";
    }
}
