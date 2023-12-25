package milantairoopapp03.igra;

import milantairoopapp03.jedinice.Brzina;
import milantairoopapp03.jedinice.Lokacija;

public class Vuk extends Neprijatelj {
    private String boja;

    public Vuk(Lokacija lokacija, String slika, Brzina brzina, String boja) {
        super(lokacija, slika, brzina);
        this.boja = boja;
    }

    public String getBoja() {
        return boja;
    }
}
