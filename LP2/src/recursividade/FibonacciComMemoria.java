/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author joan-
 */
public class FibonacciComMemoria {
    private final static int TAM_MEMORIA = 50;
	private static long[] memoria = new long[TAM_MEMORIA];

	public static long fibonacci(int num){

		if (num < 2){
			return memoria[num];
		}
		
		//verifica se o número já foi calculado e salvo na memória
		//caso contrário, faz o cálcula e salva
		long fib = memoria[num];
		if (fib  == 0){
			fib = fibonacci(num-1) + fibonacci(num-2);
			memoria[num] = fib;
		}

		return memoria[num];
	}

	public static void main(String[] args) {

		memoria[0]= 0;
		memoria[1]= 1;
		
		for (int i=1; i<TAM_MEMORIA; i++){
			System.out.println("Fibonacci de " + i + ": " + fibonacci(i));
		}
	}

}
