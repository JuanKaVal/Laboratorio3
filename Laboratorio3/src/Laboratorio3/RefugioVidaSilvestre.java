
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class RefugioVidaSilvestre extends ZonasProtegidas{
    private String propiedad;
    private int impuesto;
    private int ayudaNoGubernamental;
    private static final double SUBVENCION = 0.005;

    public RefugioVidaSilvestre() {
    this("", "", 0, "", 0, 0);
    }
    
    public RefugioVidaSilvestre(String nombre, String provincia, int montoIngresos, String propiedad, int impuesto, int ayudaNoGubernamental){ 
        super(nombre, provincia, montoIngresos);
        this.propiedad = propiedad;
        this.impuesto = impuesto;
        this.ayudaNoGubernamental = ayudaNoGubernamental;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public int getAyudaNoGubernamental() {
        return ayudaNoGubernamental;
    }

    public void setAyudaNoGubernamental(int ayudaNoGubernamental) {
        this.ayudaNoGubernamental = ayudaNoGubernamental;
    }
    
    @Override
    public double calcularIngresos() {
        if(propiedad.equals("Estado")){
            double total = (impuesto*SUBVENCION);
            return total;
        }else if(propiedad.equals("Privada")){
            double total = ayudaNoGubernamental;
            return total;
        }else{
        }
        return 0;
    }
    
    @Override
    public double total() {
        return this.calcularIngresos();
    }

    @Override
    public String toString() {
        return "[RefugioVidaSilvestre]" + super.toString();
    }
    
    
    
    
}
