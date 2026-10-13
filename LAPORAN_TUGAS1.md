# LAPORAN TUGAS PRAKTIK 1
## MATA KULIAH: STRUKTUR DATA (STSI4104)

**Identitas Mahasiswa:**
* **Nama** : Naufal Dewantoro *(Sesuaikan jika perlu)*
* **NIM** : 054911593
* **Program Studi** : Sistem Informasi
* **UPBJJ-UT** : Universitas Terbuka

---

### A. Pendahuluan & Data Acuan Soal
Berdasarkan ketentuan tugas praktik 1:
* **NIM**: `054911593`
* **2 Digit Awal NIM**: `05` (atau angka `5`)
* **2 Digit Akhir NIM**: `93`
* **Nama Awal**: Naufal

---

### B. Program

Berikut adalah source code program lengkap Java (`Tugas1StrukturData.java`):

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

        // 1. Deklarasi variabel integer yang bernama 'StrukturBaris' (15 Poin)
        int StrukturBaris = 10;
        System.out.println("=== 1. Deklarasi Variabel Integer ===");
        System.out.println("Variabel StrukturBaris: " + StrukturBaris);
        System.out.println();

        // 2. Deklarasi variabel string yang bernama 'KataBaru' berisi nama awal (15 Poin)
        String KataBaru = "Naufal"; 
        System.out.println("=== 2. Deklarasi Variabel String ===");
        System.out.println("Variabel KataBaru: " + KataBaru);
        System.out.println();

        // 3. Array satu dimensi bertipe integer bernama 'empatAngka' (15 Poin)
        // Isi: (2 Digit Nim Awal Anda, 10, 20, 2 Digit Nim Akhir Anda) -> { 5, 10, 20, 93 }
        int[] empatAngka = { 5, 10, 20, 93 };
        System.out.println("=== 3. Array 1 Dimensi (empatAngka) ===");
        System.out.print("Isi array empatAngka: ");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.print(empatAngka[i] + (i < empatAngka.length - 1 ? ", " : ""));
        }
        System.out.println("\n");

        // 4. Array dua dimensi tipe String bernama 'Angka' [3 baris x 3 kolom] (20 Poin)
        // Isi: (2 Digit Nim Awal Anda, 3, 5, 14, 19, 20, 22, 27, 2 Digit Nim Akhir Anda)
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

        // 5. Linked list bernama 'listAngka' (20 Poin)
        // Isi: (2 Digit Nim Awal Anda, 19, 44, 60, 2 Digit Nim Akhir Anda) -> [5, 19, 44, 60, 93]
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

### C. Penjelasan Program

1. **Variabel `StrukturBaris` (Tipe Data Integer)**:
   - Baris `int StrukturBaris = 10;` mendeklarasikan variabel bertipe data primitif `int` dengan nama `StrukturBaris`.
   - Tipe data integer digunakan untuk menampung nilai bilangan bulat (tanpa pecahan/desimal). Di sini variabel diinisialisasi dengan nilai `10`.

2. **Variabel `KataBaru` (Tipe Data String)**:
   - Baris `String KataBaru = "Naufal";` mendeklarasikan variabel bertipe objek/referensi `String` bernama `KataBaru`.
   - String digunakan untuk menyimpan deretan karakter/teks yang diapit tanda kutip ganda (`""`). Nilai yang diisikan adalah nama awal mahasiswa (`"Naufal"`).

3. **Array 1 Dimensi `empatAngka` (Tipe Data Integer)**:
   - Baris `int[] empatAngka = { 5, 10, 20, 93 };` mendeklarasikan array 1 dimensi berukuran 4 elemen bertipe data integer.
   - Array merupakan struktur data linier statis berurutan dengan alokasi memori berdekatan. Nilai di dalamnya diisi sesuai soal: 2 digit NIM awal (`5`), `10`, `20`, dan 2 digit NIM akhir (`93`). Elemen diakses menggunakan indeks mulai dari 0 (`empatAngka[0]` sampai `empatAngka[3]`).

4. **Array 2 Dimensi `Angka` (Tipe Data String)**:
   - Baris `String[][] Angka = { ... };` mendeklarasikan array dua dimensi bertipe `String` yang terdiri atas 3 baris dan 3 kolom (matriks 3x3).
   - Array 2D menyimpan elemen dalam format baris dan kolom:
     * Baris ke-0: `"05"`, `"3"`, `"5"`
     * Baris ke-1: `"14"`, `"19"`, `"20"`
     * Baris ke-2: `"22"`, `"27"`, `"93"`
   - Untuk mencetak seluruh isi tabel matriks, digunakan perulangan bersarang (*nested loop* for) untuk menelusuri setiap baris dan kolom.

5. **Linked List `listAngka`**:
   - `LinkedList<Integer> listAngka = new LinkedList<>();` menggunakan kelas bawaan Java dari paket `java.util.LinkedList`.
   - Berbeda dari array yang berukuran tetap, *Linked List* adalah struktur data dinamis berantai di mana tiap elemen (*node*) terhubung melalui penunjuk (*pointer/reference*).
   - Penambahan elemen dilakukan secara berurutan menggunakan metode `.add()`: angka `5` (digit NIM awal), `19`, `44`, `60`, dan `93` (digit NIM akhir).

---

### D. Bukti Video dengan Link Youtube

* **Judul Video** : Penjelasan & Demonstrasi Tugas Praktik 1 Struktur Data (STSI4104)
* **Link YouTube** : `https://youtu.be/xxxxxxxxxxx` *(Ganti dengan link video rekaman Anda)*
* **Keterangan** : Video berdurasi di bawah 15 menit, memuat rekaman wajah (facecam) serta penjelasan run-through source code dan demonstrasi eksekusi program.

---

### E. Screenshot

#### 1. Screenshot Source Code
*(Tempelkan tangkapan layar editor kode seperti VS Code / Online IDE di bagian ini)*

```text
[ TEMPEL SCREENSHOT SOURCE CODE DI SINI ]
```

#### 2. Screenshot Output Eksekusi Program
*(Tempelkan tangkapan layar terminal / konsol saat program dijalankan)*

Tampilan output terminal saat program dijalankan:
```text
=== 1. Deklarasi Variabel Integer ===
Variabel StrukturBaris: 10

=== 2. Deklarasi Variabel String ===
Variabel KataBaru: Naufal

=== 3. Array 1 Dimensi (empatAngka) ===
Isi array empatAngka: 5, 10, 20, 93

=== 4. Array 2 Dimensi (Angka) [3x3] ===
05	3	5	
14	19	20	
22	27	93	

=== 5. Linked List (listAngka) ===
Isi LinkedList listAngka: [5, 19, 44, 60, 93]
```
