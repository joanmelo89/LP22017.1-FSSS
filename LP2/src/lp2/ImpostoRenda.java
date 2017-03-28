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
import javax.swing.JOptionPane;
public class ImpostoRenda {
    public static void main(String[] args){
        String sl;
        
        sl = JOptionPane.showInputDialog("Informe seu salário líquido:");
        double salarioLiquido = Double.parseDouble(sl);
        
        if(salarioLiquido <= 900){
            String msg;
            msg = "Você está isento de imposto de renda.";
            JOptionPane.showMessageDialog(null, msg);
        }
         if(salarioLiquido >= 900.01 && salarioLiquido <= 1800){
            
             double desconto = 0.15 * salarioLiquido;
           
            String msg;
            msg = "O valor do seu imposto de renda é: "+desconto;
            JOptionPane.showMessageDialog(null, msg);
        }
          if(salarioLiquido > 1800){
             double desconto = 0.275 * salarioLiquido;
             String msg;
             msg = "O valor do seu imposto de renda é: "+desconto;
             JOptionPane.showMessageDialog(null, msg);
        }
    }
}
