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
public class ATV3 {
    
    /*FAÇA UM PROGRAMA QUE LEIA E VALIDE AS SEGUINTES INFORMAÇÕES
    A- NOME: MAIOR QUE 3 CARACTERES
    B- IDADE: ENTRE 0 E 150
    C- SALÁRIO: MAIOR QUE ZERO
    D- SEXO: 'F' OU 'M'
    E- ESTADO CIVIL: 'S','C','V','D'
    */
    
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    
    boolean info = false;
    String Nome, Estado, Sexo;
    int Idade;
    double Salario;
    
    
    do{
        
        /*NOME-------------------------------------------------*/
        
    System.out.println("Digite seu nome: ");
    Nome = ler.next();
    
    
    if(Nome.length()/*LENGTH BOTA O TAMANHO DO TEXTO*/ > 3){
        info = true;
    System.out.println("feito ");
    System.out.println(" ");
    
    }else{
        info = false;
    System.out.println("Nome no minino 4 caracteres ");
    }
    }while(!info);
    
    /*IDADE-------------------------------------------------*/
    
    info = false;
    do{
    System.out.println("Digite sua idade : ");
    Idade = ler.nextInt();
    
    if(Idade >0 && Idade <150){
        info = true;
    System.out.println("feito");
    System.out.println(" ");
    
    }else{
        info = false;
    System.out.println("Idade tem que ser entre 0 e 100 ");
    }
    }while(!info);
    
    /*SALÁRO-------------------------------------------------*/
    
     info = false;
    do{
    System.out.println("Digite seu salário : ");
    Salario = ler.nextDouble();
    
    if(Salario >0){
        info = true;
    System.out.println("feito");
    System.out.println(" ");
    
    }else{
        info = false;
    System.out.println("O salário tem que ser maior [0]");
    }
    }while(!info);
    
    /*SEXO-------------------------------------------------*/
    
    info = false;
    do{
    System.out.println("Digite seu sexo: ");
    Sexo = ler.next();
    
    if(Sexo.equalsIgnoreCase("F") || Sexo.equalsIgnoreCase("M")){
        info = true;
    System.out.println("feito");
    System.out.println(" ");
    
    }else{
        info = false;
    System.out.println("O sexo precisa ser: [S] ou [M]");
    }
    }while(!info);
    
    /*ESTADO CIVIL-------------------------------------------------*/
    
    info = false;
    do{
    System.out.println("Digite seu estado civil: ");
    Estado = ler.next();
    
    if(Estado.equalsIgnoreCase("S") || Estado.equalsIgnoreCase("C")
       || Estado.equalsIgnoreCase("V")|| Estado.equalsIgnoreCase("D")){
        info = true;
    System.out.println("feito");
    System.out.println(" ");
    
    }else{
        info = false;
    System.out.println("O estado civil precisa ser: [S], [C], [V] OU [D]");
    }
    }while(!info);
    
    System.out.print("TABELO COMPLETA");
    System.out.println(" ");
    System.out.print("--------------------------------");
    System.out.print(" ");
    System.out.println(" ");
    System.out.println(Nome);
    System.out.println(" ");
    System.out.println(Idade);
    System.out.println(" ");
    System.out.println(Salario);
    System.out.println(" ");
    System.out.println(Sexo);
    System.out.println(" ");
    System.out.println(Estado);
    System.out.print("--------------------------------");
    
    
    
    
    
    }
    
    
}
