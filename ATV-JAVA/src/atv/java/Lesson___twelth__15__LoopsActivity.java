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
public class Lesson___twelth__15__LoopsActivity {
    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        
        int number1, number2, numberInter, lenght;
        System.out.print("Enter the lenght number: ");
        lenght = read.nextInt(); //Intermediate number
        System.out.print("Enter the first number: ");
        number1 = read.nextInt();
        System.out.print("Enter the Second number: ");
        number2 = read.nextInt();
        System.out.println(" ------------------------- ");
        System.out.println(" ");        
        
        /*The inteiro(i) is equals the [3] because number
        and number2 starts with
        NumberInter is the sum between number1  and number2    
        Number1 is equals the number2
        Number2 is equals the numberInter*/
        System.out.println( number1);
        System.out.println(number2);        
        for(int i=3; i<=lenght; i++){
            numberInter = number1 + number2;   
            number1 = number2; 
            number2 = numberInter; 
            System.out.println( numberInter);                                    
        }
        
        
        
        
        
        
    
    }
    
}
