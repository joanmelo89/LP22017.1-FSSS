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
public class WhileDeterminado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somaDasNotas = 0;
        double nota = 0;
        int indice = 0;
        while (indice < 3){
            nota = input.nextDouble();
            somaDasNotas += nota;
            indice++;
     
        }
        input.close();
        System.out.printf("A média é %.2f", somaDasNotas / 3);
    }
}
