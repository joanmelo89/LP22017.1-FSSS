/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author joan-
 */
import java.util.Scanner;
public class Questao2 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do numero do somatório");
        int numero = scan.nextInt();
        System.out.println(CalculadoraEx.somatorio(numero));
    }
}
