//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.util.Scanner;
 
public class Program12 {

public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
int N;
int i;
Scanner masukan=new Scanner(System.in);
/* Program */

System.out.print ("Nilai N >0 = ");
/* Inisialisasi */
N = masukan.nextInt();

i = 1;
/* First Elmt */
System.out.print ("Print i dengan REPEAT: \n");
do{
System.out.print (i+"\n"); /* Proses */ 
i++; /* Next Elmt */
}

while (i <= N); /* Kondisi pengulangan */
}

}
