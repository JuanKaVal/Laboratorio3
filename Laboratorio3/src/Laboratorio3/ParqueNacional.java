
package Laboratorio3;
   
/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class ParqueNacional extends ZonasProtegidas{
    private int clientesElectricidad;
    private int cantCostarricenses;
    private int cantExtrangeros;

    public ParqueNacional() {
        this("","",0,0,0,0);
    }
    
    public ParqueNacional(String nombre, String provincia, int montoIngresos, int cantCostarricenses, int cantExtrangeros, int clientesElectricidad) {
    super(nombre, provincia, montoIngresos);
    this.cantCostarricenses = cantCostarricenses;
    this.cantExtrangeros = cantExtrangeros;
    this.clientesElectricidad = clientesElectricidad;
    }
    

    @Override
    public int calcularIngresos() {
        int subvencion = (1200 * clientesElectricidad);
        int ingresosEntradas = (cantCostarricenses * 5000) + (cantExtrangeros * 6000);
        int totalIngresos = subvencion + ingresosEntradas;
        return totalIngresos;
        
    }
    
    
    
    
    
}

    

