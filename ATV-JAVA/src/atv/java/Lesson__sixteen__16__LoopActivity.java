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
public class Lesson__sixteen__16__LoopActivity {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int number1, number2, numberInte, lenght;
        
        System.out.println("Type the length: ");
        System.out.println(" ");
        numberInte = read.nextInt();
        System.out.println("Type the first number: ");
        number1 = read.nextInt();
        System.out.println("Type the second number: ");
        number2 = read.nextInt();
        
        System.out.println(number1);
        System.out.println(number2);
        while(numberInte <= 500){
            numberInte = number1 + number2;
            number1 = number2;
            number2 = numberInte;
            System.out.println(numberInte);
            
        }
                
    }    
        
        
    
}
