public class KategoriProduk {
    //atribut produk
    String nama;
    private String deskripsi;
    double harga;

    //default value atribut
    public KategoriProduk(){
        this.nama = "Belum ada nama barang";
        this.deskripsi = "Belum ada deskripsi";
        this.harga = 1000;
    }

    //method prioritas 2 (jika ada method sama pada subclass)
    void display(){
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Deskripsi\t: " + this.deskripsi);
        System.out.println("Harga\t\t: Rp. " + this.harga);
    }

    // getter
    public String getDeskripsi(){
        return this.deskripsi;
    }

    // setter
    public void setStringDeskripsi(String value){
        this.deskripsi = value;
    }
}
