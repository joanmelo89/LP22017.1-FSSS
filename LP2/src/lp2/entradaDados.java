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

//biblioteca responsável por fazer a leitura 
// de entrada de dados do usuário
import java.util.Scanner;
public class entradaDados {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n1;
        int n2;
        int soma;
        
        System.out.println("Digite o primeiro valor");
        n1 = input.nextInt();
        System.out.println("Digite o segundo valor");
        n2 = input.nextInt();
        
        soma = n1 + n2;
        
        System.out.printf("O resultado é: \n%d", soma);
    }
    
}
