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
public class Lesson__twenty_one__21__ActivitylLoops {
    public static void main(String[]args){
        /* Faça um programa que calcule o número médio de alunos por turma.
        Para isto, peça a quantidade de turmas e a quantidade de aluno para cada
        turma. As turmas nã podem ter mais de 40 alunos*/
        
        Scanner read = new Scanner(System.in);
       System.out.println("Digite o numero de turmas: ");               
       int numeroTurmas = read.nextInt();
       System.out.println("Numero de turmas é: " + numeroTurmas);
       int numeroAlunos;
       int soma = 0;
       boolean invalido = true;
       
       for(int i=1; i <= numeroTurmas; i++){
           invalido = true;
           do{
           System.out.println("Quantidades de alunos da turma: " +"[ " + i + " ]");
           numeroAlunos = read.nextInt();
           if(numeroAlunos <= 40){
               invalido = false;
               System.out.println("Concluido");                           
               System.out.println(" ");                           
           }
           else{
               
               System.out.println("Passou da quantidade");                                                                                        
           }
           }
           while(invalido);
               soma += numeroAlunos;
       }
       double media = soma / numeroTurmas;
       System.out.println("Soma dos alunos é: " + soma);
       System.out.println("Média de Aluno é: " + media);
       
    }
}

           

  
    

