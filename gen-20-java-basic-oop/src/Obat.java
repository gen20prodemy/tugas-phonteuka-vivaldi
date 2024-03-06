public class Obat extends KategoriProduk{
/*
    public String nama;
    public String deskripsi;
    private String dosis;
    public double harga;

    public Obat(){
        this.nama = "Paracetamol";
        this.deskripsi = "Obat ini untuk meringankan rasa sakit";
        this.harga = 2200;
        this.dosis = "Oba ini belum mempunyai dosis";
    }

    void display(){
        System.out.println("Nama\t\t:\t" + this.nama);
        System.out.println("Deskripsi\t:\t" + this.deskripsi);
        System.out.println("Harga\t\t:\tRp. " + this.harga);
    }

    // getter
    public String getDosis(){
        return this.dosis;
    }

    // setter
    public void setDosis(String value){
        this.dosis = value;
    }

 */



    String dosis;

    //override
    void display(){
        System.out.println("Nama\t\t: " + this.nama);
        //System.out.println("Deskripsi\t: " + this.deskripsi);
        System.out.println("Dosis\t\t: " + this.dosis);
        System.out.println("Harga\t\t: Rp. " + super.harga);
    }

}
