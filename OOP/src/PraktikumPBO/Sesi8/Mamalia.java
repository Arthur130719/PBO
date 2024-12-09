package PraktikumPBO.Sesi8;

public class Mamalia extends Hewan {
    protected String berkembangbiak;

    public Mamalia(){
        this.berkembangbiak="beranak";
    }

    public void cetak(){
        System.out.println("Mamalia Berkembang biak"+berkembangbiak);
    }
    
}

class Sapi extends Mamalia{
    private String nama;
    private String umur;

    public Sapi(){
        suara="hemoh..";
        berkembangbiak="Beranak";
        this.nama="Sopi";
        this.umur="1";
    }
    public void cetak(){
        System.out.println("======== Data Hewan Mamalia Sapi =========");
        System.out.println("Suara    :"+suara);
        System.out.println("Berkembangbiak :"+berkembangbiak);
        System.out.println("Nama    :"+nama);
        System.out.println("Umur     :"+umur+"tahun");
    }
}

class Kambing extends Mamalia{
    private String nama;
    private String umur;

    public Kambing(){
        suara="embekkk....";
        berkembangbiak="beranak";
        this.nama="si ling";
        this.umur="2";
    }
    public void cetak(){
        System.out.println("==== Data Hewan Mamalia Kambing ====");
        System.out.println("Suara       :"+suara);
        System.out.println("Berkembangbiak :"+berkembangbiak);
        System.out.println("Nama :"+nama);
        System.out.println("umur :"+umur+"tahun");
    }
}
class Unggas extends Hewan{
    protected String berkembangBiak;

    public Unggas(){
        this.berkembangBiak="bertelur";
    }

    public void cetak(){
        System.out.println("bertelur");
    }
}
class Burung extends Unggas{
    private String jenis;
    private String ciri;

    public Burung(){
        suara="mbkur...";
        berkembangBiak="bertelur";
        this.jenis="Merpati";
        this.ciri="Bulu Putih";
    }

    public void cetak(){
        System.out.println("==== Data hewan Unggas Burung ====");
        System.out.println("Suara :"+suara);
        System.out.println("berkembangbiak :"+berkembangBiak);
        System.out.println("Jenis :"+jenis);
        System.out.println("ciri :"+ciri);
    }
}
class Ayam extends Unggas{
    private String jenis;
    private String ciri;

    public Ayam(){
        suara="petok...";
        berkembangBiak="bertelur";
        this.jenis="Ayam Kampung";
        this.ciri="Bulu bercorak putih hitam";
    }

    public void cetak(){
        System.out.println("==== Data hewan Unggas Ayam ====");
        System.out.println("Suara :"+suara);
        System.out.println("berkembangbiak :"+berkembangBiak);
        System.out.println("Jenis :"+jenis);
        System.out.println("ciri :"+ciri);
    
    }
}
class Ikan extends Hewan{
    protected String napas;

    public Ikan(){
        this.napas="insang";
    }

    public void cetak(){
        System.out.println("Insang");
    }
}
class Gurame extends Ikan{
    private String Ciri;
    private String Berat;

    public Gurame(){
        suara=".....";
        napas="insang";
        this.Ciri="Berwarna Hitam";
        this.Berat="2";
    }

    public void cetak(){
        System.out.println("==== Data hewan Ikan Gurame ====");
        System.out.println("Suara :"+suara);
        System.out.println("bernapas :"+napas);
        System.out.println("ciri :"+Ciri);
        System.out.println("berat :"+Berat);
    }
}
class Lele extends Ikan{
    private String Ciri;
    private String Berat;

    public Lele(){
        suara=".....";
        napas="insang";
        this.Ciri="Berwarna Hitam Keputihan";
        this.Berat="3";
    }

    public void cetak(){
        System.out.println("==== Data hewan Ikan Lele ====");
        System.out.println("Suara :"+suara);
        System.out.println("bernapas :"+napas);
        System.out.println("ciri :"+Ciri);
        System.out.println("berat :"+Berat);
    }
}
class Pewarisan{
    public static void main(String[] args) {
        Sapi sp1 = new Sapi();
        sp1.cetak();
        System.out.println("");
        Kambing kmb1 = new Kambing();
        kmb1.cetak();
        System.out.println("");
        Burung brg1 = new Burung();
        brg1.cetak();
        System.out.println("");
        Ayam aym1 = new Ayam();
        aym1.cetak();
        System.out.println("");
        Gurame grm1 = new Gurame();
        grm1.cetak();
        System.out.println("");
        Lele ll1 = new Lele();
        ll1.cetak();
        System.out.println("");
}
}