package PraktikumPBO.TUGAS_OPERATOR_TIPE_DATA;

import java.util.Scanner;

    public class OperatorTipeData {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Penggunaan Operator dan Tipe Data
            int angka1, angka2, hasil;
            System.out.println("Masukkan angka pertama: ");
            angka1 = scanner.nextInt();
            System.out.println("Masukkan angka kedua: ");
            angka2 = scanner.nextInt();
    
            // If-Else
            if (angka1 > angka2) {
                System.out.println("Angka pertama lebih besar dari angka kedua.");
            } else if (angka1 < angka2) {
                System.out.println("Angka kedua lebih besar dari angka pertama.");
            } else {
                System.out.println("Kedua angka sama besar.");
            }
    
            // Switch Case
            System.out.println("Pilih operasi: 1. Penjumlahan 2. Pengurangan 3. Perkalian 4. Pembagian");
            int pilihan = scanner.nextInt();
    
            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    System.out.println("Hasil penjumlahan: " + hasil);
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    System.out.println("Hasil pengurangan: " + hasil);
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    System.out.println("Hasil perkalian: " + hasil);
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil pembagian: " + hasil);
                    } else {
                        System.out.println("Pembagian dengan 0 tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
    
            // Penggunaan Loop For
            System.out.println("\nLoop For: Menampilkan angka 1-5");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Angka: " + i);
            }
    
            // Penggunaan While Loop
            System.out.println("\nLoop While: Menampilkan angka 1-5");
            int j = 1;
            while (j <= 5) {
                System.out.println("Angka: " + j);
                j++;
            }
    
            // Penggunaan Do-While Loop
            System.out.println("\nLoop Do-While: Menampilkan angka 1-5");
            int k = 1;
            do {
                System.out.println("Angka: " + k);
                k++;
            } while (k <= 5);
    
            // Menutup Scanner
            scanner.close();
        }
    }

