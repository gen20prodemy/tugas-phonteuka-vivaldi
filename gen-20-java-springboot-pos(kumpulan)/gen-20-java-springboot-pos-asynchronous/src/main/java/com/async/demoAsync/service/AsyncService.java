package com.async.demoAsync.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async
    public void generateReport(String reportData) {
        // Proses pembuatan laporan...
        System.out.println("Generating report 1...");
        try {
            // Simulasi proses pembuatan laporan yang memakan waktu
            Thread.sleep(7000); // 7 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Report 1 generated!");
    }

    @Async
    public void generateReport2(String reportData) {
        // Proses pembuatan laporan...
        System.out.println("Generating report 2...");
        try {
            // Simulasi proses pembuatan laporan yang memakan waktu
            Thread.sleep(4000); // 4 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Report 2 generated!");
    }
}
