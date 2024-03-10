//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        /* Kamus */
        int a;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.print("Contoh IF tiga kasus \n");
        System.out.print("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a > 0) {
            System.out.println("Nilai a positif " + a);
        } else if (a == 0) {
            System.out.println("Nilai Nol " + a);
        } else { /* a < 0 */
            System.out.println("Nilai a negatif " + a);
        }

        masukan.close(); // Menutup scanner setelah digunakan
    }
}
