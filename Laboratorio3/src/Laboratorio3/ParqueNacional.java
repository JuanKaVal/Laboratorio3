
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
        this("","",0,0,0);
    }
    
    public ParqueNacional(String nombre, String provincia, int cantCostarricenses, int cantExtrangeros, int clientesElectricidad) {
    super(nombre, provincia);
    this.cantCostarricenses = cantCostarricenses;
    this.cantExtrangeros = cantExtrangeros;
    this.clientesElectricidad = clientesElectricidad;
    }

    public int getClientesElectricidad() {
        return clientesElectricidad;
    }

    public void setClientesElectricidad(int clientesElectricidad) {
        this.clientesElectricidad = clientesElectricidad;
    }

    public int getCantCostarricenses() {
        return cantCostarricenses;
    }

    public void setCantCostarricenses(int cantCostarricenses) {
        this.cantCostarricenses = cantCostarricenses;
    }

    public int getCantExtrangeros() {
        return cantExtrangeros;
    }

    public void setCantExtrangeros(int cantExtrangeros) {
        this.cantExtrangeros = cantExtrangeros;
    }

    @Override
    public double calcularIngresos() {
        int subvencion = (1200 * clientesElectricidad);
        int ingresosEntradas = (cantCostarricenses * 5000) + (cantExtrangeros * 6000);
        int totalIngresos = subvencion + ingresosEntradas;
        return totalIngresos;
    }


    
    @Override
    public double total() {
        return calcularIngresos();
    }

    @Override
    public String toString() {
        return "[ParqueNacional] " + super.toString();
    }  
}

    

