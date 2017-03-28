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
public class converteMoeda {
    public static void main(String[] args) {
        
     String moeda;
        moeda = JOptionPane.showInputDialog("Escolha a opção de conversão de moeda desejada:"
                + "\n1 - Euro;"
                + "\n2 - Dólar;"
                + "\n3 - Peso Arg.");
        
        int opcao;
        opcao = Integer.parseInt(moeda);
        
        if(opcao == 1){
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double euro = 3.298;
            double valorConvertido = valorReal / euro;
            String msg;
            msg = "O valor em Euro é: "+valorConvertido;
            JOptionPane.showMessageDialog(null, msg);
        }
        if(opcao == 2){
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double dolar = 3.093;
            double valorConvertido = valorReal / dolar;
            String msg;
            msg = "O valor em Dólar é: "+valorConvertido;
            JOptionPane.showMessageDialog(null, msg);
        }
        if(opcao == 3){
            String valor;
            valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter:");
            double valorReal = Double.parseDouble(valor);
            final double peso = 0.199;
            double valorConvertido = valorReal / peso;
            String msg;
            msg = "O valor em Peso Arg é: "+valorConvertido;
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
