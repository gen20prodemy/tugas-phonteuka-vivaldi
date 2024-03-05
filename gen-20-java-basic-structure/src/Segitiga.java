//library
import java.util.Scanner;

//class java
public class Segitiga {
    //method java
    public static void printSegitiga() {

        System.out.println("\n===Segitiga===");
        //input user berisi integer ketinggian segitiga
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka ketinggian segitiga: ");
        int angka = scanner.nextInt();

        //looping sebanyak input untuk print baris baru
        for(int i = 1; i <= angka; i++){
            //looping sebanyak input dimana mengeluarkan output * untuk membuat segitiga
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");     //print baris baru
        }
    }
}
