
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public abstract class ZonasProtegidas implements Ingresos {
    
    private String nombre;
    private String provincia;

    public ZonasProtegidas() {
        this("","");
    }

    public ZonasProtegidas(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
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
    
@Override
    public double total() {
        return calcularIngresos();
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + ", Provincia: " + provincia + ", MontoIngresos:";
    }     
}
