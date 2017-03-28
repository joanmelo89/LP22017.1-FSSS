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
public class Exemplo3For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de turmas:");
        int numTurmas = input.nextInt();
        boolean inforValidas = false;
        int numAlunos = 0;
        double media;
        double soma = 0;
        int i;
        for( i = 1; i <= numTurmas; i++){
            inforValidas = false;
            do{
               System.out.println("Informa a quantidade de aluno da turma "+i);
               numAlunos = input.nextInt();
               if(numAlunos <= 40){
                    inforValidas = true;
               }else{
                    System.out.println("A quantidade de alunos nao pode ultrapassar de 40.");   
               }
                soma += numAlunos;
            }while(!inforValidas);
            
        }
        
        media = soma / numTurmas;
        System.out.printf("A média de alunos por turma é %.1f", media);
        
    }
}
