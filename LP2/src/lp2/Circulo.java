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
import java.util.Scanner;
public class Circulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double pi = 3.1416;
        double raio;
        double area;
        
        System.out.println("Digite o valor do raio:");
        raio = input.nextDouble();
        
        area = pi * raio * raio;
        
        System.out.printf("O valor da área é: %.2f", area);
    }
    
}
