package com.latihan.demo.service;

import org.springframework.stereotype.Service;

@Service
public class KurangService {

    public int minusNumber(int angka1, int angka2){
        return angka1 - angka2;
    }
}
