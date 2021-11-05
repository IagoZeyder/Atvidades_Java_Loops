/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nelson
 */
public class Calculadora {
    private int a;
    private int b;
    
    public int calculadora(){        
        
    }
    public Calculadora(int a, int b){
    this.a =a;
    this.b=b;
    }
    public int calcula(int x, int y){
        return y + x;        
    }
    public double calcula(double x, double y){
        return x + y;
    }
    public String  calcula(String x, String y){
        return x + y;
    }
    
    
}
