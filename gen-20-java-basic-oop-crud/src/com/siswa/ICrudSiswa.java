package com.siswa;

//class interface CRUD siswa
public interface ICrudSiswa {

    //memuat method yang mengharuskan class SiswaMap menggunakan method CRUD
    public void tambahSiswa(int nomorSiswa, String namaSiswa);
    public void hapusSiswa(int nomorSiswa);
    public void tampilkanDaftarSiswa();
    public void ubahData(int nomorSiswa, String namaSiswaBaru);
    public String getNamaSiswa(int nomorSiswa);

}
