/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesEAtributos;

/**
 *
 * @author joan-
 */
public class TesteCarro {
    public static void main(String[] args){
        //instanciar classe carro
        Carro van = new Carro();
        
        van.cor = "vermelho";
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.cor);
        System.out.println(van.marca);
        
        Carro fusca = new Carro();
        
        fusca.cor = "marrom";
        fusca.modelo = "Fusca";
        fusca.marca = "Volkswagem";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        
        System.out.println(fusca.cor);
        System.out.println(fusca.marca);
        
    }
}
