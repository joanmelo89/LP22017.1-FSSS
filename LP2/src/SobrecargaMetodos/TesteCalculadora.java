/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobrecargaMetodos;

/**
 *
 * @author joan-
 */
public class TesteCalculadora {
    public static void main(String[] args) {
		
		MiniCalculadora calc = new MiniCalculadora();
		
		int res = calc.soma(1, 2);
		calc.soma(1.0, 2.0);
                System.out.println(res);
                
                
                /*public int soma(int[] vetorInteiros){
		
		int total = 0;
		
		for (int i=0; i<vetorInteiros.length; i++){
			total += vetorInteiros[i];
		}
		
		return total;
	}*/
                int res2 = calc.soma(int 10);
	}
}
