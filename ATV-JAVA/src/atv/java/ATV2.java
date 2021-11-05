package atv.java;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nelson
 */
public class ATV2 {
    
    /*FAÇA O USUARIO DIGITAR A SUA SENHA E USUARIO, E USUARIO E SENHA NAO PODEM SER IGUAIS*/
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String Senha;
        String NomeUser;
        boolean Info = false;
        do{
            
            System.out.print("Entre com senha so usuário: ");
            NomeUser = scanner.next();
            System.out.print("Digite sua senha: ");
            Senha = scanner.next();
            
            if(NomeUser.equalsIgnoreCase(Senha)){
                Info = false;
            System.out.print("Senha igual ao usuário, digite novamente");
            
            }else{
                Info = true;
            System.out.print("Senha e Usuário válidos");
            }
            
        }while(!Info);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
