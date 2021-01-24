package com.example.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class autoClock {

    @Scheduled(fixedDelay = 30*1000)
    public void  schedu(){
        System.out.println("");
    }
}
