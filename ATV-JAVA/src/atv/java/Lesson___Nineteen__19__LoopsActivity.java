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
public class Lesson___Nineteen__19__LoopsActivity {
    public static void main(String[]args){
    //FAÇA UM PROGRAMA QUE CALCULE E MOSTRE A MÉDIA ARITMÉTRICA DE N NOTAS
        Scanner read = new Scanner(System.in);
        System.out.println("Entre com as notas dos aluno: ");
        int notas = read.nextInt();
        double nota;
        double soma = 0;
        double media;
    
        for(int i=0; i<notas; i++){
            System.out.println("Entre com a nota: " +(i+1));
            nota  = read.nextDouble();
            soma+=nota;            
        }
        
        media = soma / notas;
        System.out.println("Soma: "+ soma);
        System.out.println("Media: "+ media);
        
    }
}
