package PraktikumPBO.Sesi7;

public class Nilai {
    public double Quis;
    public double UTS;
    public double UAS;
    public double getNA() {
        return 0.20*Quis+0.30*UTS+0.5*UAS;
    }
    
}
