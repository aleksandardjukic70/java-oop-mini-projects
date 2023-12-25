package milantairoopapp03;

import java.util.LinkedList;
import java.util.List;
import milantairoopapp03.igra.Igrac;
import milantairoopapp03.igra.NepokretanObjekat;
import milantairoopapp03.igra.Objekat;
import milantairoopapp03.igra.Vuk;
import milantairoopapp03.jedinice.Brzina;
import milantairoopapp03.jedinice.Duzina;
import milantairoopapp03.jedinice.Lokacija;
import milantairoopapp03.jedinice.Vreme;

public class MilanTairOOPApp03 {//03 - NASLEDJIVANJE KLASA

    public static void main(String[] args) {
        List<Objekat> listaObjekataIgre = new LinkedList<>();
        
        Vuk v1 = new Vuk(
                new Lokacija(Duzina.fromMeters(10), Duzina.fromMeters(12)),
                "slike/vuk.png",
                Brzina.fromKilometersPerHour(40),
                "crna"
        );
        
        Vuk v2 = new Vuk(
                new Lokacija(Duzina.fromMeters(10), Duzina.fromMeters(13)),
                "slike/vuk.png",
                Brzina.fromKilometersPerHour(45),
                "siva"
        );
                
                
        listaObjekataIgre.add(v1);
        listaObjekataIgre.add(v2);

        System.out.println(listaObjekataIgre.size());
        
        v1.move(Vreme.fromMinutes(2));
        v2.move(Vreme.fromMinutes(2));
    }
    
}
