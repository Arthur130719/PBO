package PraktikumPBO.Sesi4;
import java.util.Scanner;
public class Hadiah {

    @param args

    public static void main(String[] args) {
        int belanja = 0;
        Scanner scan = new Scanner (System.in);

        System.out.print("Total Belanja : Rp ");
        belanja = scan.nextint();

        if (belanja > 100000){
            System.out.println("Selamat, Anda mendapatkan hadiah!");

        }
        System.out.println("Terima Kasih...");
    }
}

