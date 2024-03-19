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

        //Main menu
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
                    menuSiswa();    //Map Siswa
                } else if (pilih == 2) {
                    menuIO();       //IO File
                }
            } catch (InputMismatchException | NullPointerException e) {
                System.out.println("Mohon masukkan angka\n");
                //start();
            }
        }while (pilih != 0);
    }

    //method crud map siswa
    static void menuSiswa(){

        SiswaMap siswaMap = new SiswaMap();
        int pilih=1;
        int n;
        String m;

        //Menu Map Siswa
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

                //tambah data siswa
                if (pilih == 1) {
                    System.out.print("\nMasukkan nomor siswa : ");
                    n = scn.nextInt();
                    scn.nextLine();
                    System.out.print("Masukkan nama siswa : ");
                    m = scn.nextLine();

                    siswaMap.tambahSiswa(n, m); //tambah data kedalam map

                //ubah data siswa
                } else if (pilih == 2) {
                    System.out.print("\nMasukkan nomor siswa untuk di edit: ");
                    n = scn.nextInt();
                    scn.nextLine();
                    System.out.print("Masukkan nama siswa untuk di edit: ");
                    m = scn.nextLine();

                    siswaMap.ubahData(n, m);    //ubah data dalam map

                //hapus data siswa
                } else if (pilih == 3) {
                    System.out.print("\nMasukkan nomor siswa untuk di hapus: ");
                    n = scn.nextInt();

                    siswaMap.hapusSiswa(n);     //hapus data dalam map

                //cari data siswa
                } else if (pilih == 4){
                    System.out.print("\nMasukkan nomor siswa untuk di cari: ");
                    n = scn.nextInt();

                    System.out.println("Nomor " + n + ", yaitu data " + siswaMap.getNamaSiswa(n));  //get nama siswa
                }

                //print data siswa
                else if (pilih == 5) {
                    siswaMap.tampilkanDaftarSiswa();    //display map
                }

                //input harus angka
            } catch (InputMismatchException | NullPointerException e) {
                System.out.println("Mohon masukkan angka\n");
            }
        }while (pilih != 0);    //exit
    }

    //method crud IO file
    static void menuIO(){

        //membuat path file
        String filePath = "tes.txt";
        //membuat objek
        FileManager fileManager = new FileManager(filePath);
        Product product = new Product();
        product.readData(fileManager);  //read data file

        int pilih=1;
        int inputLine;
        String inputData;

        //Menu IO file
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

                //tambah data file
                if (pilih == 1) {
                    System.out.print("\nMasukkan data file : ");
                    scn.nextLine();
                    inputData = scn.nextLine();

                    product.addItem(inputData);     //tambah data ke file
                    product.saveData(fileManager);  //save file
                    System.out.println("Data baru " + inputData  + " berhasil ditambahkan");

                    //ubah data file
                } else if (pilih == 2) {
                    System.out.print("\nMasukkan line data file untuk di edit: ");
                    inputLine = scn.nextInt();
                    scn.nextLine();
                    System.out.print("Masukkan data file untuk di edit: ");
                    inputData = scn.nextLine();

                    product.updateItem(inputLine, inputData);   //ubah data berdasarkan nomor ke file
                    product.saveData(fileManager);              //save file

                    //hapus data dalam file
                } else if (pilih == 3) {
                    System.out.print("\nMasukkan line data file untuk di hapus: ");
                    inputLine = scn.nextInt();

                    product.deleteItem(inputLine);      //hapus data line dalam file
                    product.saveData(fileManager);      //save file

                    //display data file
                } else if (pilih == 4) {
                    System.out.println("\nData File tes.txt:");
                    product.readData(fileManager);      //read file
                    product.displayItems();             //display file
                }

                //input harus angka
            } catch (InputMismatchException | NullPointerException e) {
                System.out.println("Mohon masukkan angka\n");
            }
        }while (pilih != 0);    //exit
    }
}