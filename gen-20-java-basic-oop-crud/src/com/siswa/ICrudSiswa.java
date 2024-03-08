package com.siswa;

public interface ICrudSiswa {

    public void tambahSiswa(int nomorSiswa, String namaSiswa);

    public void hapusSiswa(int nomorSiswa);

    public void tampilkanDaftarSiswa();

    public void ubahData(int nomorSiswa, String namaSiswaBaru);

}
