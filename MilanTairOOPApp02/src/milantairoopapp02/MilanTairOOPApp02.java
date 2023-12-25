package milantairoopapp02;

public class MilanTairOOPApp02 {// 02 - WRAPPER KLASE(OMOTACI)

    public static void main(String[] args) {//IZRACUNAVANJE PREDJENOG PUTA
        
        prikaziPredjeniPut(Brzina.fromMetersPerSecond(110), Vreme.fromMinutes(4));
        
    }
    //MEHANIZAM KOJI NE ZELIMO DA UPOTREBLJAVAMO
    /*public static void prikaziPredjeniPut(double brzina, double vreme) {
        double predjeniPut = brzina * vreme;
        System.out.println("Predjeni put je: " + predjeniPut);
    }*/
    
    //MEHANIZAM KOJI CEMO UPOTREBITI
    public static void prikaziPredjeniPut(Brzina brzina, Vreme vreme) {
        Put p = Put.fromMeters(brzina.toMetersPerSecond() * vreme.toSeconds());
        System.out.println("Predjeni put je: " + p.toKilometers() + "km");
    }
    
    
}
