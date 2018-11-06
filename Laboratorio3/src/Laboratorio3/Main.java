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
        
        ParqueNacional parque = new ParqueNacional("Wachipeling", "Alajuela", 0, 2, 5, 10);
        ReporteVector reporte = new ReporteVector();
        reporte.agregar(parque);
        reporte.agregar(parque);
        System.out.println(reporte.reporte1());
        
        
        
    }
    
}
