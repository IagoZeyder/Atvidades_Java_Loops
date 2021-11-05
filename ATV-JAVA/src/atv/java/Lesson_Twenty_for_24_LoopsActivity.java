/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv.java;

/**
 *
 * @author paren
 */
public class Lesson_Twenty_for_24_LoopsActivity {
    public static void main(String []args){
        /* O Sr. Manoel Joaquin acaba de adquirir uma panificadora e pretende 
        implantar a metodologia  da tabelinha, que ja é suacesso  na sua loja 
        de 1,99. Você foi contratado para desenvolver o programa que monta 
        a tabela de preços de pães, de 1 até 50 pães, a partir do pão informado 
        pelo usuário, conforme o exemplo abaixo:
        [preço do pão: R$ 0.18]
        Tabela de preços
        1 - R$ 0.18
        2 - R$ 0.36
        ....
        50 - R$ 9.00                
        */
        System.out.print("Preço do pão: 0.18");
        System.out.print(" ");
        System.out.print("tabela de preços");
        double valorPao = 0;
        for(int i = 1; i<=50; i++){
            valorPao += 0.18;            
            System.out.println("[ "+ i +" ]" + " pão: R$ " +(valorPao*100)/100);
            
            
        }
            
        
        
        
    }
    
}
