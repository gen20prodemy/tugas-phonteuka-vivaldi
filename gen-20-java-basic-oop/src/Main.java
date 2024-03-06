import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*
        Scanner scn = new Scanner(System.in);
        Makanan objectMakanan = new Makanan();
        Minuman objectMinuman = new Minuman();
        Obat objectObat = new Obat();

         */

        /*

        System.out.println("===Daftar Makanan===");
        System.out.println("Sebelum Get dan Set :");
        objectMakanan.display();

        double awalHarga = objectMakanan.getHarga();
        System.out.println("Harga\t\t:\tRp. " + awalHarga);

        System.out.print("\nMasukkan Harga: ");
        double setHarga = scn.nextDouble();

        // write dengan SETTER
        objectMakanan.setDoubleHarga(setHarga);

        System.out.println("\nSetelah Get dan Set :");
        objectMakanan.display();

        // read only (kita bisa menggunakan GETTER)
        double getHarga = objectMakanan.getHarga();
        System.out.println("Harga\t\t:\tRp. " + getHarga);



        System.out.println("\n===Daftar Minuman===");
        System.out.println("Sebelum Get dan Set :");
        objectMinuman.display();


        String awalDeskripsi = objectMinuman.getDeskripsi();
        System.out.println("Deskripsi\t:\t" + awalDeskripsi);

        System.out.print("\nMasukkan Deskripsi: ");
        //String setDeskripsi = scn.nextLine();

        Scanner scn1 = new Scanner(System.in);
        String setDeskripsi = scn1.nextLine();

        // write dengan SETTER
        objectMinuman.setStringDeskripsi(setDeskripsi);

        System.out.println("\nSetelah Get dan Set :");
        objectMinuman.display();

        // read only (kita bisa menggunakan GETTER)
        String getDeskripsi = objectMinuman.getDeskripsi();
        System.out.println("Deskripsi\t:\t" + getDeskripsi);




        System.out.println("\n===Daftar Obat===");
        System.out.println("Sebelum Get dan Set :");
        objectObat.display();


        String awalDosis = objectObat.getDosis();
        System.out.println("Dosis\t\t:\t" + awalDosis);

        System.out.print("\nMasukkan Dosis: ");
        //String setDeskripsi = scn.nextLine();

        //Scanner scn1 = new Scanner(System.in);
        String setDosis = scn1.nextLine();

        // write dengan SETTER
        objectObat.setDosis(setDosis);

        System.out.println("\nSetelah Get dan Set :");
        objectObat.display();

        // read only (kita bisa menggunakan GETTER)
        String getDosis = objectObat.getDosis();
        System.out.println("Deskripsi\t:\t" + getDosis);

        */

        Scanner scn = new Scanner(System.in);

        System.out.println("=== Makanan ===");
        Makanan makanan1 = new Makanan();
        makanan1.display();

        String awalDeskripsi = makanan1.getDeskripsi();
        System.out.println("Deskripsi\t: " + awalDeskripsi);

        System.out.println("\nMasukkan Deskripsi :");

        //Scanner scn1 = new Scanner(System.in);
        String setDeskripsi = scn.nextLine();

        // write dengan SETTER
        makanan1.setStringDeskripsi(setDeskripsi);

        System.out.println("\nSetelah Add, Get dan Set :");
        makanan1.nama = "Mie Instan";
        makanan1.harga = 3000;
        makanan1.berat = 85;
        makanan1.display();

        // read only (kita bisa menggunakan GETTER)
        String getDeskripsi = makanan1.getDeskripsi();
        System.out.println("Deskripsi\t: " + getDeskripsi);



        System.out.println("\n===Minuman===");
        Minuman minuman1 = new Minuman();

        minuman1.display();

        awalDeskripsi = minuman1.getDeskripsi();
        System.out.println("Deskripsi\t: " + awalDeskripsi);

        System.out.println("\nMasukkan Deskripsi :");

        //Scanner scn1 = new Scanner(System.in);
        setDeskripsi = scn.nextLine();

        // write dengan SETTER
        minuman1.setStringDeskripsi(setDeskripsi);

        System.out.println("\nSetelah Add, Get dan Set :");
        minuman1.nama = "Air Mineral";
        minuman1.harga = 4500;
        minuman1.ukuran = 600;
        minuman1.display();

        // read only (kita bisa menggunakan GETTER)
        getDeskripsi = minuman1.getDeskripsi();
        System.out.println("Deskripsi\t: " + getDeskripsi);





        System.out.println("\n===Obat===");
        Obat obat1 = new Obat();

        obat1.display();

        awalDeskripsi = obat1.getDeskripsi();
        System.out.println("Deskripsi\t: " + awalDeskripsi);

        System.out.println("\nMasukkan Deskripsi :");

        //Scanner scn1 = new Scanner(System.in);
        setDeskripsi = scn.nextLine();

        // write dengan SETTER
        obat1.setStringDeskripsi(setDeskripsi);

        System.out.println("\nSetelah Add, Get dan Set :");
        obat1.nama = "Paracetamol";
        obat1.dosis = "Obat ini membantu menurunkan rasa sakit";
        obat1.display();

        // read only (kita bisa menggunakan GETTER)
        getDeskripsi = obat1.getDeskripsi();
        System.out.println("Deskripsi\t: " + getDeskripsi);


        //Array Objek Produk
        KategoriProduk[] kumpulanProduk = new KategoriProduk[3];
        kumpulanProduk[0] = makanan1;
        kumpulanProduk[1] = minuman1;
        kumpulanProduk[2] = obat1;

        System.out.println("\nBerikut Array Objek Produk");
        kumpulanProduk[0].display();
        System.out.println(" ");
        kumpulanProduk[1].display();
        System.out.println(" ");
        kumpulanProduk[2].display();




        /*
        System.out.println("\nSetelah Get dan Set:");
        makanan1.nama = "Mie Instan";
        makanan1.deskripsi = "Produk ini terbuat dari tepung";
        makanan1.harga = 3000;
        makanan1.berat = 85;

        makanan1.display();

        System.out.println("\n===Minuman===");
        Minuman minuman1 = new Minuman();
        minuman1.nama = "Air Mineral";
        minuman1.deskripsi = "Produk ini terbuat dari air pegunungan";
        minuman1.harga = 4500;
        minuman1.ukuran = 600;

        minuman1.display();

         */

    }
}