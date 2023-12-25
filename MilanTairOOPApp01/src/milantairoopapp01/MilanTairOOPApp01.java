package milantairoopapp01;

public class MilanTairOOPApp01 {//01 - UVOD I OSNOVNI POJMOVI

    public static void main(String[] args) {//VEVERICA KOJA DRZI I ISPUTA LESNIK IZ RUKU
        Veverica v1 = new Veverica("Cip", "Braon");
        
        v1.savijLevuRuku();
        v1.pridrzi("LESNIK");
        v1.ispruziLevuRuku();
        
    }
    
}
