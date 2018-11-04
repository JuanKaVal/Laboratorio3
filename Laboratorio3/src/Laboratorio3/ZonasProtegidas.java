
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public abstract class ZonasProtegidas {
    
    private String nombre;
    private String provincia;
    private int ingresos;

    public ZonasProtegidas() {
        this("", "", 0);
    }

    public ZonasProtegidas(String nombre, String provincia, int ingresos) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.ingresos = ingresos;
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

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "ZonasProtegidas{" + "nombre=" + nombre + ", provincia=" + provincia + ", ingresos=" + ingresos + '}';
    }
    
    
}
