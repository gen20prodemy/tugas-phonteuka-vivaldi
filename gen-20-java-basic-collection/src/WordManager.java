import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class WordManager {
    private ArrayList<String> words;

    // Konstruktor untuk WordManager
    public WordManager() {
        words = new ArrayList<>();
    }

    // Menambahkan kata ke ArrayList
    public void addWord(String word) {
        words.add(word);
    }

    // Mencari indeks suatu kata dalam ArrayList
    public int searchWord(String word) {
        return words.indexOf(word);
    }

    // Metode untuk mengambil kata dari ArrayList berdasarkan indeks
    public String getWord(int index) {
        if (index >= 0 && index < words.size()) {
            return words.get(index);
        } else {
            return "Indeks tidak valid";
        }
    }


    // Menghapus kata dari ArrayList
    public boolean deleteWord(String word) {
        return words.remove(word);
    }

    // Menampilkan jumlah kata dalam ArrayList
    public int countWords() {
        return words.size();
    }

    // Menampilkan isi ArrayList
    public void displayWords() {
        System.out.println("\nIsi ArrayList:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println(" ");
    }

    // Konversi ArrayList ke HashSet
    /*
    public void konversiArrListKeHashSet(){
        HashSet<String> hashSet = new HashSet<>(words);

        // Sekarang hashSet berisi elemen-elemen yang sama dengan arrayList
        System.out.println("HashSet: " + hashSet);
    }
     */

    // Metode untuk mengonversi ArrayList ke HashSet
    public HashSet<String> toHashSet() {
        return new HashSet<>(words);
    }

    // Metode untuk mengonversi HashSet ke HashMap
    public HashMap<Integer, String> toHashMap(HashSet<String> hashSet) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        int index = 0;
        for (String word : hashSet) {
            hashMap.put(index++, word);
        }
        return hashMap;
    }

}
