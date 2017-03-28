/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author joan-
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        
        for(int i=0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição: "+ i);
            vetorA[i] = input.nextInt();
            
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
          System.out.print("Vetor A = ");
        for(int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        //FORMATAÇÃO DE DECIMAL
        DecimalFormat df = new DecimalFormat("###,###.##");
        
         System.out.print("Vetor B = ");
        for(int i=0; i < vetorA.length; i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }
        System.out.println();
    }
}

