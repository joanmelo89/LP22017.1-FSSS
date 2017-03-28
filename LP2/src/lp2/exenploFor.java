/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

import java.util.Scanner;

/**
 *
 * @author Joan
 */
public class exenploFor {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somaDasNotas = 0;
        double nota = 0;
        int indice = 0;
        for (indice = 0;indice < 3; indice++){
            nota = input.nextDouble();
            somaDasNotas += nota;
            
     
        }
        input.close();
        System.out.printf("A média é %.2f", somaDasNotas / 3);
    }
}
   




