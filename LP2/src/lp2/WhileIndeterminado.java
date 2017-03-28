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
//Vamos fazer uma repetição e o critério para eu sair da repetição é quando a nota for igual a "-1".
import java.util.Scanner;
public class WhileIndeterminado {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double somaDasNotas = 0;
    double nota = 0;
    int numeroDeNotas = 0;
    
    while (nota != -1){
        nota = input.nextDouble();
        
        //validação
        if(nota <= 10 && nota >= 0){
            somaDasNotas += nota;
            numeroDeNotas++;
        }
}
    input.close();
    System.out.printf("A média é %.2f", somaDasNotas / numeroDeNotas);
}
}