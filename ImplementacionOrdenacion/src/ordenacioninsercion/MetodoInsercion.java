/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacioninsercion;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author MoisesDario
 */
public class MetodoInsercion <T extends Comparable <T>>{
    
    public ArrayList<T> ordenarInsercion(ArrayList<T> array, boolean d){     
        T aux;
        int iter=0;
        for (int i = 1; i < array.size(); i++) {
            aux = array.get(i);
            for (int j = i-1; j >=0 && array.get(j).compareTo(aux)> 0; j--) {
                array.set(j+1,array.get(j));
                array.set(j,aux);
            }
            if (d){
                iter++;
            }
        }
        System.out.println("");
        //System.out.println("------> Iteraciones: " + iter);
      
        return array;
    }
    
    public ArrayList<T> desordenarFisher(ArrayList<T> array, boolean b){
        Random r = new Random();
        int cantidad = array.size();
        int az,k;
        int iter=0;
        
        for(int a=array.size(); a >=1; a--){
            for(k=cantidad-1; k > 0; k--){
                az = k + r.nextInt(cantidad - k);
                T tmp = array.get(az);
                array.set(az, array.get(k));
                array.set(k,tmp); 
            } 
            if(b)  
                iter++;
        }    
        System.out.println("");
        //System.out.println("------ > Iteraciones: " + iter++); 
        
        return array;
    }
}
