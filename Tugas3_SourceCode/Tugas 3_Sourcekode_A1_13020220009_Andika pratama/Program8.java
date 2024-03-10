//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.util.Scanner;

/* Membaca jari-jari, menghitung luas lingkaran */
/* latihan pemakaian konstanta */

public class Program8 {


public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
final float PHI = 3.1415f;
float r;
Scanner masukan=new Scanner(System.in);
/* program */ /* baca data */

System.out.print ("Jari-jari lingkaran ="); 
r = masukan.nextFloat();
/* Hitung dan tulis hasil */
System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
System.out.print ("Akhir program \n");

}
}
