package com.latihan.demo.controller;

import com.latihan.demo.model.Kalkulator;
import com.latihan.demo.service.KalkulatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KalkulatorController {

    @Autowired
    private KalkulatorService kalkulatorService;

    @PostMapping("/tambah")
    public int tambahNumber(@RequestBody Kalkulator kalkulator) {
        int num1 = kalkulator.getAngka1();
        int num2 = kalkulator.getAngka2();
        return kalkulatorService.tambahAngka(num1, num2);
    }

    @PostMapping("/kurang")
    public int kurangNumber(@RequestBody Kalkulator kalkulator) {
        int num1 = kalkulator.getAngka1();
        int num2 = kalkulator.getAngka2();
        return kalkulatorService.kurangAngka(num1, num2);
    }

    @PostMapping("/kali")
    public int kaliNumber(@RequestBody Kalkulator kalkulator) {
        int num1 = kalkulator.getAngka1();
        int num2 = kalkulator.getAngka2();
        return kalkulatorService.kaliAngka(num1, num2);
    }

    @PostMapping("/bagi")
    public float bagiNumber(@RequestBody Kalkulator kalkulator) {
        float num1 = kalkulator.getAngka1();
        float num2 = kalkulator.getAngka2();
        return kalkulatorService.bagiAngka(num1, num2);
    }
}
