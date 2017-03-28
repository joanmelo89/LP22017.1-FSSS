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
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        int num3 = 5;
        
        //Operadores: + - * / %
        int soma = num1 + num2 + num3 + 6;
        System.out.println(soma);
        System.out.println(num1 - num2 - num3);
        
        //Cuidado com a precedência
        System.out.println(num1 + num3 * num2 / 2);
        System.out.println((num1 + num3) * num2 / 2);
        
        //Resto da divisão
        System.out.println(10 % 3);
    }
}
