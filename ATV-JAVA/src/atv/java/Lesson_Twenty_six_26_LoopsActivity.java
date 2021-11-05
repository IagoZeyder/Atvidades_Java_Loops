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
public class Lesson_Twenty_six_26_LoopsActivity {
    public static void main(String[]args){
        /* Lesson_Twenty_six_26_LoopsActivity */
        
        /*Faça um programa que calcule o fatorial de um numero inteiro fornecido
        pelo usuario. EX: 5!=5,4,3,2,1=120. A saída deve ser assim
        */
    
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o valor para fazer a fatoração");
        Double valor = read.nextDouble();
        System.out.println("Fatorial de: " +valor);
        System.out.println(valor +"! = ");
        System.out.println(" ");
        Double fatorial = 1.0;
        for(double i=valor; i>=1; i--){
            fatorial*=i;
                       System.out.println(i+ " . " +valor);               
        }
        System.out.println("fatorial: "+ fatorial);
    } 
                              
}
