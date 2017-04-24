/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Student
 */
public class Kalkulator {
/**
 * 
 * @param a
 * @param b
 * @return 
 */
    public static int wykonajDodawanie (int a, int b){
        return a+b;
    }
    /**
     * 
     * @param a
     * @param b
     * @return 
     */
    public static int wykonajOdejmowanie (int a, int b){
        return a-b;
    }
    /**
     * 
     * @param a
     * @param b
     * @return 
     */
    public static int wykonajMnozenie (int a, int b){
        return a*b;
    }
    /**
     * 
     * @param a
     * @param b
     * @return 
     */
    public static int wykonajDzielenie (int a, int b){
        return a/b;
    }
    /**
     * 
     * @param x
     * @return 
     */
    public static int wykonajPotegowanie (int x){
        return x*x;
    }
    /**
     * 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public static float obliczDelte (int a, int b, int c){
    float delta;
    delta = (b*b)-(4*(a*c));
    return delta;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
