package com.main;

import com.siswa.SiswaMap;
import com.io.FileManager;
import com.io.Item;
import com.io.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        int pilih=1;

        do {
            try {
                System.out.println("\n===Pilih Menu===");
                System.out.println("1. Menu Map Siswa");
                System.out.println("2. Menu IO File");
                System.out.println("0. Keluar");
                System.out.print("\nMasukkan pilihan menu: ");
                Scanner scn = new Scanner(System.in);
                pilih = scn.nextInt(); //inputMismatchException

                if (pilih == 1) {
                    menuSiswa();
                } else if (pilih == 2) {
                    menuIO();
                }
            } catch (InputMismatchException | NullPointerException e) {
                System.out.println("Mohon masukkan angka\n");
                //start();
            }
        }while (pilih != 0);
    }

    static void menuSiswa(){

        SiswaMap siswaMap = new SiswaMap();
        int pilih=1;
        int n;
        String m;

        do {
            try {
                System.out.println("\n===Pilih Menu Map Siswa===");
                System.out.println("1. Tambah Data Siswa");
                System.out.println("2. Ubah Data Siswa");
                System.out.println("3. Hapus Data Siswa");
                System.out.println("4. Cari Data Siswa");
                System.out.println("5. Print Data Siswa");
                System.out.println("0. Keluar");
                System.out.print("\nMasukkan pilihan menu: ");
                Scanner scn = new Scanner(System.in);
                pilih = scn.nextInt(); //inputMismatchException

                //siswaMap.getDataSiswa();
                //System.out.println(siswaMap);
                if (pilih == 1) {
                    System.out.print("\nMasukkan nomor siswa : ");
                    n = scn.nextInt();
                    scn.nextLine();
                    System.out.print("Masukkan nama siswa : ");
                    m = scn.nextLine();

                    siswaMap.tambahSiswa(n, m);
                } else if (pilih == 2) {
                    System.out.print("\nMasukkan nomor siswa untuk di edit: ");
                    n = scn.nextInt();
                    scn.nextLine();
                    System.out.print("Masukkan nama siswa untuk di edit: ");
                    m = scn.nextLine();

                    siswaMap.ubahData(n, m);
                } else if (pilih == 3) {
                    System.out.print("\nMasukkan nomor siswa untuk di hapus: ");
                    n = scn.nextInt();

                    siswaMap.hapusSiswa(n);
                } else if (pilih == 4){
                    System.out.print("\nMasukkan nomor siswa untuk di cari: ");
                    n = scn.nextInt();

                    System.out.println("Nomor " + n + ", yaitu data " + siswaMap.getNamaSiswa(n));

                }
                else if (pilih == 5) {
                    siswaMap.tampilkanDaftarSiswa();
                }


            } catch (InputMismatchException | NullPointerException e) {
                System.out.println("Mohon masukkan angka\n");
                //start();
            }
        }while (pilih != 0);
    }

    static void menuIO(){
        //membuat path file
        String filePath = "tes.txt";
        FileManager fileManager = new FileManager(filePath);

        Product product = new Product();
        product.readData(fileManager);

        int pilih=1;
        int inputLine;
        String inputData;

        do {
            try {
                System.out.println("\n===Pilih Menu IO File===");
                System.out.println("1. Tambah Data File");
                System.out.println("2. Ubah Data File");
                System.out.println("3. Hapus Data File");
                System.out.println("4. Print Data File");
                System.out.println("0. Keluar");
                System.out.print("\nMasukkan pilihan menu: ");
                Scanner scn = new Scanner(System.in);
                pilih = scn.nextInt(); //inputMismatchException

                if (pilih == 1) {
                    System.out.print("\nMasukkan data file : ");
                    scn.nextLine();
                    inputData = scn.nextLine();

                    product.addItem(inputData);
                    product.saveData(fileManager);
                    System.out.println("Data baru " + inputData  + " berhasil ditambahkan");

                } else if (pilih == 2) {
                    System.out.print("\nMasukkan line data file untuk di edit: ");
                    inputLine = scn.nextInt();
                    scn.nextLine();
                    System.out.print("Masukkan data file untuk di edit: ");
                    inputData = scn.nextLine();

                    product.updateItem(inputLine, inputData);
                    product.saveData(fileManager);

                } else if (pilih == 3) {
                    System.out.print("\nMasukkan line data file untuk di hapus: ");
                    inputLine = scn.nextInt();

                    product.deleteItem(inputLine);
                    product.saveData(fileManager);

                } else if (pilih == 4) {
                    System.out.println("\nData File tes.txt:");
                    product.readData(fileManager);
                    product.displayItems();
                }


            } catch (InputMismatchException | NullPointerException e) {
                System.out.println("Mohon masukkan angka\n");
                //start();
            }
        }while (pilih != 0);

    }

}