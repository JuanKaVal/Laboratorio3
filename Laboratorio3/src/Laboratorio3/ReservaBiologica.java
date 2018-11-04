
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class ReservaBiologica extends ZonasProtegidas{ 
    
    private static final double SUB = 0.005;

    public ReservaBiologica() {
        this("", "", 0);
    }
    public ReservaBiologica(String nombre, String provincia, int montoIngresos) {
        super(nombre, provincia, montoIngresos);
    }

    @Override
    public int calcularIngresos() {
  
    return super.getMontoIngresos();
    }

    @Override
    public String toString() {
        return "[ReservaBiologica]" + super.toString();
    }
    
    
}
