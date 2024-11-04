package PraktikumPBO.Sesi5;
public class Soal4 {
    public static void main(String[] args) {
        int jumlahGenap = 0;

        // Menggunakan perulangan for untuk memeriksa setiap angka dari 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            // Memeriksa apakah angka tersebut genap
            if (i % 2 == 0) {
                jumlahGenap++; // Menambah jumlah bilangan genap
                System.out.println(i + " adalah bilangan genap.");
            }
        }

        // Menampilkan total jumlah bilangan genap
        System.out.println("Jumlah bilangan genap antara 1 hingga 100 adalah: " + jumlahGenap);
    }
}

