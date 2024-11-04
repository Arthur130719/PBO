package PraktikumPBO.Sesi5;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);
        int angka;
        
        // Perulangan yang terus berjalan sampai pengguna memasukkan angka 0
        do {
            System.out.print("Masukkan sebuah angka (0 untuk berhenti): ");
            angka = input.nextInt(); // Membaca input angka
            
            if (angka != 0) {
                System.out.println("Anda memasukkan angka: " + angka);
            }
        } while (angka != 0); // Perulangan akan berhenti jika angka 0
        
        System.out.println("Program berhenti karena Anda memasukkan angka 0.");
        input.close(); // Menutup scanner
    }
}
