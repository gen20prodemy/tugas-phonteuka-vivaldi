public class Minuman extends KategoriProduk{
    //atribut minuman
    int ukuran;

    //override
    void display(){
        System.out.println("Nama\t\t: " + this.nama);
        //System.out.println("Deskripsi\t: " + this.deskripsi);
        System.out.println("Ukuran\t\t: " + this.ukuran + " ml");
        System.out.println("Harga\t\t: Rp. " + this.harga);
    }
}
