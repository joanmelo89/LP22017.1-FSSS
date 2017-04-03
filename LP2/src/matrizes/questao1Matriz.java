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
public class questao1Matriz {
    public static void main(String[] args) {
        
        //DECLARAÇÃO DA MATRIZ
        int[][] numerosAleatorios = new int[4][4];
        
        //CRIAÇÃO DA CLASSE RANDOM PARA GERAR NUMEROS ALEATÓRIOS
        Random numeroRandom = new Random();
        
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                //GUARDAR NA MEMÓRIA OS VALORES ALEATÓRIOS DA MATIRZ DE 0 A 100
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        //VARIÁVEIS PARA CALCULAR O MAIOR NÚMERO DA MATRIZ E IDENTIFICAR
        // A LINHA E A COLUNA
        int maior = 0;
        int linha = 0;
        int col = 0;
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        //RESPOSTA AO USUÁRIO DO VALOR MAIOR E A LINHA E COLUNA QUE
        //ESSE VALOR ESTÁ LOCALIZADO
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + col);
    }

}

