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
public class ConversaoNumerica {
    public static void main(String[] args) {
        //Exemplo 1 - Conversão explícita
        float f = (float)0.1;
        System.out.println(f);
        
        //Exemplo 2 - Conversão explícita
        int i1 = (int) 7.9;
        System.out.println(i1);
        
        //Exemplo 3 - Conversão implícita
        int i2 = 'h';
        System.out.println(i2);
        
        //Exemplo 4 - Conversão implícita
        double d = 1001;
        System.out.println(d);
    }
}
