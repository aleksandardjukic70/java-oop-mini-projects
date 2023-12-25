package milantairoopapp02;

public class Brzina {
    private double mps;

    private Brzina(double mps) {
        this.mps = mps;
    }
    
    public static Brzina fromMetersPerSecond(double mps) {
        return new Brzina(mps);
    }
    
    public static Brzina fromKilometersPerSecond(double kmph) {
        return new Brzina(kmph / 3.6);
    } 
    
    public double toMetersPerSecond() {
        return this.mps;
    }
    
    public double toKilometersPerHour() {
        return this.mps * 3.6;
    }
    
    public void addMetersPerSecond(double mps) {
        this.mps += mps;
    }
    
    public void addKilometersPerSecond(double kmph) {
        this.mps += kmph / 3.6;
    }
}
