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
public class questao3While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean inforValidas = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        do{
            System.out.println("Entre com o nome:");
            nome = input.next();
            if(nome.length() > 3){
                inforValidas = true;
            }else{
                System.out.println("Digite um nome com pelo menos 3 caracteres.");
            }
        }while(!inforValidas);
        inforValidas = false;
         do{
            System.out.println("Entre com a idade:");
            idade = input.nextInt();
            if(idade >= 0 && idade <= 150){
                inforValidas = true;
            }else{
                System.out.println("A idade precisa ser entre 0 e 150");
            }
        }while(!inforValidas);
         inforValidas = false;
          do{
            System.out.println("Entre com osalário:");
            salario = input.nextDouble();
            if(salario > 0){
                inforValidas = true;
            }else{
                System.out.println("O salário precisa ser maior que 0.");
            }
        }while(!inforValidas);
         inforValidas = false;
          do{
            System.out.println("Entre com o sexo:");
            sexo = input.next();
            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                inforValidas = true;
            }else{
                System.out.println("Digite 'f' ou 'm' para o sexo.");
            }
        }while(!inforValidas);
          inforValidas = false;
          do{
            System.out.println("Entre com o estado civil:");
            estadoCivil = input.next();
            if(estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d")){
                inforValidas = true;
            }else{
                System.out.println("Digite 's', 'c', 'v' ou 'd' para o estado civil.");
            }
        }while(!inforValidas);
          System.out.println("Nome: "+nome);
          System.out.println("Idade: "+idade);
          System.out.println("Salário: "+salario);
          System.out.println("Sexo: "+sexo);
          System.out.println("Estado Civil: "+estadoCivil);
    }
}
