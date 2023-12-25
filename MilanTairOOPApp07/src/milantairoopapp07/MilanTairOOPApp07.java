package milantairoopapp07;//RadSaInterfejsima

import java.util.ArrayList;
import java.util.List;

public class MilanTairOOPApp07 {//07 - INTERFEJSI

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        
        animals.add(new Cat("Pega", "siva"));
        animals.add(new Tigar("Shirkan", "zuta"));
        animals.add(new Fish("Zlatana", "zlatna"));
        animals.add(new Papagaj("Kica", "ljubicasta"));
        
        for (Animal animal : animals) {
            if (animal instanceof ClimbingAbility) {
                ((ClimbingAbility) animal).climb();
            }
            
            if (animal instanceof SwimmingAbility) {
                ((SwimmingAbility) animal).swim();
            }
            
            if (animal instanceof FlyingAbility) {
                ((FlyingAbility) animal).fly();
                ((FlyingAbility) animal).land();
            }
        }
        
    }
    
}
