import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //-----Makanan
        System.out.println("=== Makanan ===");
        Makanan makanan1 = new Makanan();
        makanan1.display();

        System.out.println("\nMasukkan Deskripsi :");
        String setDeskripsi = scn.nextLine();

        //write dengan SETTER
        makanan1.setStringDeskripsi(setDeskripsi);

        //display final
        System.out.println("\nSetelah Add, Get dan Set :");
        makanan1.nama = "Mie Instan";
        makanan1.harga = 3000;
        makanan1.berat = 85;
        makanan1.display();

        //-----Minuman
        System.out.println("\n===Minuman===");
        Minuman minuman1 = new Minuman();
        minuman1.display();

        System.out.println("\nMasukkan Deskripsi :");
        setDeskripsi = scn.nextLine();

        // write dengan SETTER
        minuman1.setStringDeskripsi(setDeskripsi);

        //display final
        System.out.println("\nSetelah Add, Get dan Set :");
        minuman1.nama = "Air Mineral";
        minuman1.harga = 4500;
        minuman1.ukuran = 600;
        minuman1.display();

        //-----Obat
        System.out.println("\n===Obat===");
        Obat obat1 = new Obat();
        obat1.display();

        System.out.println("\nMasukkan Deskripsi :");
        setDeskripsi = scn.nextLine();

        // write dengan SETTER
        obat1.setStringDeskripsi(setDeskripsi);

        //display final
        System.out.println("\nSetelah Add, Get dan Set :");
        obat1.nama = "Paracetamol";
        obat1.dosis = "Sehari 3x setelah makan";
        obat1.display();


        //Polymortph
        System.out.println("\nPolymorph Obat");
        KategoriProduk obat2 = new Obat();      //obat2 tipe datanya KategoriProduk, objeknya Obat
        obat2.display();

        System.out.println("\nMasukkan Deskripsi :");
        setDeskripsi = scn.nextLine();

        // write dengan SETTER
        obat2.setStringDeskripsi(setDeskripsi);

        //display final
        System.out.println("\nSetelah Add, Get dan Set :");
        obat2.nama = "Amoxicillin";
        obat2.harga = 2500;

        ((Obat) obat2).dosis = "Sehari sekali sebelum tidur" ; // Cast objek obat2 menjadi Obat agar bisa mengakses atribut dosis
        //System.out.println("\nDosis\t\t: " + ((Obat) obat2).dosis);

        obat2.display();

        //Print Polymorph
        //Array Objek Produk (Polymorph)
        KategoriProduk[] kumpulanProduk = new KategoriProduk[4];
        kumpulanProduk[0] = makanan1;
        kumpulanProduk[1] = minuman1;
        kumpulanProduk[2] = obat1;
        kumpulanProduk[3] = obat2;

        //display array
        System.out.println("\n===Berikut Array Objek Produk Polymorph===");
        kumpulanProduk[0].display();
        System.out.println(" ");
        kumpulanProduk[1].display();
        System.out.println(" ");
        kumpulanProduk[2].display();
        System.out.println(" ");
        kumpulanProduk[3].display();

    }
}