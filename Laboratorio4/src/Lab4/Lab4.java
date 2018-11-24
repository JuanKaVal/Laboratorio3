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
            System.out.print(i + " ");
        }
    }
    
    //Metodo 4
    public static String atm(int total){
        int[]domin = {50000,20000,10000,5000,1000,500,100,50,25,10,5};
        return atm(total, domin, 0, 0);
    }
    
    public static String atm(int total, int[] domin, int count, int index) {
        if (index == domin.length) {
            return "";
        }
        
        if (total >= domin[index]) {
             return atm(total - domin[index], domin, count + 1, index);
        }
        
        if (count != 0) {
             return count + ":" + domin[index] + "\n" + atm(total, domin, 0,index+1);
        }
        return atm(total, domin, count, index + 1);
    }
        
    
    //Método 5
    
 

}
