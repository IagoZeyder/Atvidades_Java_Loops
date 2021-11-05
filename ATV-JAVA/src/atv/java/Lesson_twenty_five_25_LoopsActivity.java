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
public class Lesson_twenty_five_25_LoopsActivity {
    public static void main(String[]args){
        /* O Sr. Manoel Joaquin expandiu seus negocio para alem dos negocios de
        1,99 e agora possui uma das lojas de coveniência. Faça um programa que 
        implemente uma caixa registradora rudimentar. O programa deverá receber
        um número deseconhecido de valores referentes aos preços das mercadirias.
        Um valor zero deve ser informado pelo operador para indicar o final da
        compra. O programa deve então mostrar o total da compra e perguntar o valor
        em dinheiro que o cliente forneceu, para entao  calcular e mostrar o valor
        do troco. Após esta operação, o programa deverá voltar ao ponto inicial,
        para registrar a proxima compra. A saída deve ser conforme o exemplo abaixo
        [Loja Tabajara]
        produto 1: R$ 2.20
        produto 2: R$ 5.0
        Total: R$ 7.20
        Dinheiro: R$ 20.0
        Troco: 10.80        
        */
        
        Scanner read = new Scanner(System.in);
        System.out.println("Lojas Tabajara");
        System.out.println(" ");
        double quantidadeCompra = 0;
        double preco;
        double valorTotal;
        boolean sair = false;
        double troco = 0;
        double valorPagar = 0;
        String continuarCompra;
        String output;   
        do{            
            System.out.print("Deseja Realizar a compra [ S/N ]");
            continuarCompra = read.next();
            if(continuarCompra.equalsIgnoreCase("s")){
                System.out.println("Digite a quantidade de produtos da compra: ");
                quantidadeCompra= read.nextDouble();
                System.out.println(" ");
                valorTotal = 0;
                for(int i=1; i<=quantidadeCompra; i++){
                    System.out.println("Informe o valor do produto");
                    preco = read.nextDouble();
                    System.out.println(" ");
                    preco += preco;
                    valorTotal += preco;
                    output = "Produto" + i + ": R$" + preco + "\n";
                }
                do{
                System.out.println("Valor total da compra" + "[ " + valorTotal + " ]");
                System.out.println("Seu pagameno");  
                valorPagar = read.nextDouble();
                if(valorPagar >= valorTotal){
                    troco = valorTotal - valorPagar;
                    sair = true;
                    
                }
                else{
                    System.out.println("Valor insuficiente");
                }
                    
             }while(sair = false);
            }
            else{
                sair = true;                
            }            
        }
        while(sair = false); 
        
        System.out.print(" Valor total da compra é"+"[ "+ valorTotal +" ]");
        System.out.print("Seu pagamento é:" + valorPagar);
        System.out.print("Seu troco é"+ troco);
        
        
        
    }
    
}
