package milantairoopapp03.igra;

import milantairoopapp03.jedinice.Brzina;
import milantairoopapp03.jedinice.Lokacija;
import milantairoopapp03.jedinice.Ugao;

public class Igrac extends PokretanObjekat {
    private String ime = "";
    private double snaga = 0;
    private double zivot = 0;

    public Igrac(Lokacija lokacija, String slika, Brzina brzina) {
        super(lokacija, slika, brzina, Ugao.fromDegrees(0));
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getSnaga() {
        return snaga;
    }

    public void setSnaga(double snaga) {
        this.snaga = snaga;
    }

    public double getZivot() {
        return zivot;
    }

    public void setZivot(double zivot) {
        this.zivot = zivot;
    }

    
    
    
}
