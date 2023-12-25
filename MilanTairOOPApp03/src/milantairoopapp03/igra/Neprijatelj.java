package milantairoopapp03.igra;

import milantairoopapp03.jedinice.Brzina;
import milantairoopapp03.jedinice.Lokacija;
import milantairoopapp03.jedinice.Ugao;

public abstract class Neprijatelj extends PokretanObjekat {
    private double snaga = 0;
    private double zivot = 0;

    public Neprijatelj(Lokacija lokacija, String slika, Brzina brzina) {
        super(lokacija, slika, brzina, Ugao.fromDegrees(0));
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
