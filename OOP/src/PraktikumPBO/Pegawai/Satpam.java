package PraktikumPBO.Pegawai;

public class Satpam extends Pegawai {

    public void menampilkan()
    {
        System.out.println("Nama : "+nama);
        System.out.println("Id Pegawai : "+id_pegawai);
        System.out.println("Gaji : "+gaji);
    }
    
    public void tugas(){
        System.out.println("Tugas : Menjaga keaamanan didalam dan diluar frenchies");
        System.out.println("----------------------------------------------------------------");
    }
}