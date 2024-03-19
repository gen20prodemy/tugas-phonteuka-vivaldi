package com.latihan.demo.controller;

import com.latihan.demo.model.Kalkulator;
import com.latihan.demo.service.KurangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KurangController {

    @Autowired
    private KurangService kurangService;

    @PostMapping("/minus")
    public int kurang(@RequestBody Kalkulator kalkulator){
        int num1 = kalkulator.getAngka1();
        int num2 = kalkulator.getAngka2();
        return kurangService.minusNumber(num1, num2);
    }
}
