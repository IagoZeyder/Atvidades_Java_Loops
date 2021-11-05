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
public class Lesson___twelth__14__LoopsActivity {
    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        
        int number;
        int even/*(Par)*/ = 0;
        int odd/*(Impar)*/ = 0;
        for(int i=0; i<10; i++){
            System.out.print("Enter the number " +"(" + i +" )");            
            number = read.nextInt();     
            System.out.println("--------------------------------");
            if(number %2 ==0){
                even++;
                System.out.println(" ");
                System.out.println(" More one even" + "[ "+ even +" ]");
                System.out.println(" ");
            }
            else if(number % 2 !=0){
                odd++;
                System.out.println(" ");
                System.out.println(" More one odd" + "[ " + odd +" ]");
                System.out.println(" ");
            }
        }
        System.out.println("--------------------------------");
        System.out.println(" ");
        if(even > odd){      
        System.out.println(" Even wins!!");
        System.out.println(" ");
        System.out.println(" Amount even numbers is: " +"[ " +even+  " ]");
        System.out.println(" ");
        System.out.println(" Amount odd numbers is: " +"[ " +odd+  " ]");
        System.out.println(" ");
        }else if(odd > even){
        System.out.println(" Odd wins!!");
        System.out.println(" ");
        System.out.println(" Amount odd numbers is: " +"[ " +odd+  " ]");
        System.out.println(" ");
        System.out.println(" Amount even numbers is: " +"[ " +even+  " ]");
        System.out.println(" ");
        }
        
    }
}
