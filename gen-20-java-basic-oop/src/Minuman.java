public class Minuman extends KategoriProduk{
/*
    public String nama;
    private String deskripsi;
    public double harga;

    public Minuman(){
        this.nama = "Air Mineral";
        this.deskripsi = "Belum ada deskripsi";
        this.harga = 5000;
    }

    void display(){
        System.out.println("Nama\t\t:\t" + this.nama);
        //System.out.println("Deskripsi\t:\t" + this.deskripsi);
        System.out.println("Harga\t\t:\tRp. " + this.harga);
    }

    // getter
    public String getDeskripsi(){
        return this.deskripsi;
    }

    // setter
    public void setStringDeskripsi(String value){
        this.deskripsi = value;
    }

 */


    int ukuran;

    //override
    void display(){
        System.out.println("Nama\t\t: " + this.nama);
        //System.out.println("Deskripsi\t: " + this.deskripsi);
        System.out.println("Ukuran\t\t: " + this.ukuran + " ml");
        System.out.println("Harga\t\t: Rp. " + this.harga);
    }
}
