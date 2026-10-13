import java.util.LinkedList;

public class Tugas1StrukturData {
    public static void main(String[] args) {
        // =========================================================================
        // DATA MAHASISWA:
        // NIM           : 054911593
        // 2 Digit Awal  : 05 -> 5 (integer) / "05" (string)
        // 2 Digit Akhir : 93
        // =========================================================================

        // -------------------------------------------------------------------------
        // Soal 1 (15 Poin):
        // Deklarasi variabel dengan tipe data integer yang bernama 'StrukturBaris'
        // -------------------------------------------------------------------------
        int StrukturBaris = 10;
        System.out.println("=== 1. Deklarasi Variabel Integer ===");
        System.out.println("Variabel StrukturBaris: " + StrukturBaris);
        System.out.println();

        // -------------------------------------------------------------------------
        // Soal 2 (15 Poin):
        // Deklarasi variabel dengan tipe data string yang bernama 'KataBaru'
        // yang berisi kata 'Nama Awal Anda'
        // (Silakan ganti "NamaAwal" dengan nama depan asli Anda)
        // -------------------------------------------------------------------------
        String KataBaru = "NamaAwal"; 
        System.out.println("=== 2. Deklarasi Variabel String ===");
        System.out.println("Variabel KataBaru: " + KataBaru);
        System.out.println();

        // -------------------------------------------------------------------------
        // Soal 3 (15 Poin):
        // Pendeklarasian array satu dimensi dengan nama 'empatAngka', tipe data integer,
        // yang berisi angka (2 Digit Nim Awal Anda, 10, 20, 2 Digit Nim Akhir Anda)
        // NIM: 054911593 -> Awal: 5 (atau 05), Akhir: 93
        // -------------------------------------------------------------------------
        int[] empatAngka = { 5, 10, 20, 93 };
        System.out.println("=== 3. Array 1 Dimensi (empatAngka) ===");
        System.out.print("Isi array empatAngka: ");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.print(empatAngka[i] + (i < empatAngka.length - 1 ? ", " : ""));
        }
        System.out.println("\n");

        // -------------------------------------------------------------------------
        // Soal 4 (20 Poin):
        // Pendeklarasian array dua dimensi dengan nama 'Angka', tipe data String,
        // yang terdiri dari tiga baris dan tiga kolom, isi baris dan kolom berisi:
        // (2 Digit Nim Awal Anda, 3, 5, 14, 19, 20, 22, 27, 2 Digit Nim Akhir Anda)
        // -------------------------------------------------------------------------
        String[][] Angka = {
            { "05", "3", "5" },
            { "14", "19", "20" },
            { "22", "27", "93" }
        };

        System.out.println("=== 4. Array 2 Dimensi (Angka) [3x3] ===");
        for (int baris = 0; baris < Angka.length; baris++) {
            for (int kolom = 0; kolom < Angka[baris].length; kolom++) {
                System.out.print(Angka[baris][kolom] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // -------------------------------------------------------------------------
        // Soal 5 (20 Poin):
        // Deklarasi linked list dengan nama 'listAngka' yang memiliki list:
        // (2 Digit Nim Awal Anda, 19, 44, 60, 2 Digit Nim Akhir Anda)
        // -------------------------------------------------------------------------
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(5);
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(93);

        System.out.println("=== 5. Linked List (listAngka) ===");
        System.out.println("Isi LinkedList listAngka: " + listAngka);
    }
}
