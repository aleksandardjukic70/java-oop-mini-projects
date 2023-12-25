package milantairoopapp03.igra;

import milantairoopapp03.jedinice.Duzina;
import milantairoopapp03.jedinice.Lokacija;

public abstract class Objekat {
    private Lokacija lokacija;
    private String slika;

    public Objekat(Lokacija lokacija, String spritePath) {
        this.lokacija = lokacija;
        this.slika = slika;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public String getSlika() {
        return slika;
    }
    
    
    
}
