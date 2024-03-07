public class Obat extends KategoriProduk{
    //atribut obat
    String dosis;

    //override
    void display(){
        System.out.println("Nama\t\t: " + this.nama);
        //System.out.println("Deskripsi\t: " + this.deskripsi);
        System.out.println("Dosis\t\t: " + this.dosis);
        System.out.println("Harga\t\t: Rp. " + super.harga);
    }

}
