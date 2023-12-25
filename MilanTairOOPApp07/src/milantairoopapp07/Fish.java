package milantairoopapp07;

public class Fish extends Animal implements SwimmingAbility{

    public Fish(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeNoise() {
        return "Blub..blub..";
    }

    @Override
    public void swim() {
        System.out.println("I am swimming....");
    }
    
}
