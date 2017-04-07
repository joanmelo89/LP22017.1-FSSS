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
public class MatrizTridimensional {
    public static void main(String[] args) {
        //CRIAÇÃO DA MATRIZ DE 3 DIMENSÕES
        int[][][] matrizTridimensional = new int[3][3][3];
        
        //ATRIBUIÇÃO DE VALORES DA MATRIZ
        for (int i=0; i<matrizTridimensional.length; i++){
            for (int j=0; j<matrizTridimensional[i].length; j++){
                for (int k=0; k<matrizTridimensional[i][j].length; k++ ){
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }
        
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i=0; i<matrizTridimensional.length; i++){
            for (int j=0; j<matrizTridimensional[i].length; j++){
                for (int k=0; k<matrizTridimensional[i][j].length; k++ ){
                    soma += matrizTridimensional[i][j][k];
                    
                    if (matrizTridimensional[i][j][k] % 2 == 0){
                        somaPares += matrizTridimensional[i][j][k];
                    }else{
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
            }
            System.out.println();
        }
        
         for (int i=0; i<matrizTridimensional.length; i++){
            for (int j=0; j<matrizTridimensional[i].length; j++){
                for (int k=0; k<matrizTridimensional[i][j].length; k++ ){
                  System.out.print(matrizTridimensional[i][j][k] + " ");
                }
            }
        }
        
        System.out.println("Soma total = "+ soma);
        System.out.println("Soma pares = "+ somaPares);
        System.out.println("Soma ímpares = "+ somaImpares);
    }
}
