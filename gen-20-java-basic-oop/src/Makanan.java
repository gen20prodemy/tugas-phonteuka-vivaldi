public class Makanan extends KategoriProduk{
    //atribut makanan
   int berat;

    //override
    void display(){
        super.display();
        System.out.println("Berat\t\t: " + this.berat + " gr");
    }

}
