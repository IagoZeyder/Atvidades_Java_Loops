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
public class Lesson___eighteen__18__LoopsActicity {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int number;
        boolean primo = true;
        System.out.print("Enter the number: ");
        number = read.nextInt(); 
        System.out.print(" ");
        
        for(int i=2; i<number; i++){
            if(number % i ==0){
                System.out.println("Nao é primo, divisivel por " + "[ " +i+" ]");
                primo = false;
            }            
            }
        if(primo){
                System.out.println("É primo");                                        
            }
        }
    }
