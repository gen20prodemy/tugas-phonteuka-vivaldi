package com.io;
import java.util.List;

//class Product adalah salah satu jenis barang (subclass)
public class Product extends Item {
    private List<String> itemList;  //inisialisasi list

    //Create data
    @Override
    public void addItem(String newItem) {
        itemList.add(newItem);
    }

    //Update data
    @Override
    public void updateItem(int index, String updatedItem) {

        //kondisi jika input user line  tidak ada
        if (index >= 0 && index < itemList.size()) {
            itemList.set(index, updatedItem);       //update data berdasarkan line
            System.out.println("Line " + index + " berhasil di update menjadi " + updatedItem);
        }else{
            System.out.println("Maaf, line yang anda masukkan tidak ada data");
        }
    }

    //Delete data
    @Override
    public void deleteItem(int index) {

        //kondisi jika input user line  tidak ada
        if (index >= 0 && index < itemList.size()) {
            itemList.remove(index);             //delete data berdasarkan line
            System.out.println("Line " + index + " berhasil di hapus");
        }else {
            System.out.println("Maaf, line yang anda masukkan tidak ada data");
        }
    }

    //Print data
    @Override
    public void displayItems() {

        //print seluruh line
        for (String item : itemList) {
            System.out.println(item);
        }
    }

    //Read data (menampilkan data file)
    @Override
    public void readData(FileManager fileManager) {
        itemList = fileManager.readData();
    }

    //Save data (menyimpan data ke file)
    @Override
    public void saveData(FileManager fileManager) {
        fileManager.writeData(itemList);
    }
}
