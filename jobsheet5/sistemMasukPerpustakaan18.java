package jobsheet5;
import java.util.Scanner;
public class sistemMasukPerpustakaan18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- layanan perpustakaan polinema --");
        System.out.println("apakah anda membawa kartu mahasiswa? (true/false): ");
        boolean syarat_masuk1 = sc.nextBoolean();
        System.out.println("apakah anda sudah melakukan registrai online? (true/false): ");
        boolean syarat_masuk2 = sc.nextBoolean();

        if (syarat_masuk1 && syarat_masuk2) {
            System.out.println("boleh masuk");
        } else {
            System.out.println("tidak boleh masuk");
            
        }
    }
    
}
