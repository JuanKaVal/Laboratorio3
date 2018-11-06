
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public abstract class ZonasProtegidas implements Ingresos {
    
    private String nombre;
    private String provincia;
    //private double montoIngresos;

    public ZonasProtegidas() {
        this("","");
    }

    public ZonasProtegidas(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
        //this.montoIngresos = montoIngresos;
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

   // public double getMontoIngresos() {
    //    return montoIngresos;
   // }

    // public void setMontoIngresos(double montoIngresos) {
     //   this.montoIngresos = montoIngresos;
    //}
    
    @Override
    public double total() {
        return this.calcularIngresos();
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + ", Provincia: " + provincia + ", MontoIngresos:";
    }     
}
