package PraktikumPBO.Sesi7;

public class Nilai {
    public double Quis;
    public double UTS;
    public double UAS;

    public double getNA() {
        return 0.20 * Quis + 0.30 * UTS + 0.5 * UAS;
    }

    public String getGrade() {
        double nilaiAkhir = getNA();

        if (nilaiAkhir >= 85) {
            return "A";
        } else if (nilaiAkhir >= 75) {
            return "B";
        } else if (nilaiAkhir >= 65) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nilai Quis: " + Quis);
        System.out.println("Nilai UTS: " + UTS);
        System.out.println("Nilai UAS: " + UAS);
        System.out.println("Nilai Akhir (NA): " + getNA());
        System.out.println("Grade: " + getGrade());
    }
}