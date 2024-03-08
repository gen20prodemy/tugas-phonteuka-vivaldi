package com.io;

//kelas abstrak yang merepresentasikan item barang
public abstract class Item {

    //setiap method harus sama dengan subclass
    public abstract void addItem(String newItem);
    public abstract void updateItem(int index, String updatedItem);
    public abstract void deleteItem(int index);
    public abstract void displayItems();
    public abstract void readData(FileManager fileManager);
    public abstract void saveData(FileManager fileManager);
}
