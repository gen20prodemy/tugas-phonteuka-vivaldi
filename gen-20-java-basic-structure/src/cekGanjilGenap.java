//library
import java.util.Scanner;

//class java
public class cekGanjilGenap {
    //method java
    public static void cekBilangan(){

        System.out.println("\n===Cek Bilangan===");
        //input user untuk number1 dan number2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int num1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();

        //proses penjumlahan kedua number
        int hasil = num1 + num2 + 1;

        //output number1 dan number2 beserta rumus pengerjaannya
        System.out.println("\nrumus: " + num1 + " + " + num2 + " + 1 = " + hasil);

        //kondisi hasil number ganjil atau genap beserta outputnya
        if(hasil %2 == 0){
            System.out.println("Angka tersebut Genap");
        }else{
            System.out.println("Angka tersebut Ganjil");
        }
    }
}
