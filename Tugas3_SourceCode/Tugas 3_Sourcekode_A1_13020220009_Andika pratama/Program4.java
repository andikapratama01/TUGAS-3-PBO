//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.util.Scanner;

/* contoh pemakaian IF dua kasus komplementer */
/* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >=0 */
/*	'Nilai a negatif , nilai a', jika a <0	*/

public class Program4 {


public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
int a;
Scanner masukan=new Scanner(System.in);
/* Program */

System.out.print ("Contoh IF dua kasus \n");

System.out.print ("Ketikkan suatu nilai integer :"); a=masukan.nextInt();

if (a >= 0){
System.out.println ("Nilai a positif "+ a);
}else /* a< 0 */
{

 
System.out.println ("Nilai a negatif "+ a);
}

}

}