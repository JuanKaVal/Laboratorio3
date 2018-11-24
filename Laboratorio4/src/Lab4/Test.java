
package Lab4;

/**
 *
 * @author Edwin Molina, Juan Carlos Valverde
 */
public class Test {
    
        public static void main(String[] args) {

        //Ejercicio 1    
        System.out.println("Ejercio 1");
        System.out.println(Lab4.binaryToDecimal(10, 0));   
        System.out.println("\n");
        
        //Ejercicio 2  
        System.out.println("Ejercio 2");
        int[] test = {1,2,3,4,5};
        Lab4.invert(test, 0, test.length-1);
        //Ejercicio 3
        Lab4.print(test);
        System.out.println("\n");
        
        //Ejercicio 4
        System.out.println("Ejercio 4");
        int[]domin = {50000,20000,10000,5000,1000,500,100,50,25,10,5};
        System.out.println("El Vuelto Es: " + Lab4.atm(42750, domin, 0, 0));
        System.out.println("\n");

        
        //Ejercicio 5
        //System.out.println(Lab4.mcd(115, 90));
    }
}
