package PraktikumPBO.TUGAS_PROGRAM_CLASS;

// Definisi class Mahasiswa
class Mahasiswa {
    // Atribut
    String nama;
    int umur;
    String jurusan;

    // Konstruktor untuk menginisialisasi objek Mahasiswa
    public Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
        System.out.println("Jurusan: " + this.jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa menggunakan konstruktor
        Mahasiswa mhs1 = new Mahasiswa("Satria Adi Wijaya", 20, "Teknik Informatika");

        // Memanggil method untuk menampilkan informasi mahasiswa
        mhs1.tampilkanInfo();
    }
}
