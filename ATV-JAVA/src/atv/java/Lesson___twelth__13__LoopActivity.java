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
public class Lesson___twelth__13__LoopActivity {
    public static void main(String[]args){
        Scanner read =  new Scanner(System.in);
        double number1Base = 0;
        double number2Height = 0;         
        double result;
        System.out.print("Enter with the first number[base]: ");
        number1Base = read.nextDouble();
        result = number1Base;
        System.out.println(" ");
        System.out.print("Enter with the second number[power]: ");        
        number2Height = read.nextDouble();
        System.out.println(" ");
        for(int i = 1; i<=number2Height; i++){
            result = result * number1Base;            
        }
        System.out.println("Reult is: " + result);
        
    }
}
