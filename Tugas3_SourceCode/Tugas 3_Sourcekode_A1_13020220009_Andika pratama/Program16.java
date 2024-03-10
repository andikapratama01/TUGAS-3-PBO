//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.util.Scanner;

public class Program16 {

    public static void main(String[] args) {
        int sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */

        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {    /* Minimal ada satu data yang dijumlahkan */

            do {
                sum = sum + x; /* Proses */
                System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
            } while (x != 999); /* Kondisi pengulangan */

            System.out.println("Hasil penjumlahan = " + sum);
        }

        masukan.close(); // Menutup scanner setelah digunakan
    }
}
