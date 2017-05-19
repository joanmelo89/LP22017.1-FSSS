/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaveThis;

/**
 *
 * @author joan-
 */
public class Lampada {
      String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    int garantiaEstendida;
    String[] tipos;
    boolean tipoAbajur;
     boolean ligada;
     
    public Lampada(){
         
     }
     
    public Lampada(String cor, String tipoLuz, int garantiaMeses, int garantiaEstendida){
         this.cor = cor;
         this.tipoLuz = tipoLuz;
         this.garantiaMeses = garantiaMeses;
         this.garantiaEstendida = garantiaEstendida;
     }
     
    public Lampada(String cor, String tipoLuz){
         this(cor, tipoLuz, 10, 20);
     }
    
    void ligar(){
        ligada = true;
    }
    
    void desligar(){
        ligada = false;
    }
    
    void mostrarEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }
    
    void mudarEstado(){
        if (ligada){
            desligar();
        } else {
            ligar();
        }
    }
}
