package com.siswa;

import java.util.HashMap;
import java.util.Map;

public class SiswaMap implements ICrudSiswa{
    // Map untuk menyimpan nomor siswa (key) dan nama siswa (value)

    private Map<Integer, String> dataSiswa;

    // Konstruktor untuk inisialisasi map
    public SiswaMap() {
        dataSiswa = new HashMap<>();
    }

    // Method untuk menambahkan siswa ke dalam map
    public void tambahSiswa(int nomorSiswa, String namaSiswa) {
        //dataSiswa.put(nomorSiswa, namaSiswa);

        if (dataSiswa.containsKey(nomorSiswa)) {
            System.out.println("Maaf, nomor " + nomorSiswa + " yang Anda daftarkan sudah ada");
        } else {
            dataSiswa.put(nomorSiswa, namaSiswa);
            System.out.println("Data siswa dengan nomor " + nomorSiswa + " bernama " + namaSiswa + " berhasil ditambahkan");
        }
    }

    // Method untuk mengubah data dalam map berdasarkan key
    public void ubahData(int nomorSiswa, String namaSiswaBaru) {

        if (dataSiswa.containsKey(nomorSiswa)) {
            dataSiswa.put(nomorSiswa, namaSiswaBaru);
            System.out.println("Data siswa dengan nomor " + nomorSiswa + " berhasil diubah menjadi " + namaSiswaBaru);
        } else {
            System.out.println("Maaf, nomor siswa tidak ditemukan");
        }

    }

    // Method untuk mendapatkan nama siswa berdasarkan nomor siswa
    public String getNamaSiswa(int nomorSiswa) {
        return dataSiswa.getOrDefault(nomorSiswa, "Siswa tidak ditemukan");
    }

    // Method untuk menghapus siswa berdasarkan nomor siswa
    public void hapusSiswa(int nomorSiswa) {

        try {
            if (dataSiswa.containsKey(nomorSiswa)) {
                dataSiswa.remove(nomorSiswa);
                System.out.println("Data siswa dengan nomor " + nomorSiswa + " berhasil di hapus");
            } else {
                throw new Exception("Maaf, nomor siswa tidak ditemukan");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    // Method untuk menampilkan daftar siswa
    public void tampilkanDaftarSiswa() {
        if(dataSiswa.isEmpty()){
            System.out.println("Data siswa kosong");
        }
        else {
            System.out.println("\nDaftar Siswa:");
            for (Map.Entry<Integer, String> entry : dataSiswa.entrySet()) {
                System.out.println("Nomor: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }

    public Map<Integer, String> getDataSiswa() {
        return dataSiswa;
    }

    public void setDataSiswa(Map<Integer, String> dataSiswa) {
        this.dataSiswa = dataSiswa;
    }
}
