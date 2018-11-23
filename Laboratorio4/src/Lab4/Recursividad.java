/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Satellaizar
 */
public class Recursividad {
    
        //Metodo 2
    public static void invertir (int[] v, int first, int last) {
        if(first < last) {
          
        }else {
            int temp = v[first];
            v[first] = v[last];
            v[first] = temp;
            
            invertir(v,first+1 , last-1);
        }    
    }
    
    //Metodo Imprimir
    public static void print (int[] v) {
        for(int i: v) {
            System.out.print(i + " ");
        }
        
    }
}
