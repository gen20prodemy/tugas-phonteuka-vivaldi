public class Obat extends KategoriProduk{
    //atribut obat
    public String dosis;

    //override
    void display(){
        super.display();
        System.out.println("Dosis\t\t: " + this.dosis);
    }

}
