package milantairoopapp03.jedinice;

public class Lokacija {
    private Duzina x, y;

    public Lokacija(Duzina x, Duzina y) {
        this.x = x;
        this.y = y;
    }

    public Duzina getX() {
        return x;
    }

    public Duzina getY() {
        return y;
    }
    
    public void move(Ugao ugao, Duzina duzina) {//pomeriti za neki ugao
        //x' = x + duzinaPuta * cos(ugao)
        //y' = y + duzinaPuta * sin(ugao)
        x.addMeters(duzina.toMeters() * Math.cos(ugao.toRadians()));
        y.addMeters(duzina.toMeters() * Math.sin(ugao.toRadians()));      
    }
}
