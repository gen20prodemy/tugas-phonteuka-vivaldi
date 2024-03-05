import java.util.Scanner;

//class java
public class Main {
    //method java
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        byte sign = 0;

        do {
            System.out.println("Silahkan pilih menu program:");
            System.out.println("1. Print Variabel");
            System.out.println("2. Kalkulator");
            System.out.println("3. Segitiga");
            System.out.println("4. Cek Ganjil Genap");
            System.out.println("5. Bilangan Bulat Positif");
            System.out.println("6. Deret Aritmatika");
            System.out.println("0. Keluar");

            System.out.print("Masukkan Menu: ");
            int pilih = scanner.nextInt();

            //menjalankan method sesuai input user dalam menu
            if(pilih == 1){
                atributVariabel.printVariabel();
            }else if(pilih == 2){
                Kalkulator.kalkulator();
            }else if(pilih == 3){
                Segitiga.printSegitiga();
            }else if(pilih == 4){
                cekGanjilGenap.cekBilangan();
            }else if(pilih == 5){
                bilanganBulatPositif.bulatPositif();
            }else if(pilih == 6){

                //input user untuk batas deret aritmatika
                System.out.println("\n===Deret Aritmatika===");
                System.out.print("Masukkan Angka: ");
                int angka = scanner.nextInt();

                deretAritmatika.aritmatika(angka);
            }else if (pilih == 0) {
                sign++;
            }
            System.out.println(" ");

        }while(sign == 0);      //jika user input 0, maka program berakhir

    }
}