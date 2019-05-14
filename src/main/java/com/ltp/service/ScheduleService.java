package com.ltp.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Service;

/**
 * @projectName springboot-task
 * @ClassName ScheduleService
 * @Auther Ltp
 * @Date 2019/5/13 10:59
 * @Description 定时任务
 * @Version 1.0
 */
@Service
public class ScheduleService {
    private int i = 1;

    /*
     * second , minute, hour, day of month, month, day of week.
     * 0 * * * * MON-FRI 每个月周一至周五的0秒执行一次
     *  【0 0/5 14,18 * * ?】 每天14点整，和18点整，每隔5分钟执行一次
     *  【0 15 10 ? * 1-6】 每个月的周一至周六10:15分执行一次
     *  【0 0 2 ? * 6L】每个月的最后一个周六凌晨2点执行一次
     *  【0 0 2 LW * ?】每个月的最后一个工作日凌晨2点执行一次
     *  【0 0 2-4 ? * 1#1】每个月的第一个周一凌晨2点到4点期间，每个整点都执行一次；
     * */
    //@Scheduled(cron = "0 * * * * MON-FRI")
    @Scheduled(cron = "0/5 * * * * MON-FRI")//每5秒执行一次
    public void method() {
        System.out.println("hello world" + i);
        i++;
    }
}
