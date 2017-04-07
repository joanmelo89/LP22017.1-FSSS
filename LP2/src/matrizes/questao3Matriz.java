/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

/**
 *
 * @author joan-
 */
import java.util.Scanner;
public class questao3Matriz {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];
        
        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                
                System.out.println("Entre com o valor da pos [" + i + "," + j + "]");
                numeros[i][j] = scan.nextInt();
            }
        }
        
        int qtdPares = 0;
        int qtdImpares = 0;
        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                
                if (numeros[i][j] % 2 == 0){
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }  
        
        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Pares = " + qtdPares);
        System.out.println("Impares = " + qtdImpares);
    }

}
