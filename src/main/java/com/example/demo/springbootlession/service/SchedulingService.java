//package com.example.demo.springbootlession.service;
//
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
///**
// * @author ygt
// * @create 2022-07-01-15:58
// */
//@Service
//@EnableScheduling//这个注解一定要加，开启定时任务
//public class SchedulingService {
//    @Scheduled(fixedDelay = 5000000) //5秒执行一次，定时任务
//    public void job(){
//        System.out.println("任务执行！！");
//    }
//    @Scheduled(cron = "0 0 0 * * ?")//每天的林晨开始执行任务
//    public void job1(){
//        System.out.println("在具体事件任务执行？？？");
//    }
//}
