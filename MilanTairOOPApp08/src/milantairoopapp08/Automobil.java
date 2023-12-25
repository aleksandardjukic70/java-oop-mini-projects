package milantairoopapp08;

public class Automobil {
    private VrstaGoriva vrstaGoriva;
    private String model;

    public Automobil(VrstaGoriva vrstaGoriva, String model) {
        this.vrstaGoriva = vrstaGoriva;
        this.model = model;
    }

    public VrstaGoriva getVrstaGoriva() {
        return vrstaGoriva;
    }

    public String getModel() {
        return model;
    }
    
    
}
