
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public abstract class ZonasProtegidas implements Ingresos{
    
    private String nombre;
    private String provincia;
    private int montoIngresos;

    public ZonasProtegidas() {
        this("","",0);
    }

    public ZonasProtegidas(String nombre, String provincia, int montoIngresos) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.montoIngresos = montoIngresos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getMontoIngresos() {
        return montoIngresos;
    }

    public void setMontoIngresos(int montoIngresos) {
        this.montoIngresos = montoIngresos;
    }

    @Override
    public String toString() {
        return "ZonasProtegidas{" + "nombre=" + nombre + ", provincia=" + provincia + ", montoIngresos=" + montoIngresos + '}';
    }     
}
