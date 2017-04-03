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
public class ExemploMatriz {
    public static void main(String[] args) {
		//DECLARAÇÃO DA MATRIZ
		double[][] notasAlunos = new double[3][4];
                
                //ATRIBUIÇÃO DE VALORES NAS POSIÇÕES 
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
                //ESTRUTURA DE REPETIÇÃO PARA IMPRESSÃO DOS VALORES DA MATRIZ
                //PRECISAREMOS DE 2 FORs
		for (int i=0; i<notasAlunos.length; i++){
			for (int j=0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
                //MANIPULAÇÃO DE VALOR EM UMA MATRIZ
		notasAlunos[1][3] = 8;
		
		System.out.println();
		
		for (int i=0; i<notasAlunos.length; i++){
			for (int j=0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
                //FAZENDO O CÁLCULO DA MÉDIA COM OS VALORES DA MATRIZ
		System.out.println("Calculando a média de cada aluno");
		
		double soma;
		for (int i=0; i<notasAlunos.length; i++){
			
			soma = 0;
			for (int j=0; j<notasAlunos[i].length; j++){
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + i + " é = " + (soma/4));
		}
		
                //OUTRA FORMA DE ATRIBUIÇÃO DE VLORES EM UMA MATRIZ
		double[] notasAluno1 = {7, 8, 9, 10}; 
		
		double[][] notasAlunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
		
		System.out.println("Impressão da matriz notasAlunos2");
		
		for (int i=0; i<notasAlunos2.length; i++){
			for (int j=0; j<notasAlunos2[i].length; j++){
				System.out.print(notasAlunos2[i][j] + " - ");
			}
			System.out.println();
		}
	}

}
    

