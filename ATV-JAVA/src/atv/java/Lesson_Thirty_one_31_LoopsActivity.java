/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv.java;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author paren
 */
public class Lesson_Thirty_one_31_LoopsActivity {
    public static void main(String[]args){
               /*Lesson thirty-one 31*/
        /* Um funcionário de uma empresa recebe aumento salarial anuamente 
            sabe-se que:
               Esse funcionário foi contratado em 1995, com salário incial de 
               R$ 1.000,00;
               a) Em 1996 recebeu aumento de 1,5% sobre seu salário inincial;
               b) A partir de 1997 (inclusive), os aumentos saláriais sempre 
               correspondem ao dobro do percentual do ano anterior, faça um programa
               que determine o salário atual desse funcionário. Apos concluir isto
               , altere o programa permitindo que o usuário digite o salario inicial 
               do funcionário
               */
        Scanner read =  new Scanner(System.in);   
        DecimalFormat format = new DecimalFormat("#,###.###");
        double salario = 1000;
        double percentual = 1.5;
        salario+= (salario/100)*percentual;
        for(int i=1997; i<2021; i++){
            percentual *= 2;
            salario +=(salario/100)*percentual;
            System.out.println(i+" = " + format.format(salario) + " - " + percentual + "%");
            
        }
    
    
    }
    
}
