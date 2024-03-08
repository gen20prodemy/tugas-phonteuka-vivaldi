package com.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//FileManager untuk mengelola operasi file terkait data barang
public class FileManager {
    private String filePath;

    //constructor
    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    //read data dari file (menampilkan data file)
    public List<String> readData() {
        List<String> itemList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                itemList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemList;    //mengembalikan list
    }

    //write data ke file (save data)
    public void writeData(List<String> itemList) {  //dari list
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String item : itemList) {
                bw.write(item);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
