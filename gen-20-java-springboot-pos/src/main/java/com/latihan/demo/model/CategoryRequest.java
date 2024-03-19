package com.latihan.demo.model;

public class CategoryRequest {
    private int idCategory;
    private String NamaKategori;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNamaKategori() {
        return NamaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        NamaKategori = namaKategori;
    }

    //db  --> entity ---> dto


}
