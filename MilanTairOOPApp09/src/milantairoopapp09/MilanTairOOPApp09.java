package milantairoopapp09;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MilanTairOOPApp09 {

    public static void main(String[] args) {
        final List<Test> testovi = new ArrayList<>();
        
        popuniListu(testovi);
        
        System.out.println("----------------1.PRIMER----------------");
        /*testovi.forEach(test -> { //1. nacin
            //...uradi neki set instrukcija
        });
        
        for (Test test : testovi) {//2. nacin
            //.. uradi neki set instrukcija
        }*/
        
        final String subjectCode = "IR1PR1";
        
        /*double suma = 0.0;
        int brojTestova = 0;
        for (Test test : testovi) {
            if ( test.getSubject().getCode().equals(subjectCode)) {
                suma += test.getMark();
                brojTestova++;
            }
        }
        double prosek = suma / brojTestova;
        System.out.println("Prosecni broj poena je" + prosek);
        */ //ovaj nacin zahteva poprilicnu kolicinu koda
        
        double prosek = prosecanBrojProenaNaTestovimaIzPredmeta(testovi, subjectCode);    
        System.out.println("Prosecni broj poena je " + prosek);
        
        System.out.println("----------------------------------------");
        
         
    }
    
    public static void popuniListu(final List<Test> testovi) {
        try {
        testovi.add(new Test(new Subject("Programiranje 1", "IR1PR1"), new Student("Pera", "Peric", "2009120201"), "2016-04-10", 23.5));
        testovi.add(new Test(new Subject("Programiranje 1", "IR1PR1"), new Student("Iva", "Ivanovic", "2009120301"), "2016-04-10", 28.0));
        testovi.add(new Test(new Subject("Programiranje 1", "IR1PR1"), new Student("Zoran", "Zoric", "2009130201"), "2016-04-10", 18.5));
        
        
        testovi.add(new Test(new Subject("Programiranje 2", "IR2PR2"), new Student("Pera", "Peric", "2009120201"), "2016-04-10", 29.1));
        testovi.add(new Test(new Subject("Programiranje 2", "IR2PR2"), new Student("Iva", "Ivanovic", "2009120301"), "2016-04-10", 22.5));
        
        testovi.add(new Test(new Subject("Baze podataka 2", "IR2BP"), new Student("Pera", "Peric", "2009120201"), "2016-04-10", 24.0));
        testovi.add(new Test(new Subject("Baze podataka 2", "IR1BP"), new Student("Zoran", "Zoric", "2009130201"), "2016-04-10", 20.0));
        
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static double prosecanBrojProenaNaTestovimaIzPredmeta(final List<Test> testovi, String subjectCode) {
        return testovi.stream()
                      .filter(test -> test.getSubject().getCode().equals(subjectCode))
                      .mapToDouble(Test::getMark)
                      .average()
                      .getAsDouble();
    }
}
