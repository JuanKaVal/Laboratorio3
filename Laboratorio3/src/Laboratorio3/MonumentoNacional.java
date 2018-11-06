
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class MonumentoNacional extends ZonasProtegidas{

    private int nationalEntrades;
    private int internationalEntrades;
    private int pib;
    private static final double PIB = 0.002;

    public MonumentoNacional() {
    this("", "", 0, 0);
    }

    public MonumentoNacional(String nombre, String provincia, int nationalEntrades, int international) {
        super(nombre, provincia);
        this.nationalEntrades = nationalEntrades;
        this.internationalEntrades = international;
    }

    public int getNationalEntrades() {
        return nationalEntrades;
    }

    public void setNationalEntrades(int nationalEntrades) {
        this.nationalEntrades = nationalEntrades;
    }

    public int getInternationalEntrades() {
        return internationalEntrades;
    }

    public void setInternationalEntrades(int internationalEntrades) {
        this.internationalEntrades = internationalEntrades;
    }


    public double calcularIngresos() {
       double result = 0;
       result += ((nationalEntrades*5000)+(internationalEntrades*6000))*PIB;
       return result;
    }
    
    @Override
    public double total() {
        return calcularIngresos();
    }

    @Override
    public String toString() {
        return "[Monumento Nacional] " + super.toString();
    }  
}
