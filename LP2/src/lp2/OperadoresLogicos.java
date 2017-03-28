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
//PROBLEMA DIZ O SEGUINTE
//CASO CONSIGA  EXECUTAR OS DOIS TRABALHOS, COMPRA SORVETE E COMPRA TV DE 50, CASO SÓ UM TRABALHO COMPRA SOMENTE SORVETE E CASO NENHUM DOS DOIS FICA EM CASA.
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean executouTrabalho1 = false;
        boolean executouTrabalho2 = true;
        
        boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
        boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
        
        
        System.out.println("Sorvete = "+comprouSorvete);
        System.out.println("TV 50 = "+comprouTv50);
       
    }
    
}
