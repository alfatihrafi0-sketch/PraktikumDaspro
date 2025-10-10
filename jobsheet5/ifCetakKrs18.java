package jobsheet5;
import java.util.Scanner;
public class ifCetakKrs18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("-- cetak KRS SIAKAD --");
    System.out.println("Apakah UKT Sudah lunas? (true/false): "); 
    boolean uktlunas = sc.nextBoolean();
    
    if (uktlunas) {
        System.out.println("pembayaran ukt terverifikasi");
        System.out.println("silahkan cetak KRS dan mi nta tanda tangan DPA");
    }
    }
    
}
