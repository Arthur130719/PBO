package PraktikumPBO.Sesi5;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        double angka = input.nextDouble();
        
        // Memeriksa apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka yang Anda masukkan adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka yang Anda masukkan adalah negatif.");
        } else {
            System.out.println("Angka yang Anda masukkan adalah nol.");
        }
        
        // Menutup scanner
        input.close();
    }
}
    
