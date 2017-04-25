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
        
        //chama o método
        van.exibirAutonomia();
        
       double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: "+ autonomia);
        System.out.println("A autonomia do carro é: "+ van.obterAutonomia());
     
        //Quanto de combustível precisamos para 10 km?
        
        double qtdCombustivel10 = van.calcularCombustivel(10);
         //Quanto de combustível precisamos para 15 km?
        double qtdCombustivel15 = van.calcularCombustivel(15);
        
        System.out.println("Quantidade de combustível para 10 km é: "+ qtdCombustivel10);
        System.out.println("Quantidade de combustível para 15 km é: "+ qtdCombustivel15);
     }   

}
