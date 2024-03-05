import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //inisialisasi input
        byte sign = 0;  //tanda input 0

        //lakukan meminta input user untuuk pilih menu selama input bukan 0
        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1. Write File");
            System.out.println("2. Read File");
            System.out.println("3. Menu Arrays");
            System.out.println("0. Keluar");

            System.out.print("\nPilih Menu: ");
            int pilih = scanner.nextInt();

            //kondisi pilihan menu dari input user, lalu jalankan fungsi methodnya
            if(pilih==1)
                createFile.buatFile();
            else if (pilih==2)
                readFile.bacaFile();
            else if (pilih == 3)
                arrayBilangan.printArray();
            else if (pilih==0)
                sign++;
        }while(sign ==0);

        System.out.print("\n===Terima Kasih===");
    }
}