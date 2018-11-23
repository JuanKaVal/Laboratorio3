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
    
    
    
    //Metodo 2
    public static void invert (int[] v, int first, int last) {
        
        if(first > last) {
          
        }else {
            
            int temp = v[first];
            v[first] = v[last];
            v[last] = temp;          
            invert(v,first+1, last-1);
        }    
    }
    
    //Método 3
    public static void print (int[] v) {
        for(int i: v) {
            System.out.print(i + " ");
        }
    }
    //Metodo 4
    public static String atm(int mount) {
        
        
        return "";
    }
    
    
    //Método 5
    
 

}
