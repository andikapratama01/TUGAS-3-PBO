//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.util.Scanner;

/* Baca N, Print 1 s/d N dengan FOR */

public class Program10 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	 
int i,N;
	Scanner masukan=new Scanner(System.in);
	 
/* Program */
	/* program */
	System.out.print ("Baca N, print 1 s/d N ");
	System.out.print ("N = ");
	N=masukan.nextInt();
	for (i = 1; i <= N; i++){
	System.out.println (i); };
	System.out.println ("Akhir program \n");
	}
}	
