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
public class Lesson_Twenty_20___LoopsActivity {
    public static void main(String[]args){
        /*Faça um programa  que peça para N pessoas  e sua idade, ao final o programa
        devera verificar se a média de idade da turma varia entre 0 e 25,26 e  60;
        e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada     
        */
        Scanner read = new Scanner(System.in);
        System.out.println("Numero de pessoas");
        double numPessoas = read.nextInt();
        int idade;
        int soma = 0;
        for(int i=0; i<numPessoas; i++){
            System.out.println("Entre com a idade");
            idade = read.nextInt();
            soma+=idade;            
        }
        
        double media = soma / numPessoas;
        System.out.println("Media é: " + media);
        if(media >=0 && media <=25.9){
            System.out.println("Jovem");
        }
        else if(media >=26 && media <=60.9){
            System.out.println("Adulto");
        }
        else if(media > 60.9){
            System.out.print("Idoso");
            }
    
    }
    
}
