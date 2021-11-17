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
public class Lesson_Twenty_Nine_29_LoopsActivity {
    public static void main(String []args){
        /*Lesson_Twenty_Nine_29_LoopsActivity*/
        
        /*Faça um programa que gera uma lista dos número primos existentes entre 1
        e o número inteiro que o usuario digitar        
        */
        System.out.println("Lesson_Twenty_Nine_29_LoopsActivity");
        System.out.println(" ");
        Scanner read = new Scanner(System.in);
        System.out.println("Entre com o segundo numero");
        int num2 = read.nextInt();
        boolean primo;
        for (int i =1; i<=num2; i++){        
            primo = true;                               
            for(int j=2; j<i; j++){
                if(i % j==0){/* [j] sempre vai ser dois*/                
                primo = false;                        
                }                
            }                                                                
            if(primo){
                System.out.println(i);
            }
        }           
    }        
}
    

