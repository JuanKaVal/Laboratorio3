
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class ReservaBiologica extends ZonasProtegidas{

    public ReservaBiologica() {
    }

    public ReservaBiologica(String nombre, String provincia, int ingresos) {
        super(nombre, provincia, ingresos);
    }

    @Override
    public String toString() {
        return "ReservaBiologica: " + super.toString();
    }
    
    
    
}
