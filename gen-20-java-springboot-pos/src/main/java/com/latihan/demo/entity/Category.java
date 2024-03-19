package com.latihan.demo.entity;

//import org.springframework.boot.autoconfigure.domain.Entity;

//@Entity
//@Table(name = "Kategori")
public class Category {
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



}
