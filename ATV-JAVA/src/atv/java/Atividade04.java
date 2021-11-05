/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv.java;

/**
 *
 * @author Nelson
 */
public class Atividade04 {
    public static void main(String[] args){
        int populationA = 80000; /*Population[A]*/
        int populationB = 200000;/*Population[B]*/
        int countingCity = 0;
        
        while(populationA < populationB){ 
            populationA += (populationA/100) * 3;
            populationB += (populationB/100) * 1.5;            
            countingCity++; /*counting how many days are left*/ 
        }
        System.out.println("Population [ A ]: " +"[ " + populationA+ " ]");
        System.out.println("Population [ B ]: " +"[ " + populationB+ " ]");
        System.out.println("How manu days are left: "+"[ " + countingCity+" ]");
        
    }
    
}
