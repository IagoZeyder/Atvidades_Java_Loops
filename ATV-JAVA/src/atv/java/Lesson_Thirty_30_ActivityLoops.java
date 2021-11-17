/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv.java;

import java.util.Scanner;

/**
 *
 * @author paren
 */
public class Lesson_Thirty_30_ActivityLoops {
    public static void main(String[]args){
        /*Lesson Thirty 30*/
        
        /* Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será 
        digitado pelo usuário, mas a tabuada não deve necessariamente inciar em 1 e terminar
        em 10, o valor inicial e final devem ser informados também pelo usuário, exemplo 
        abaixo: 
        
        -Montar a tabuada de: 5;
        -Começar por: 4 
        -Terminar em: 7        
        */
        System.out.println("Lesson 30");                        
        System.out.println(" ");                        
        Scanner read = new Scanner(System.in);        
        double num1,calInicial,calFinal;;        
        boolean valido = false;
        System.out.println("Numero a ser calculao: ");                        
        num1 = read.nextDouble();
        
        do{
            System.out.println("Numero inicial");                        
            calInicial = read.nextDouble();
            System.out.println("Numero final ");                        
            calFinal = read.nextDouble();
            if(calInicial > calFinal){
             valido = false;
             System.out.println("o incial não pode ser maior que o final. ");                     
            }
            else{ 
            for(double i = calInicial; i<=calFinal; i++){
            System.out.println("[ "+ num1+" ]"+" * "+"[ "+i+ "] "+" = "+"[ " + num1 * i+" ]");                        
            }
            break;
            }            
        }
        while(valido = true);                                                 
        /*for(double i = calInicial; calFinal<=i; calFinal++){
            System.out.println("[ "+ num1+" ]"+" * "+"[ "+calFinal+ "] "+" = "+"[ " + num1 * calFinal+" ]");                                    
        } */                          
        /*for(double i = calInicial; i>=calFinal; i--){
            System.out.println("[ "+ num1+" ]"+" * "+"[ "+i+ "] "+" = "+"[ " + num1 * i+" ]");                                    
        } */                          
    }    
}
