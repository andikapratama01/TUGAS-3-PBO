//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */

public class Program14 {

public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
int N;
int i = 1;
Scanner masukan=new Scanner(System.in);
/* Program */

System.out.print ("Nilai N >0 = "); 
N = masukan.nextInt();
System.out.print ("Print i dengan WHILE (ringkas): \n");
while (i <= N){
System.out.println (i++);
} /* (i > N)*/

}

}
