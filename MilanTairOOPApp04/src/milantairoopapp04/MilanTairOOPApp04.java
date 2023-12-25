package milantairoopapp04;

import java.util.ArrayList;

public class MilanTairOOPApp04 {//04 - APSTRAKTNE KLASE 

    public static void main(String[] args) {//ROBOTI KOJI IZVRSAVAJU NAREDJENJA AKO SU LOZINKE ISPRAVNE
        ArrayList<Robot> roboti = new ArrayList<>();
        
        roboti.add(new AutoRobot(100, "Auto 1", "test332", 45));
        roboti.add(new LeteciRobot(2, "Letelica 1", "test211", 600));
        roboti.add(new TajniRobot(300, "Super tajni robot", "asdkasd09123"));
        
        for (Robot r : roboti) {
            System.out.println("Tvoje ime? " + r.getIme());
            System.out.println("Tvoja tezina " + r.getTezinaKG());
        }
    }
    
}
