
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class ReporteVector {
    
    private static final int CAP = 4;
    ParqueNacional parque = new ParqueNacional();
    MonumentoNacional monumet = new MonumentoNacional();
    ReservaBiologica reserva = new ReservaBiologica();
    RefugioVidaSilvestre refugio = new RefugioVidaSilvestre();
    
    
    public ReporteVector() {
        String[] reports = new String[CAP];
    }
    
    public String[] report1 () {
        String[] reports = new String[CAP];
        String valores = "";
        for (String i:reports) {
            valores += "" + parque.toString() + "\n" + monumet.toString() "\n" + reserva.toString() + "\n" + refugio.toString();
        }
        return null;
    }
    
    public String[] report2 () {
        
    }
    
    public void crecimiento () {
        
    }
    
    public String[] agregar () {
        
        return null;
    }
    
}
