//library
import java.util.Scanner;

//class java
public class Kalkulator {
    //method java
    public static void kalkulator(){

        System.out.println("\n===Aritmatika Sederhana===");
        //input user untuk number1 dan number2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int num1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();

        //proses perhitungan aritmatika
        int jumlah = num1 + num2;
        int kurang = num1 - num2;
        int kali = num1 * num2;
        float bagi = (float)num1 / (float)num2;     //float untuk bilangan pecahan

        //output aritmatika dari proses kedua bilangan
        System.out.println("\nHasil pemjumlahan: " + jumlah + "\nHasil pengurangan: " + kurang + "\nHasil perkalian: " + kali + "\nHasil pembagian: " + bagi);
    }
}
