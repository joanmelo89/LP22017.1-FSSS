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
public class Exemplo1Vetor {

    //ARMAZENAR A TEMPERATURA MÉDIA DIÁRIA POR UM ANO
    public static void main(String[] args) {
        /*
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.3;
         */
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.3;

        //IMPRIMINDO VETOR
        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
        //DETECTANDO TAMANHO DO VETOR
        System.out.println("O tamanho do array: " + temperaturas.length);
        //IMPRIMINDO OS VALORES DO VETOR NA TELA
        System.out.println("Valores do array: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
        }

    }

}
