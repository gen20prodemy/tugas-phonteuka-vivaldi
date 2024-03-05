//library
import java.util.Scanner;

//class java
public class bilanganBulatPositif {
    //method java
    public static void bulatPositif(){

        //input user untuk batas bilangan bulat positif
        System.out.println("\n===         Cek Bilangan Bulat Positif       ===");
        System.out.println("=== habis dibagi 3 tapi tidak hais dibagi 2  ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = scanner.nextInt();

        //fungsi jika input adalah batas maksimum pencarian
        /*
        boolean sign = false;
        for(int i=1; i <= angka; i++){
            if(i %3 == 0 && i %2 != 0 && !sign){
                System.out.println("Angka yang didapat: " + i);
                sign = !sign;
            }
        }
         */

        int j=1;        //iterasi
        int batas = 0;  //batas pencarian angka

        //lakukan pencarian sealama belum mencapai batas input user
        do{
            //pencarian angka habis dibagi 3 tapi tidak habis dibagi 2
            if(j %3 == 0 && j %2 != 0){
                System.out.println("Angka yang didapat: " + j);
                batas ++;
            }
            j++;
        }while (angka - batas != 0);    //akan terus mencari angka jika total angka yang didapat belum mencapai input
    }
}
