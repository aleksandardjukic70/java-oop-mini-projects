package milantairoopapp07;

public abstract class Animal {
    final private String name;
    final private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    
    public abstract String makeNoise(); 
    
    
    
}
