/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv.java;

import java.util.Scanner;

public class Lesson____7 {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int var[];
        int number;
        int higherNumber = 0;
        for(int i=1; i<=5; i++){//If [i](i=0) be smallest 5 so [i] = [i]+1
            System.out.println("[ Type a number]:  ");
            number = read.nextInt();
            if(number > higherNumber){//If [number] be smallest [higherNumber](0) so                                        
                higherNumber = number;//HigherNumber will be equals the number
            }
        }
        System.out.print("[The higherNumber is]:" + "[ "+higherNumber+" ]" + " ");
    }
    
}
