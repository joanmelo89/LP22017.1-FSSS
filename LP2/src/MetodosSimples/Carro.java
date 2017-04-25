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
public class Carro {
     //criação de atributos
    String marca;
    String modelo;
    String cor;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    //método simples sem parâmetros e sem retorno
    void exibirAutonomia(){
	System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + " km");
    }
    //método simples com retorno
    double obterAutonomia(){
	return capCombustivel * consumoCombustivel;
	}
    //método com parâmetro e retorno
    double calcularCombustivel(double km){
		return km/consumoCombustivel;
	}


    

}
