/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresStatic;

/**
 *
 * @author joan-
 */
public class Questao1 {
     static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    
    public static void main(String[] args) {
        
        imprimirValor(); //0
        
        Contador.incrementar();
        
        imprimirValor();//1
        
        Contador.zerar();
        
        imprimirValor();//0
        
        Contador.incrementar();//+1
        Contador.incrementar();//+1
        Contador.incrementar();//+1
        
        imprimirValor();//3
        
        
    }
}
