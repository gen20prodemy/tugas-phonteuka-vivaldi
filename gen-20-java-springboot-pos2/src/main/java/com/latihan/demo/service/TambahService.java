package com.latihan.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TambahService {

    public int addNumber (int angka1, int angka2){
        return angka1 + angka2;
    }
}
