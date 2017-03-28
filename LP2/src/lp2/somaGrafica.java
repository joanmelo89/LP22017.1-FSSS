/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

/**
 *
 * @author Joan
 */
//Importar a biblioteca para utilizar entrada gráfica de dados
import javax.swing.JOptionPane;
public class somaGrafica {
    public static void main(String[] args){
        String n1;
        String n2;
        
        n1 = JOptionPane.showInputDialog("Digite o primeiro número:");
         n2 = JOptionPane.showInputDialog("Digite o segundo número:");
         double num1 = Double.parseDouble(n1);
          double num2 = Double.parseDouble(n2);
          
          double resultado = num1 + num2;
          String msg;
          msg = "O resultado da soma é: "+resultado;
          JOptionPane.showMessageDialog(null, msg);
                  
          
          
          
    }
}
