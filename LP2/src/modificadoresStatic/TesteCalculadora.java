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
public class TesteCalculadora {
    static int resultSoma;

	public static void main(String[] args) {
		
		resultSoma = MinhaCalculadora.soma(1, 2);
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		
		//calc.soma(1, 2);
		
		soma2Valores(1, 2);
		
	}

	static int soma2Valores(int num1, int num2){
		return MinhaCalculadora.soma(num1, num2);
	}
}
