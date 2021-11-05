/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv.java;

import java.util.Scanner;

/**
 *
 * @author Nelson
 */
public class Lesson___seventh__17__LoopActivity {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);        
        int number;
        System.out.println("Type the number");
        number = read.nextInt();
        System.out.println(" ");
        
        System.out.println(number + "! =  ");                        
        int fatorial = 1;                        
        for(int i=number; i>0; i--){
            fatorial *=i;
            System.out.println(i);               
        }
        System.out.println("Resultado: " + fatorial);
        
        
        
    }
    
}
