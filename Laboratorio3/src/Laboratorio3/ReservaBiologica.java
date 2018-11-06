
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class ReservaBiologica extends ZonasProtegidas{ 
    
    private static final double SUB = 0.005;
    private int impuesto;

    public ReservaBiologica() {
        this("", "", 0, 0);
    }

    public ReservaBiologica(String nombre, String provincia, int montoIngresos,int impuesto) {
        super(nombre, provincia, montoIngresos);
        this.impuesto = impuesto;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public double calcularIngresos() {
        double result = 0;
        result += (impuesto*SUB);
        return result;
    }
    
    @Override
    public double total() {
        return this.calcularIngresos();
    }

    @Override
    public String toString() {
        return "[ReservaBiologica]" + super.toString();
    }  
}
