package com.latihan.demo.service;

import org.springframework.stereotype.Service;

@Service
public class KalkulatorService {

    public int tambahAngka(int angka1, int angka2) {
        return angka1 + angka2;
    }

    public int kurangAngka(int angka1, int angka2) {
        return angka1 - angka2;
    }

    public int kaliAngka(int angka1, int angka2) {
        return angka1 * angka2;
    }

    public float bagiAngka(float angka1, float angka2) {
        return angka1 / angka2;
    }


}
