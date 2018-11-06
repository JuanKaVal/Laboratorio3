package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ZonasProtegidas parque = new ParqueNacional("Wachipeling", "Alajuela", 0, 2500, 5000, 17000);
        ZonasProtegidas[] organiza = {parque}; 
        ReporteVector reporte = new ReporteVector(organiza);
        
        reporte.reporte1();
        
        
    }
    
}
