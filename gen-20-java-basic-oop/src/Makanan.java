public class Makanan extends KategoriProduk{
/*
    public String nama;
    public String deskripsi;
    private double harga;

    public Makanan(){
        this.nama = "Mie Instan";
        this.deskripsi = "Produk makanan kering yang dibuat dari tepung";
        this.harga = 0;
    }

    void display(){
        System.out.println("Nama\t\t:\t" + this.nama);
        System.out.println("Deskripsi\t:\t" + this.deskripsi);
        //System.out.println("Harga\t\t:\tRp. " + this.harga);
    }

    // getter
    public double getHarga(){
        return this.harga;
    }

    // setter
    public void setDoubleHarga(double value){
        this.harga = value;
    }

 */


   int berat;

    //override
    void display(){
        System.out.println("Nama\t\t: " + this.nama);
        //System.out.println("Deskripsi\t: " + this.deskripsi);
        System.out.println("Berat\t\t: " + this.berat + " gr");
        System.out.println("Harga\t\t: Rp. " + this.harga);
    }

}
