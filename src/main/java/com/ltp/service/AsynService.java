package com.ltp.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @projectName springboot-task
 * @ClassName AsynService
 * @Auther Ltp
 * @Date 2019/5/13 10:52
 * @Description 异步任务
 * @Version 1.0
 */
@Service
@Async//开启异步处理
public class AsynService {
    public void asynMthod() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据处理中。。。。");
    }
}
