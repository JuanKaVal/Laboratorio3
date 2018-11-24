
package Lab4;

/**
 *
 * @author Satellaizar
 */
public class Test {
    
        public static void main(String[] args) {

        int[] test = {1,2,3,4,5};
        Lab4.invert(test, 0, test.length-1);
        //Lab4.print(test);
            System.out.println(Lab4.binaryToDecimal(10, 0));
        
        int[]domin = {50000,20000,10000,5000,1000,500,100,50,25,10,5};
        System.out.println(Lab4.atm(42750, domin, 0, 0));
    }
}
