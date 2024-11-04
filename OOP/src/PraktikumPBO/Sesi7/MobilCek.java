package PraktikumPBO.Sesi7;

public class MobilCek { 
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", 2022, 300000000);
        
        System.out.println("Merk Mobil: " + mobil1.merk);
        System.out.println("Tahun Produksi Mobil: " + mobil1.tahunProduksi);
        System.out.println("Harga Mobil: " + mobil1.getHarga());
        
        mobil1.setHarga(350000000);
        System.out.println("Harga Mobil Setelah Diubah: " + mobil1.getHarga());
        
        mobil1.tampilkanInfoMobil();
    }
}
