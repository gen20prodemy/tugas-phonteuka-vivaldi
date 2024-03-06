import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordManager wordManager = new WordManager();

        // Meminta pengguna untuk memasukkan beberapa kata
        System.out.println("Masukkan beberapa kata (masukkan 'selesai' untuk mengakhiri):");

        String input = scanner.nextLine();
        // Memasukkan kata-kata ke dalam ArrayList hingga pengguna memasukkan "selesai"
        while (!input.equals("selesai")) {
            wordManager.addWord(input);
            input = scanner.nextLine();
        }

        // Menampilkan jumlah kata yang dimasukkan
        System.out.println("Jumlah kata yang dimasukkan: " + wordManager.countWords());

        // Menampilkan isi ArrayList
        wordManager.displayWords();

        // Mencari indeks suatu kata dalam ArrayList
        System.out.println("\nMasukkan kata yang ingin dicari:");
        String searchWord = scanner.nextLine();
        int index = wordManager.searchWord(searchWord);
        if (index != -1) {
            System.out.println("Kata '" + searchWord + "' ditemukan pada indeks " + index);
        } else {
            System.out.println("Kata '" + searchWord + "' tidak ditemukan dalam ArrayList");
        }

        // Meminta pengguna untuk memasukkan indeks yang ingin diambil kata-nya
        System.out.println("\nMasukkan indeks kata yang ingin Anda ambil:");
        int indexToRetrieve = scanner.nextInt();
        scanner.nextLine(); // Membuang newline
        String wordAtIndex = wordManager.getWord(indexToRetrieve);
        System.out.println("Kata pada indeks " + indexToRetrieve + " adalah: " + wordAtIndex);


        // Menghapus kata dari ArrayList
        System.out.println("\nMasukkan kata yang ingin dihapus:");
        String removeWord = scanner.nextLine();
        if (wordManager.deleteWord(removeWord)) {
            System.out.println("Kata '" + removeWord + "' berhasil dihapus dari ArrayList");
        } else {
            System.out.println("Kata '" + removeWord + "' tidak ditemukan dalam ArrayList");
        }

        wordManager.displayWords();

        scanner.close();

        System.out.println("\nKonversi ke Hashmap");
        HashSet<String> hashSet = wordManager.toHashSet();

        System.out.println("\nIsi HashSet:");
        for (String word : hashSet) {
            System.out.println(word);
        }

        // Mengonversi HashSet ke HashMap
        HashMap<Integer, String> hashMap = wordManager.toHashMap(hashSet);

        // Menampilkan isi HashMap
        System.out.println("\nIsi HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " -> " + hashMap.get(key));
        }

    }
}
