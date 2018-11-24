/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Edwin Molina, Juan Carlos Valverde
 */
public class Lab4 {
    
    //Metodo 1
    public static int binaryToDecimal (int number, int counter) {
        if(number == 0) {
            return number;
        }else{
            return ((int)Math.pow(2, counter)) + binaryToDecimal((number/10), (counter+1));
        }
    }
    
    
    //Metodo 2
    public static void invert (int[] v, int first, int length) {
        
        if(first > length) {
          
        }else {
            
            int temp = v[first];
            v[first] = v[length];
            v[length] = temp;          
            invert(v,first+1, length-1);
        }    
    }
    
    //Método 3
    public static void print (int[] v) {
        for(int i: v) {
            System.out.print(i + "");
        }
    }
    
    //Metodo 4
    public static String atm(int total, int[] domin, int count, int index) {
        if (index == domin.length) {
            return "";
        }
        if (total >= domin[index]) {
            return atm(total - domin[index], domin, count + 1, index);
        }
        
        if (count != 0) {
            return "\n" + count + ":" + domin[index] + atm(total, domin, 0, index + 1);
        }
        return atm(total, domin, count, index + 1);
    }

    //Método 5
    public static int mcd(int numr1, int numr2) { 
        if (numr1 == numr2) {
            return numr1;
        }
        
        if (numr1 > numr2) {
           return mcd(numr1 - numr2, numr2);
        }
        
        if (numr1 < numr2) {
           return mcd(numr1, numr2 - numr1);
        }
        return numr1;
    }
}
