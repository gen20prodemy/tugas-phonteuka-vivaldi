import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CekUsia{
        Scanner scn = new Scanner(System.in);

        //===Exception Block, dengan input array dan print array sesuai index===
        System.out.println("===Exception Block===");
        System.out.println("Print Arrays\n");

        System.out.print("masukkan panjang array: ");
        int num = scn.nextInt();

        String[] arrays = new String[num];
        int i=0, nomor =1;

        //input isi array
        for(i=0; i<num; i++){
            System.out.print("Masukkan value ke " + nomor + ": ");
            arrays[i] = scn.next();
            nomor++;
        }

        //input indeks array yang ingin ditampilkan
        System.out.print("masukkan indeks arrays yang ingin ditampilkan: ");
        int index1 = scn.nextInt();

        //method print arrays
        printArrays(arrays, index1);

        //===Costum Exception, output dari catch costum===
        System.out.println("\n===Costum Exception===");
        System.out.print("Masukkan dua angka untuk dibagi: ");
        int angka1 = scn.nextInt();
        int angka2 = scn.nextInt();

        //method pembagian
        System.out.println("Hasil pembagiannya adalah : " + pembagian(angka1, angka2));

        //===Throw Exception, menggunakan method yang memanggil class exception ===
        System.out.println("\n===Throw Exception===");
        System.out.print("Masukkan Usia: ");
        int usia = scn.nextInt();

        //metchod memanggil calss exception
        validasiUmur(usia);

        System.out.println("\nAkhir dari program");
    }

    //method print arrays
    private static void printArrays(String[] arrays, int index1){

        //kondisi jika input indeks user tidak sesuai dengan arrays
        try {
            System.out.printf("value pada indeks %d adalah %s\n", index1, arrays[index1-1]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        } finally {
            System.out.println("Finally print arrays");
        }
    }

    //method cek usia
    private static void validasiUmur(int age) throws CekUsia{
        //kondisi jika usia tidak valid
        if(age < 0){
            throw new CekUsia();    //memanggil class exception
        }else{
            System.out.printf("Usia anda: %d tahun.\n", age);
        }
    }

    //method pembagian dua angka
    private static int pembagian(int angka1, int angka2){
        int hasil=0;

        //kondisi jika input user tidak valid (0)
        try{
             hasil = angka1 / angka2;
        } catch (Exception e){
            System.err.println("Waduh, gabisa dibagi 0");
        } finally {
            System.out.println("Finally Costum Exception");
        }

        return hasil;
    }

}