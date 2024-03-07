import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //-----Makanan
        System.out.println("=== Makanan ===");
        Makanan makanan1 = new Makanan();
        makanan1.display();

        //Read dengan getter deskripsi
        String awalDeskripsi = makanan1.getDeskripsi();
        System.out.println("Deskripsi\t: " + awalDeskripsi);

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

        // read only Getter setelah di Set
        String getDeskripsi = makanan1.getDeskripsi();
        System.out.println("Deskripsi\t: " + getDeskripsi);

        //-----Minuman
        System.out.println("\n===Minuman===");
        Minuman minuman1 = new Minuman();
        minuman1.display();

        //Read dengan getter deskripsi
        awalDeskripsi = minuman1.getDeskripsi();
        System.out.println("Deskripsi\t: " + awalDeskripsi);

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

        // read only Getter setelah di Set
        getDeskripsi = minuman1.getDeskripsi();
        System.out.println("Deskripsi\t: " + getDeskripsi);

        //-----Obat
        System.out.println("\n===Obat===");
        Obat obat1 = new Obat();
        obat1.display();

        //Read dengan getter deskripsi
        awalDeskripsi = obat1.getDeskripsi();
        System.out.println("Deskripsi\t: " + awalDeskripsi);

        System.out.println("\nMasukkan Deskripsi :");
        setDeskripsi = scn.nextLine();

        // write dengan SETTER
        obat1.setStringDeskripsi(setDeskripsi);

        //display final
        System.out.println("\nSetelah Add, Get dan Set :");
        obat1.nama = "Paracetamol";
        obat1.dosis = "Obat ini membantu menurunkan rasa sakit";
        obat1.display();

        // read only Getter setelah di Set
        getDeskripsi = obat1.getDeskripsi();
        System.out.println("Deskripsi\t: " + getDeskripsi);


        //Array Objek Produk (Polymorph)
        KategoriProduk[] kumpulanProduk = new KategoriProduk[3];
        kumpulanProduk[0] = makanan1;
        kumpulanProduk[1] = minuman1;
        kumpulanProduk[2] = obat1;

        //display array
        System.out.println("\nBerikut Array Objek Produk");
        kumpulanProduk[0].display();
        System.out.println(" ");
        kumpulanProduk[1].display();
        System.out.println(" ");
        kumpulanProduk[2].display();

    }
}