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
public class Lesson_Twenty_Seven_27_LoopsActivity {
    public static void main(String[]args){
        /*Lesson_Twenty_Seven_27_LoopsActivity*/
        
        /* O departamento Estatual de Meteorologia lhe contratou para desenvolver 
        um programa que leia as um conjunto inderteminado de temperaturas e 
        informe ao final a menor e a maior temperaturas informadas, bem como a 
        média das temperaturas                
        */
        
        Scanner read = new Scanner(System.in);
        System.out.println("Quantidade De temperatura: ");
        double quantTemp = read.nextDouble();
        double temperatura;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double media;
        for(int i=1; i<=quantTemp;i++){
            System.out.println("Temperatura" +" [ " + i + " ]");
            temperatura = read.nextDouble();
            soma+=temperatura;
            if(temperatura > maior){
                maior = temperatura;
            }
            if(temperatura < menor){
                menor = temperatura;
            }                
        }        
        media = soma/quantTemp;
        System.out.println("Media: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        
    }
}