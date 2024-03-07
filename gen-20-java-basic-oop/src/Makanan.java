public class Makanan extends KategoriProduk{
    //atribut makanan
   int berat;

    //override
    void display(){
        System.out.println("Nama\t\t: " + this.nama);
        //System.out.println("Deskripsi\t: " + this.deskripsi);
        System.out.println("Berat\t\t: " + this.berat + " gr");
        System.out.println("Harga\t\t: Rp. " + this.harga);
    }

}
