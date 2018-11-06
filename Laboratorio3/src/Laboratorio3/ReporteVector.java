
package Laboratorio3;

/**
 *
 * @author Edwin Molina , Juan Carlos Valverde
 * @version 3 De Noviembre, 2018
 */
public class ReporteVector {
    
    private ZonasProtegidas[] areas;
    private static final int CAP = 4;
    private int round = 0;

    public ReporteVector() {

        areas = new ZonasProtegidas[CAP];

    } 
    
    
    public ReporteVector(ZonasProtegidas[] tama) {
        if (tama == null) {
            areas = new ZonasProtegidas[CAP];
        }else {
            areas = tama;
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
        if (areas != null) {
            for (int i = 0; i < areas.length; i++) {
                if (areas[i] != null) {
                    print += "\n" + areas[i].toString() + areas[i].total();
                }
            }
        }
        
        if (areas != null) {
           for (int c = 0; c < areas.length; c++) {
                if (areas[c] != null) {
                    amount += areas[c].total();
            }
        }
        }
        print += "\n" + "Total: " + amount;
        return print ;
    }
    
    public void agregar (ZonasProtegidas newOne) {
        if (areas.length == round){
            crecimiento();
            if (newOne != null) {
                areas[round] = newOne;
                round += 1;
            } 
        
        }else if (newOne != null) {
            System.out.println("uno");
            areas[round] = newOne;
                round += 1;
        }
    }
    
    public String reporte2() {
      String print = "";
        int amount = 0;
        if (areas != null) {
            for (int i = 0; i < areas.length; i++) {
                if (areas[i] != null) {
                    print += "\n" + "Entradas: " + areas[i]. + "Subvención: " + areas[i]. +"No Gubernamental " + areas[i].;
                }
            }
        }

        return print ;
    }
    
    private void crecimiento () {
       ZonasProtegidas[] zonaProtegida = new ZonasProtegidas[areas.length*2];
       System.arraycopy(areas, 0, zonaProtegida, 0, areas.length);
       areas = zonaProtegida;
        
    }
    
    
    
}
