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
public class CalculadoraEx {
    public static int fibonacci(int num){
        if(num < 1){
            return 0;
        }
        
        if (num < 2){
            return 1;
        }
        
        return fibonacci(num-1) + fibonacci(num-2);
    }
    
    // 5 = 5 + somatorio(4)
    // 4 = 4 + somatorio(3)
    // 3 = 3 + somatorio(2)
    // 2 = 2 + somatorio(1)
    // 1 = 1
    public static int somatorio(int num){
        
        if (num == 1){
            return 1;
        }
        
        return num + somatorio(num-1);
    }
}
