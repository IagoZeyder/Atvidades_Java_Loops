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
public class ATVJAVA1 {

    /* USUARIO TEM QUE DIGITAR UMA NOTA ENTRE 0 E 10, E ELE SO PODE DIGITAR ISSO
    CASO NÃO DIGITE UMA NOTA ENTRE 0 E 10 MOSTRE UMA MENSAGEM
    ATÉ QUE ELE DIGITE UMA NOTA ENTRE 0 E 10*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); /*IMPORTAÇÃO PARA LER*/
        boolean notaValida = false;
        
        System.out.println(" Validador De Nota");
        
        
        
        do {
        
        System.out.println(" Entre com uma nota entre 0 e 10");
        
        double Nota = scanner.nextDouble(); /*LER O QUE VAI SER DIGITADO EM DOUBLE*/
        
        if(Nota >=0 &&/*(<------AND OU E)*/ Nota <= 10){
            notaValida = true;
           System.out.println("Você digitou: " + Nota);
        
        }else{
           notaValida = false; 
            System.out.println("Você digitou: " + Nota + " que é uma nota invalida");
        }
        }    
    
       while(!notaValida);
    }
}
