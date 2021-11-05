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
public class lesson______08____LopsActivity {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int cont=1;
        int number = 0;
        double media;
        int sum = 0;
        System.out.println("[ Entering the values ]");
        System.out.println(" ");       
        for(int i=0; i<5; i++){            
            System.out.println("[ Type the numbers]: " +" [" +cont+"] ");
            cont++;
            number= read.nextInt();                                                                
            sum = sum + number;                                        
        }
        media = sum/5;        
        System.out.println("[Sum is ]: " + sum);    
        System.out.println("[Media is ]: " + media);    
    }
}