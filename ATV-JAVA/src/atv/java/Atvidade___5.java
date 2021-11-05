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
public class Atvidade___5 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in); /*Code to read what will be typed*/
        boolean valid = false;
        /*Population[A], Population[B]*/        
        double populationA;
        double populationB;
        double rateA = 0;
        double rateB = 0;                
        
        
        /*-----------------PopulationA Code A------------------------*/
        do{/*Do that parameters*/
            System.out.println("Type the population[ A ] number: ");            
            populationA = read.nextDouble(); /*reading what will be typed*/
            if(populationA > 0){
                valid = true;/*When valid equals a true, the loop is [finished]*/             
            }            
            else{
                System.out.println("Population number need greater than zero[ 0 ]: ");                                        
            }
        }
        while(!valid);/*While [valid] is true*/
        
        valid = false;
                /*-----------------PopulationB Code ------------------------*/
        do{/*Do that parameters*/
            System.out.println("Type the population[ B ] number: ");            
            populationB = read.nextDouble(); /*reading what will be typed*/
            if(populationB > 0){
                valid = true;/*When valid equals a true, the loop is [finished]*/                         
            }            
            else{
                System.out.println("Population number need greater than zero[ 0 ]: ");                                        
            }
        }
        while(!valid);/*While valid is true*/
        
        valid = false;
        /*-----------------RateA Code ------------------------*/
        do{/*Do that parameters*/
            System.out.println("Population[ A] rate: ");            
            rateA = read.nextDouble(); /*reading what will be typed*/
            if(rateA > 0){
                valid = true;/*When valid equals a true, the loop is [finished]*/                         
            }            
            else{
                System.out.println("Rate number need greater than zero[ 0 ]: ");                                        
            }
        }
        while(!valid);/*While valid is true*/
        
        valid = false;
        /*-----------------RateB Code ------------------------*/
        do{/*Do that parameters*/
            System.out.println("Populati80on[ B ] rate: ");            
            rateB = read.nextDouble(); /*reading what will be typed*/
            if(rateB > 0){
                valid = true;/*When valid equals a true, the loop is [finished]*/                         
            }            
            else{
                System.out.println("Rate number need greater than zero[ 0 ]: ");                                        
            }
        }
        while(!valid);/*While valid is true*/
        
        int countingCity = 0;        
         /*Couting how many days are left*/
        while(populationA < populationB){
            populationA=populationA+(populationA/100)*rateA;
            populationB=populationB+(populationB/100)*rateB;
            populationA = (populationA*100)/100;
            populationB = (populationB*100)/100;
            countingCity++;
            
            /*
            populationA = (populationA/100)*100;
            populationB = (populationB/100)*100;
            */
        }
                       
        System.out.println("Population [ A ]: " +"[ " + populationA+ " ]");
        System.out.println("Population [ B ]: " +"[ " + populationB+ " ]");
        System.out.println("How manu days are left: "+"[ " + countingCity+" ]");
        
              
    }
    
}
