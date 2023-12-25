package milantairoopapp06;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database instance = null;
    
    private Object connection = null;

    private Database() {
        
    }
    
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        
        return instance;
    }
    
    
    private void connect() {
        if (connection == null) {
            
            System.out.println("Uspostavljam konekciju...");
            connection = "konekcija";
        }
    }
        
    
    public List<Object> query (String sqlQuery) {
        connect();
        
        System.out.println("Izvrsavam upit...");
        ArrayList<Object> rezultati = new ArrayList<>();
        
        rezultati.add("Rezultat 1");
        rezultati.add("Rezultat 2");
        rezultati.add("Rezultat 3");
        
        return rezultati;
    }
}
