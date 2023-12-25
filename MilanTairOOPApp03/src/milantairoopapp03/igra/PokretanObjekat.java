package milantairoopapp03.igra;

import milantairoopapp03.jedinice.Brzina;
import milantairoopapp03.jedinice.Duzina;
import milantairoopapp03.jedinice.Lokacija;
import milantairoopapp03.jedinice.Ugao;
import milantairoopapp03.jedinice.Vreme;

public abstract class PokretanObjekat extends Objekat {
    private Brzina brzina;
    private Ugao ugao;

    public PokretanObjekat(Lokacija lokacija, String slika, Brzina brzina, Ugao ugao) {
        super(lokacija, slika);
        this.brzina = brzina;
        this.ugao = ugao;
    }

    public Brzina getBrzina() {
        return brzina;
    }

    public Ugao getUgao() {
        return ugao;
    }
    
    public void move(Vreme vreme) {//objekat se krece unapred
        getLokacija().move(ugao, brzina.predjeniPut(vreme));
    }
}
