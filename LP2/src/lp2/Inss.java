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
public class Inss {
    public static void main(String[] args){
        String sb;
        String sm;
        
        sb = JOptionPane.showInputDialog("Digite o valor do salário bruto:");
        sm = JOptionPane.showInputDialog("Digite o valor do salário mínimo:");
        
        double salarioBruto = Double.parseDouble(sb);
        double salarioMinimo = Double.parseDouble(sm);
        
        double valor1;
        valor1 = 3 * salarioMinimo;
        
        if(salarioBruto <= valor1){
            double contribuicao = 0.08 * salarioBruto;
            String msg;
            msg = "A contribuição é: "+contribuicao;
            JOptionPane.showMessageDialog(null, msg);
                if(contribuicao > salarioMinimo){
                    double importancia = salarioMinimo;
                    String msg2;
                    msg2 = "A importância é de: "+importancia;
                    JOptionPane.showMessageDialog(null, msg2);
                }
        }
         if(salarioBruto > valor1){
            double contribuicao = 0.10 * salarioBruto;
            String msg;
            msg = "A contribuição é: "+contribuicao;
            JOptionPane.showMessageDialog(null, msg);
            if(contribuicao > salarioMinimo){
                    double importancia = salarioMinimo;
                    String msg2;
                    msg2 = "A importância é de: "+importancia;
                    JOptionPane.showMessageDialog(null, msg2);
                }
        }
         
    }
}
