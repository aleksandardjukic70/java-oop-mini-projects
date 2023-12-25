package milantairoopapp03.igra;

import milantairoopapp03.jedinice.Lokacija;

public class NepokretanObjekat extends Objekat {
    private String ime;

    public NepokretanObjekat(Lokacija lokacija, String slika, String ime) {
        super(lokacija, slika);
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }
}
