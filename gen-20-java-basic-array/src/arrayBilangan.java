import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class arrayBilangan {
    //method program basic Arrays
    public static void printArray(){
        Scanner scanner = new Scanner(System.in);   //inisialisasi input
        byte sign = 0;  //tanda input

        //lakukan permintaan input user untuk pemilihan menu arrays selama input bukan 0
        do{
            System.out.println("\n===MENU ARRAY===");
            System.out.println("1. Print Array");
            System.out.println("2. Jumlah Value Array");
            System.out.println("3. Jumlah Value Array Multi Dimensi");
            System.out.println("4. Membalik Susunan Array");
            System.out.println("0. Keluar");

            System.out.print("\nPilih Menu Array: ");
            int pilih = scanner.nextInt();  //input user

            //kondisi pilihan menu user, lalu jalankan methodnya
            if(pilih==1)
                print();
            else if (pilih==2) {
                System.out.print("\nMasukkan jumlah array yang ingin dijumlahkan value nya: ");
                int n = scanner.nextInt();      //input jumlah isi array
                int hasil = jumlahArray(n);
                System.out.println("\nBerikut hasil penjumlahan arraynya: " + hasil);
            } else if (pilih == 3) {
                System.out.print("\nMasukkan jumlah multi array yang ingin dijumlahkan\nvalue nya kedalam array: ");
                int n = scanner.nextInt();      //input jumlah multi array
                System.out.print("Masukkan jumlah arraynya: ");
                int m = scanner.nextInt();      //input jumlah isi array pada setiap multi array
                jumlahMultiArray(n, m);
            } else if (pilih == 4) {
                printTerbalik();
            } else if (pilih==0)
                sign++;
        }while(sign ==0);
    }

    //method print isi array dari input user
    private static void print() {
        Scanner scanner = new Scanner(System.in);
        //input user
        System.out.print("\nMasukkan jumlah array: ");
        int n = scanner.nextInt();
        System.out.print("\n");

        int[] numbers = new int[n];     //membuat array sepanjang input user
        int nomor = 1;                  //indeks array

        //perulangan input user kedalam isi array
        for(int i=0; i<n; i++){
            System.out.print("Masukkan value array ke " + nomor + ": ");
            numbers[i] = scanner.nextInt();
            nomor++;
        }

        //perulangan untuk print isi array
        System.out.println("\nBerikut value arraynya:");
        for(int i=0; i<n; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }

    //method menampilkan jumlah isi array
    private static int jumlahArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[n];         //membuat array sepanjang input user
        System.out.println(" ");

        byte nomor = 1;                     //indeks menampilkan array
        //perulangan input user kedalam isi array
        for(int i=0; i<n; i++){
            System.out.print("Masukkan value array ke " + nomor + ": ");
            numbers[i] = scanner.nextInt();
            nomor++;
        }

        //penjumlahan isi array kedalam hasil
        int hasil = 0;
        for(int i=0; i<n; i++){
            hasil = hasil + numbers[i];
        }
        return hasil;
    }

    //method menampilkan jumlah isi multi dimensional array
    private static void jumlahMultiArray(int n, int m) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[n][m];        //inisialisasi panjang array dari input user

        byte baris = 1, kolom = 0;              //iterasi pemasukkan input user kedalam multi dimensional array
        int i=0, j=0;
        System.out.println(" ");

        //perulangan pemasukkan input user kedalam multi dimensional array
        for(i=0; i<n; i++){
            kolom = 0;
            for(j=0; j<m; j++) {
                kolom++;
                System.out.print("Masukkan value array " + baris + " ke " + kolom + ": ");
                numbers[i][j] = scanner.nextInt();
            }
            baris++;
            System.out.println(" ");
        }

        //perulangan menampilkan array multidimensionalnya
        System.out.println("\nBerikut Array Multidimensinya:");
        int nomor = 1;
        for(j=0; j<n; j++) {
            System.out.print("Array " + nomor + ": ");
            for(i=0; i<m; i++){
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println(" ");
            nomor++;
        }

        int[] hasil = new int[n];       //array hasil penjumlahan dari multi dimensional array
        int temp = 0;

        //perulangan menjumlahkan isi array pada multi dimensional array kedalam array hasil
        for(j=0; j<n; j++) {
            for(i=0; i<m; i++){
                temp = temp + numbers[j][i];
                //System.out.println("hasil array " + temp);
            }
            hasil[j] = temp;
            temp = 0;
        }

        System.out.println("\nBerikut hasil penjumlahan array mulidimensinya:");
        System.out.print("Array Hasil: ");

        //perulangan print array jumlah dari multidimensinal array
        byte tanda = 1;         //tanda kondisi output
        for(j=0; j<n; j++) {
            //kondisi output jika posisi array bukan atau akhir
            if(tanda < n){
                System.out.print(hasil[j] + ", ");
                tanda++;
            }else{
                System.out.print(hasil[j]);
            }
        }

        System.out.print("\n");
    }

    //method print array secara terbalik
    private static void printTerbalik() {
        Scanner scanner = new Scanner(System.in);
        //input user
        System.out.print("\nMasukkan jumlah array: ");
        int n = scanner.nextInt();
        System.out.print("\n");

        int[] numbers = new int[n];     //membuat array sepanjang input user

        //perulangan input user kedalam array
        int nomor = 1;
        for(int i=0; i<n; i++){
            System.out.print("Masukkan value array ke " + nomor + ": ");
            numbers[i] = scanner.nextInt();
            nomor++;
        }

        //output print terbalik
        System.out.println("\nBerikut value arraynya:");
        for(int i=n-1; i>=0; i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }











}

