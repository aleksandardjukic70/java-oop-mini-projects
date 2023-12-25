package milantairoopapp05;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class AppLog {
    
    private static PrintWriter pw;
    
    private void openLogFile() throws Exception {
        if (pw == null) {
            FileOutputStream fos = new FileOutputStream("app.log", true);//sve postojece u ovom fajlu ce biti zadrzano
            pw = new PrintWriter(fos);
        }
    }
    private void closeLogFile(){
        if (pw != null) {
            pw.close();
        }
    }
    public void write(int errorCode, String errorMessage) throws Exception {
        String record = System.currentTimeMillis() + "\t" +
                        String.format("%010d", errorCode) + "\t" +  
                        errorMessage;
        openLogFile();
        
        pw.println(record);
        pw.flush();
        
        //closeLogFile();
    }
}
