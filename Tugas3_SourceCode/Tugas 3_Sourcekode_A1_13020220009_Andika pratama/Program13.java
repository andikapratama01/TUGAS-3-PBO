//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.util.Scanner;

/* Baca N, Print i = 1 s/d N dengan WHILE */

public class Program13 {

public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
int N;
int i;
Scanner masukan=new Scanner(System.in);
/* Program */

System.out.print ("Nilai N >0 = "); /* Inisialisasi */ 
N = masukan.nextInt();
i = 1;	/* First Elmt */

System.out.print ("Print i dengan WHILE: \n");
while (i <= N) /* Kondisi pengulangan */
{ System.out.println (i); /* Proses */

i++; /* Next Elmt */
 
}; /* (i > N) */

}

}
