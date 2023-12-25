package milantairoopapp01;

public class Ruka {
    public enum Stanje {SAVIJENA, ISPRUZENA};
    
    private Stanje stanje = Stanje.ISPRUZENA;
    
    public void savij() {
        stanje = Stanje.SAVIJENA;
    }
    
    public void ispruzi() {
        stanje = Stanje.ISPRUZENA;
    }
    
    public Stanje getStanje() {
        return stanje;
    }
    
    public boolean jeSavijena() {
        return stanje == Stanje.SAVIJENA;
    }
    
    public boolean jeIspruzena() {
        return stanje == Stanje.ISPRUZENA;
    }
}

