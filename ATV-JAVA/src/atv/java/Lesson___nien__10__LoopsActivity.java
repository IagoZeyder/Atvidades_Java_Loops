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
public class Lesson___nien__10__LoopsActivity {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        
        System.out.println("[ Type the first number ]: ");
        int number1 = read.nextInt();
        System.out.println(" ");
        
        System.out.println("[ Type the first number ]: ");
        int number2 = read.nextInt();
        System.out.println(" ");
        
        System.out.println("[ Between number " + "[ " + number1+ " ]" + "and number " + "[ " + number2 + " ]" + " is ]:");
        System.out.println(" ");
        
        for(int i = number1+1; i<number2; i++){
            System.out.print(i + " ");
        }
        
        
        
        
    
    }
}
