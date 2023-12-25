package milantairoopapp04;

public abstract class Robot {
    private double tezinaKG;
    private String ime;
    private String lozinka;

    public Robot(double tezinaKG, String ime, String lozinka) {
        this.tezinaKG = tezinaKG;
        this.ime = ime;
        this.lozinka = lozinka;
    }

    public double getTezinaKG() {
        return tezinaKG;
    }

    final public String getIme() {
        return ime;
    }
    
    public void izvrsiNarednje(String lozinka, String naredjenje){
        if (lozinka.equals(this.lozinka)) {
            izvrsenjeNaredbe(naredjenje);
        } else {
            System.out.println("Lozinka za robota " + ime + " nije ispravna!");
        }
    }
    
    abstract protected void izvrsenjeNaredbe(String naredjenje);
    
    
}
