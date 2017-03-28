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
public class questao1While {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          boolean valorValido = false;
          double nota;
          
          do{
              System.out.println("Entre com a nota:");
              nota = input.nextDouble();
              if(nota>=0 && nota<=10){
                 valorValido = true; 
                 System.out.println("Você digitou a nota "+nota);
              }else{
                  System.out.println("O valor "+nota+" digitado não está entre 0 e 10, digite novamente.");
              }
          }while(!valorValido);
    }
  
}
