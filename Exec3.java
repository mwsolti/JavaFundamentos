/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Exec3;

import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class Exec3 {

    
    
    public static void main(String[] args) {
        String prod1, prod2, resultado, menu;
        double valProd1, valProd2, soma, troco, dinheiro;
        
        prod1 = "Salgadinho";
        prod2 = "Bolacha";
        
        valProd1= 10;
        valProd2= 5;
        
        //soma= valProd1 + valProd2;
        
        boolean loop = true;
        soma = 0;
        
        while (loop) {
            menu = JOptionPane.showInputDialog("Digite: \n 1: "+ 
                    prod1 +" : "+ valProd1+"\n"+ "2: "+prod2+" : "+ valProd2+
                    " \n Ou Digite Sair");
            
            if (menu.equalsIgnoreCase("sair")) {
                loop = false;
                
            }
            else if (menu.equalsIgnoreCase("1")){
                soma = soma+valProd1;
                
            
            }
            else if(menu.equalsIgnoreCase("2")){
                soma = soma+valProd2;
            }
        
        }
        
        dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor dado pelo cliente"));
        
        troco = dinheiro - soma;
        resultado = String.format("%.2f", troco);
        
        
        
        if (troco < 0 ) {
            
            JOptionPane.showMessageDialog(null, resultado);
        }
        else{
            JOptionPane.showMessageDialog(null,resultado);
        }
        
        
        
        
    }
}
