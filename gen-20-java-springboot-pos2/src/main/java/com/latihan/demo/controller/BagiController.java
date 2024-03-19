package com.latihan.demo.controller;

import com.latihan.demo.model.Kalkulator;
import com.latihan.demo.service.BagiService;
import com.latihan.demo.service.KaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BagiController {

    @Autowired
    private BagiService bagiService;

    @PostMapping("/devide")
    public float bagi(@RequestBody Kalkulator kalkulator){
        float num1 = kalkulator.getAngka1();
        float num2 = kalkulator.getAngka2();
        return bagiService.devideNumber(num1, num2);
    }
}
