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
public class Lesson__Twenty_Two_22__loopsActivity {
    public static void main(String [] args){
        /*                  [QUESTAO (22)]                                    */
        /* Faça um programa que calcule o valor total investido por um colecionador
        e sua coleção de CDS e o valor medio gasto em cada um deles. O usuário 
        deverá informar a quantidade de CDS e o valor para cada um deles. */
        
        Scanner read = new Scanner(System.in);
        System.out.println("Entre com o número de CDS");
        int numCDS = read.nextInt();
        double valorCDS;
        double soma = 0;
        
        for(int i=0; i <numCDS; i++){
            System.out.println("Valor do CD " +"[ " + i + " ]");
            valorCDS = read.nextDouble();
            soma += valorCDS;                        
        }
        double media = soma / numCDS; 
        media = (media * 100)/100;
        
        System.out.println("Soma: " + soma);        
        System.out.println(" ");
        System.out.println("Média: " + media);
        System.out.println(" ");
        
        
    }
    
}
