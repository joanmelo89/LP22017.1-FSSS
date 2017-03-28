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
public class notaAlunoGrafica {
    public static void main(String[] args){
        String n1;
        String n2;
        String n3;
        
        n1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        n2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        n3 = JOptionPane.showInputDialog("Digite a terceira nota:");
        
        double nota1 = Double.parseDouble(n1);
        double nota2 = Double.parseDouble(n2);
        double nota3 = Double.parseDouble(n3);
        
        double media = (nota1 + nota2 + nota3)/3;
        if(media>=7){
            String msg;
            msg = "APROVADO";
            JOptionPane.showMessageDialog(null, msg);   
        }
         if(media>=4 && media<7){
            String msg;
            msg = "RECUPERAÇÃO";
            JOptionPane.showMessageDialog(null, msg);   
        }
         if(media<4){
            String msg;
            msg = "REPROVADO DIRETO";
            JOptionPane.showMessageDialog(null, msg);   
        }
    }
}
