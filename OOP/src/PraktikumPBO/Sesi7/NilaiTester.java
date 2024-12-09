package PraktikumPBO.Sesi7;

public class NilaiTester {
    public static void main(String[] args) {
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
}
