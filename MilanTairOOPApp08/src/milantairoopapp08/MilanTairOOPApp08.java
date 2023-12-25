package milantairoopapp08;

public class MilanTairOOPApp08 {

    public static void main(String[] args) {
        String gorivo = "g";
        Automobil a1 = new Automobil(VrstaGoriva.fromSkracenica(gorivo), "Tesla");
        
        
        
        System.out.println(a1.getModel() + ", " + a1.getVrstaGoriva());
    }
    
}
