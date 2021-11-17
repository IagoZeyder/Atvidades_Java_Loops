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
public class Lesson_thirty_two_32_LoopsActivity {
    public static void main(String args[]){
        /*Lesson_thirty_two_32*/
        
        /*Faça um programa que leia o codigo dos itens pedidos e as quantidades
        desejadas. Calcule e mostre o valor a ser pago por intem (preço *quantidade)
        e o total geral pedido. Considere que o cliente deve informar quando o 
        pedido deve ser encerrado.                
        */
        
        Scanner read = new Scanner(System.in);
        boolean naoTerminar = true;
        int codigo, quantidade;
        int total = 0;
        String output=" ";
        do{
            System.out.println("Digite o código e a quantida, Digite 'sair' para sair");
            codigo = read.nextInt();
            quantidade = read.nextInt();
            
            if(codigo == 0 && quantidade == 0 ){
                naoTerminar = false;
                output += "Total a pagar = " + total;
                
            }
            else if(codigo == 100){
                output +="Cachorro quente: 1.20*"+ quantidade;
                output+= " = "+ (1.20*quantidade)+"\n";                            
                total +=1.20;
            }
            else if(codigo == 101){
                output+="Bauro simple: 1,30 * " + quantidade;
                output+=" = "+(1.30*quantidade)+"\n";                            
                total +=1.30;
            }
            else if(codigo == 102){
                output+="Bauro com ovo: 1,50 * " + quantidade;
                output+=" = "+(1.50*quantidade)+"\n";                            
                total +=1.50;
            }
            else if(codigo == 103){
                output+="Hamburguer: * 1.20" + quantidade;
                output+=" = "+(1.20*quantidade)+"\n";                            
                total +=1.20;
            }    
            else if(codigo == 104){
                output+="Cheeseburguer: * 1.30" + quantidade;
                output+=" = "+(1.30*quantidade)+"\n";                            
                total +=1.30;
            }    
            else if(codigo == 105){
                output+="Refri: * 1" + quantidade;
                output+=" = "+(1*quantidade)+"\n";                            
                total +=1;
            }                            
        }
        while(naoTerminar);
        System.out.println(output + total);
           
    }    
}
