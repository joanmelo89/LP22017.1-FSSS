/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

/**
 *
 * @author Joan
 */
public class OperadoresUnarios {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        
        //Incremento e Decremento
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);
    
        System.out.println(num1 == num2);
        System.out.println(num2 != num2);
        
        //Negação
        System.out.println(!false);
    }
    
}
