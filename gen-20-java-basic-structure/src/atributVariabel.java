//library
import java.util.Scanner;

//class java
public class atributVariabel {
    //method java
    public static void printVariabel(){

        //input user untuk nama dan usia (String dan integer)
        System.out.println("\n===Atribut Variabel===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Usia: ");
        int usia = scanner.nextInt();

        //output string dan integer
        System.out.println("Nama Anda " + nama + ", usia anda " + usia + " tahun.");
    }
}
