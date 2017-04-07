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
import java.util.Random;
public class questao2Matriz {
    public static void main(String[] args) {
        //DECLARAÇÃO DA MATRIZ
        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();
        //GERAÇÃO DA MATRIZ COM VALORES ALEATÓRIOS DE 0 A 100
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(9);
            }
        }
        
        //IMPRESSÃO DE VALOES
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        
        //VERIFICAÇÃO DE VALORES DA LINHA 5
        int maiorL5 = 0;
        int menorL5 = 10;
        int linha5 = 5;
        for (int i=0; i<numerosAleatorios[linha5].length; i++){
            if (numerosAleatorios[linha5][i] > maiorL5){
                maiorL5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorL5){
                menorL5 = numerosAleatorios[linha5][i];
            }
        }
        
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);
        
        //VERIFICAÇÃO DE VALORES DA COLUNA 7
        int maiorC7 = 0;
        int menorC7 = 10;
        int col7 = 7;
        for (int i=0; i<numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][col7] > maiorC7) {
                maiorC7 = numerosAleatorios[i][col7]; 
            }
            if (numerosAleatorios[i][col7] < menorC7) {
                menorC7 = numerosAleatorios[i][col7]; 
            }
        }
        
        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);
    }

}
