package PraktikumPBO.Sesi7;

public class SiswaTester {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Andi", 85);
        siswa1.tampilkanInfo();

        siswa1.setNama("Budi");
        siswa1.setNilaiUjian(95);

        System.out.println("\nSetelah Diubah:");
        siswa1.tampilkanInfo();

        siswa1.setNilaiUjian(105);  // Ini akan menampilkan pesan bahwa nilai harus antara 0 dan 100.
    }
}
