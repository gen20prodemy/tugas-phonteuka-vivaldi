public class Minuman extends KategoriProduk{
    //atribut minuman
    int ukuran;

    //override
    void display(){
        super.display();
        System.out.println("Ukuran\t\t: " + this.ukuran + " ml");
    }
}
