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
public class questao2While {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome;
        String senha;
        boolean inforValidas = false;
        do{
            System.out.println("Entre com o usuário:");
            nome = input.next();
            System.out.println("Entre com a senha:");
            senha = input.next();
            //Validação
            //se nome = senha
            if(nome.equalsIgnoreCase(senha)){
                inforValidas = false;
                System.out.println("O usuário e senha digitados são iguais, favor digitar novamente.");
            }else{
               inforValidas = true;
               System.out.println("Informações digitadas:");
                System.out.println("Usuário: "+nome);
                System.out.println("Senha: "+senha);
            }
        }while(!inforValidas);
}
}
