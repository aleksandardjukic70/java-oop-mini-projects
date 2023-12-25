package milantairoopapp05;//SM

public class MilanTairOOPApp05 {//05 - STATICKI CLANOVI

    public static void main(String[] args) throws Exception {//APP ZA LOGOVANJE KOJA 'RECIKLIRA' STATICKI CLAN PODATAK(pw)
                                                            //DA BI SVI OBJEKTI KLASE AppLog MOGLI DA MU PRISTUPE RADI BOLJE 
                                                            //OPTIMIZACIJE APLIKACIJE
        AppLog al1 = new AppLog();
        
        al1.write(3401, "Ovo je greska 1.");
        
        
        
        
        AppLog a12 = new AppLog();
        
        a12.write(112, "Ovo je greska 2.");
    }
    
}
