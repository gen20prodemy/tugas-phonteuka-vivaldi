//library
import java.util.Scanner;

//class java
public class deretAritmatika {
    //method java
    public static int aritmatika(int angka){

        int hasil = 0;      //menampung hasil aritmatika
        System.out.print("Deret: ");

        //perulagan deret aritmatika dengan batasan input
        for(int i = 1; i <= angka; i++){
            hasil = hasil + i;      //penambahan hasil
            //kondisi print jika akhir iterasi atau bukan
            if(i < angka) {
                System.out.print(i + " + ");
            }else{
                System.out.print(i);
            }
        }
        System.out.println(" = " + hasil);  //output

        return hasil;   //return value hasil
    }
}
