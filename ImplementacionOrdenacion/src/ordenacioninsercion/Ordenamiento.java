/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacioninsercion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MoisesDario
 */
public class Ordenamiento {
    public static void main(String[] args){
              
        Random r = new Random();
        MetodoInsercion insercion = new MetodoInsercion();
        ArrayList<Integer> temp = new ArrayList<>();
        int random;
        
        System.out.println("Ordenados numeros -------- Insercion");
        for(int i=100; i>0; i--){
            random = r.nextInt(500);
            temp.add(random);
        }
        System.out.println(insercion.ordenarInsercion(temp,true));
        System.out.println("\n");
        System.out.println("Desordenados numeros -------- Fisher-Yates");
        random = r.nextInt(500);

        temp.add(random);
        System.out.print(insercion.desordenarFisher(temp, true));     
    }    
}
