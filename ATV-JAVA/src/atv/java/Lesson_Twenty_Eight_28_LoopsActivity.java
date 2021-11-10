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
public class Lesson_Twenty_Eight_28_LoopsActivity {
    public static void main(String[]args){
     /*Lesson_Twenty_Eight_28_LoopsActivity*/
     
     /* Os número primos possuem várias aplicações dentro da Computação, por 
     exemplo na criptografia. Um número primo é aquele que é divisivel apenas 
     por um e por ele mesmo. Faça um programa que peça um número inteiro e deter-
     mine se ele é ou não um número primo.                   
     */
     
     Scanner read = new Scanner(System.in);
     System.out.println("Digite um numero primo");
     boolean primo = true;
     Double numberPrimo = read.nextDouble();
     if(numberPrimo % 2 == 0 ){
         System.out.println(numberPrimo +" Não é um número primo");         
         primo = false;
     }
     else if(numberPrimo % 2 != 0){
         System.out.println(numberPrimo + " é um número primo");         
         primo = true;
     }                                                                
    }           
}
