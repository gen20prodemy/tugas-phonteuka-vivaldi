package com.latihan.demo.controller;

import com.latihan.demo.model.Kalkulator;
import com.latihan.demo.service.KaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KaliController {

    @Autowired
    private KaliService kaliService;

    @PostMapping("/times")
    public int kali(@RequestBody Kalkulator kalkulator){
        int num1 = kalkulator.getAngka1();
        int num2 = kalkulator.getAngka2();
        return kaliService.timesNumber(num1, num2);
    }
}
