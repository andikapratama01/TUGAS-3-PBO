//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaString {

    public static void main(String[] args) throws IOException {
        /* Kamus */
        String str;

        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        /* Program */

        System.out.println("\nBaca string dan Integer: ");
        System.out.print("Masukkan sebuah string: ");
        str = datAIn.readLine();

        System.out.println("String yang dibaca : " + str);

        // Menutup BufferedReader setelah digunakan
        datAIn.close();
    }
}
