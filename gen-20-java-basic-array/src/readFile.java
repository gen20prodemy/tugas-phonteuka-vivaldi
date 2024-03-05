import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

public class readFile {
    //method read file, method ini membaca isi file output.txt
    public static void bacaFile(){
        System.out.println("\nProses ini akan menampilkan isi dari file output.txt");

        //membaca file output.txt
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            System.out.println(reader.readLine());  //membaca seluruh baris dalam file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
