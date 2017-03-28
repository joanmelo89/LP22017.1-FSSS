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
public class exemplo2For {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);{
      int i;
      int cds;
      double soma = 0;
      double preco;
      double media;
      System.out.println("Digite a quantidade de CDs:");
      cds = input.nextInt();
      for(i = 1; i <= cds; i++){
          System.out.println("Digite o valor do CD "+i);
          preco = input.nextDouble();
          soma += preco;
      }
      media = soma / cds;
      System.out.printf("O valor da média dos preços dos CDs é %.2f",media);
      
      
    }
}
}