package milantairoopapp04;

public class TajniRobot extends Robot{

    public TajniRobot(double tezinaKG, String ime, String lozinka) {
        super(tezinaKG, ime, lozinka);
    }
    
    

    @Override
    protected void izvrsenjeNaredbe(String naredjenje) {
        
    }

    @Override
    public double getTezinaKG() {
        return 0;
    }
    
}
