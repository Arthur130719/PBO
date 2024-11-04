package PraktikumPBO.TUGAS_PROGRAM_KALKULATOR;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di TUGAS PROGRAM KALKULATOR");

        System.out.print("Masukkan angka pertama: ");
        double angka1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Masukkan Simbol ( tambah (+), kurang (-), kali (*), bagi (/) ): ");
        char operator = scanner.nextLine().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = Double.parseDouble(scanner.nextLine());

        double hasil;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
                break;
        }

        scanner.close();
    }
}
