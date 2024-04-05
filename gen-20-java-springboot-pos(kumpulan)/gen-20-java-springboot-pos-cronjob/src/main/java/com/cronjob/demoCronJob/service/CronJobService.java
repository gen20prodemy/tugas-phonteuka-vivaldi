package com.cronjob.demoCronJob.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CronJobService {
    public void tesCron() {
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.println("test Cron Job on: " +date.toString());
    }
}
