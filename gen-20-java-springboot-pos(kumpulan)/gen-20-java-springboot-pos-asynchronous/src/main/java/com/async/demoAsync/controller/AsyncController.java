package com.async.demoAsync.controller;

import com.async.demoAsync.service.AsyncService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class AsyncController {
    private final AsyncService asyncService;

    public AsyncController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @PostMapping("/async")
    public String generateReport(String reportData) {
        reportData = "report data";
        asyncService.generateReport(reportData);

        asyncService.generateReport2(reportData);
        return "All report finish!";
    }
}
