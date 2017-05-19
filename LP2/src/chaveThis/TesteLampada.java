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
public class TesteLampada {
    public static void main(String[] args) {
        
         Lampada lamp = new Lampada("vermelha", "brilhante");
       
	System.out.println(lamp.cor);
        System.out.println(lamp.garantiaMeses);
        System.out.println("A garantia total da lâmpada é: "+ (lamp.garantiaEstendida + lamp.garantiaMeses));
    }
}