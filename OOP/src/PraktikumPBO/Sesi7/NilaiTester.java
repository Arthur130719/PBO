package PraktikumPBO.Sesi7;

public class NilaiTester {
    public static void main(String[] args) {
<<<<<<< HEAD
        Nilai n = new Nilai();
        
        n.Quis = 90;
        n.UTS = 70;
        n.UAS = 100; // Nilai di luar batas untuk pengujian validasi

        // Validasi nilai Quis, UTS, dan UAS
        if (n.Quis < 0 || n.Quis > 100 || n.UTS < 0 || n.UTS > 100 || n.UAS < 0 || n.UAS > 100) {
            System.out.println("Nilai harus antara 0 dan 100.");
        } else {
            System.out.println("NA: " + n.getNA());
            System.out.println("Grade: " + n.getGrade());
        }
    }
=======
        Nilai n= new Nilai ();
        n.Quis=90;
        n.UTS=70;
        n.UAS=150;
        System.out.println("NA : " +n.getNA());
    }
    
>>>>>>> 115f004985744a3b7973826e97920d2e9499f7fb
}
