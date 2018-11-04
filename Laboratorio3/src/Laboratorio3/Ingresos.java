
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public abstract class Ingresos implements ZonasProtegidas{
    
    private String name;
    private String provincia;
    private static final double NOGUBER = 0.002;
    private static final double SUBVEN = 0.005;
    private int entradas;

    public Ingresos() {
        this("", "", 0);
    }
    
    

    public Ingresos(String name, String provincia, int entradas) {
        this.name = name;
        this.provincia = provincia;
        this.entradas = entradas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    @Override
    public String toString() {
        return "Ingresos{" + "name=" + name + ", provincia=" + provincia + ", entradas=" + entradas + '}';
    }
    
    
    
    
    
    
    
            
    
    
    
}
