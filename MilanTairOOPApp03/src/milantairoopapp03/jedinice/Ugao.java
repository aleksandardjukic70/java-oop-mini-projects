package milantairoopapp03.jedinice;

public class Ugao {
    private double radijani;
    
    private Ugao(double radijani) {
        this.radijani = radijani;
    }
    
    public static Ugao fromRadians(double radijani) {
        return new Ugao(radijani);
    }
    
    public static Ugao fromDegrees(double stepeni) {
        return new Ugao( Math.toRadians(stepeni));//konvertovanje stepena u radijane
    }
    
    public double toRadians() {
        return radijani;
    }
    
    public double toDegrees() {
        return Math.toDegrees(radijani);
    }
    
    public void rorateLeft(Ugao ugao){
        radijani = Math.toRadians(toDegrees() + ugao.toDegrees());
    }
    
    public void rorateRight(Ugao ugao){
        radijani = Math.toRadians(toDegrees() - ugao.toDegrees());
    }
}
