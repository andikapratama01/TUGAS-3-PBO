//NIM = 13020220009
//Nama = Andika Pratama
//Hari/Tanggal = Selasa-05-Maret-2024
//Waktu Pengerjaan = 13.30-15.10

import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */

public class Program9 {


public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
int a, b;
Scanner masukan=new Scanner(System.in);
 
/* Program */
System.out.print ("Maksimum dua bilangan : \n"); 
System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN :\n");
a=masukan.nextInt(); 
b=masukan.nextInt();
System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
if (a >= b){
System.out.println ("Nilai a yang maksimum "+ a);
}else /* a > b */{
System.out.println ("Nilai b yang maksimum: "+ b);
}
}

}
