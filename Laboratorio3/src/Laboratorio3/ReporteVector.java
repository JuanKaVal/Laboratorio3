
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class ReporteVector {
    
    private ZonasProtegidas[] areas;
    private static final int CAP = 4;

    public ReporteVector(ZonasProtegidas[] tama) {
        if (tama != null) {
            areas = tama;
        }else {
            areas = new ZonasProtegidas[CAP];
        }
    }

    public ZonasProtegidas[] getAreas() {
        return areas;
    }

    public void setAreas(ZonasProtegidas[] areas) {
        this.areas = areas;
    }

    @Override
    public String toString() {
        return "ReporteVector{" + "areas=" + areas + '}';
    }
    
    public String reporte1() {
        String print = "";
        int amount = 0;
        for (int i = 0; i < areas.length; i++) {
            print += print + areas[i].toString();

        }
        
        for (int c = 0; c < areas.length; c++) {
            amount += areas[c].total();
        }
        print += print + "Total: " + amount;
        return print ;
    }
    
    
    public void crecimiento () {
        
    }
    
    public String[] agregar () {
        
        return null;
    }
    
}
