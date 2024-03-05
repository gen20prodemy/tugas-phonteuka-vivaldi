import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;

public class createFile {
    //method create file, method ini membuat file output.txt berisi input user
    public static void buatFile(){
        //input user
        System.out.println("\nMasukkan String:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //membuat file output.txt
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            writer.write(str);		//print to file output.txt
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
