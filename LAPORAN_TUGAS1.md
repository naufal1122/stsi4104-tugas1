# LAPORAN TUGAS PRAKTIK 1 - STRUKTUR DATA (STSI4104)

**Mata Kuliah** : Struktur Data (STSI4104)  
**Program Studi**: Sistem Informasi  
**Nama**        : [Nama Lengkap Anda]  
**NIM**         : 054911593  
**Link Video**  : [Tempelkan Link Youtube / Google Drive di sini]  

---

### Data Acuan Mahasiswa:
- **NIM**: `054911593`
- **2 Digit NIM Awal**: `05` (atau angka `5`)
- **2 Digit NIM Akhir**: `93`

---

## A. Source Code Program (`Tugas1StrukturData.java`)

```java
import java.util.LinkedList;

public class Tugas1StrukturData {
    public static void main(String[] args) {
        // =========================================================================
        // DATA MAHASISWA:
        // NIM           : 054911593
        // 2 Digit Awal  : 05 -> 5 (integer) / "05" (string)
        // 2 Digit Akhir : 93
        // =========================================================================

        // 1. Deklarasi variabel integer 'StrukturBaris' (15 Poin)
        int StrukturBaris = 10;
        System.out.println("=== 1. Deklarasi Variabel Integer ===");
        System.out.println("Variabel StrukturBaris: " + StrukturBaris);
        System.out.println();

        // 2. Deklarasi variabel String 'KataBaru' (15 Poin)
        String KataBaru = "NamaAwal"; // Ganti dengan nama depan Anda
        System.out.println("=== 2. Deklarasi Variabel String ===");
        System.out.println("Variabel KataBaru: " + KataBaru);
        System.out.println();

        // 3. Array 1 Dimensi 'empatAngka' bertipe integer (15 Poin)
        // Isi: (2 Digit Nim Awal Anda = 5, 10, 20, 2 Digit Nim Akhir Anda = 93)
        int[] empatAngka = { 5, 10, 20, 93 };
        System.out.println("=== 3. Array 1 Dimensi (empatAngka) ===");
        System.out.print("Isi array empatAngka: ");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.print(empatAngka[i] + (i < empatAngka.length - 1 ? ", " : ""));
        }
        System.out.println("\n");

        // 4. Array 2 Dimensi 'Angka' tipe String ukuran 3x3 (20 Poin)
        // Baris 1: "05", "3", "5"
        // Baris 2: "14", "19", "20"
        // Baris 3: "22", "27", "93"
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

        // 5. LinkedList 'listAngka' (20 Poin)
        // Isi: (5, 19, 44, 60, 93)
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
```

---

## B. Hasil Output Program

```text
=== 1. Deklarasi Variabel Integer ===
Variabel StrukturBaris: 10

=== 2. Deklarasi Variabel String ===
Variabel KataBaru: NamaAwal

=== 3. Array 1 Dimensi (empatAngka) ===
Isi array empatAngka: 5, 10, 20, 93

=== 4. Array 2 Dimensi (Angka) [3x3] ===
05	3	5	
14	19	20	
22	27	93	

=== 5. Linked List (listAngka) ===
Isi LinkedList listAngka: [5, 19, 44, 60, 93]
```
