
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class MonumentoNacional extends ZonasProtegidas{

    private int nationalEntrades;
    private int internationalEntrades;
    private double pib;
    private static final double PIB = 0.002;

    public MonumentoNacional() {
    this("", "", 0, 0, 0);
    }

    public MonumentoNacional( String nombre, String provincia, int montoIngresos, int nationalEntrades, double pib) {
        super(nombre, provincia, montoIngresos);
        this.nationalEntrades = nationalEntrades;
        this.pib = pib;
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

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    public int calcularIngresos() {
       int result = 0;
       result += (nationalEntrades*5000)+(internationalEntrades*6000)+(pib*PIB);
       return result;
    }

    @Override
    public String toString() {
        return "[Monumento Nacional] " + super.toString();
    }  
}
