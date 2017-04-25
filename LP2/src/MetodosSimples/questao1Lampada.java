/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosSimples;

/**
 *
 * @author joan-
 */
public class questao1Lampada {
    public static void main(String[] args){
        
        Lampada lampada = new Lampada();
        
        lampada.ligar();
        
        lampada.mostrarEstado();
        //Ligada
        lampada.desligar();
        
        lampada.mostrarEstado();
        //Desligada
        lampada.mudarEstado();
        
        lampada.mostrarEstado();
        //Ligada
    }
}
