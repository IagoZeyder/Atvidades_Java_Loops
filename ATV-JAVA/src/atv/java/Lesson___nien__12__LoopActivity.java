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
public class Lesson___nien__12__LoopActivity {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int number, calculater;;
        
        System.out.println("Enter a number to genarate the multiplication table");
        number = read.nextInt();
        System.out.println(" ");
        System.out.println("The math table of " +number+" is: ");
        
        for(int i =1; i<=10; i++){
            calculater = number * i;
            System.out.println(number+" x " + i + " = " + calculater);
            calculater = 0;
        }
        
        
            
        
    }
    
}
