/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Listas;

import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class Listas {

    public static void main(String[] args) {
        
        
        int[] idade = new int[5];
        String[] nome = new String[5];
        
        
        for (int j = 0; j < 5; j++) {
            
            nome[j] = JOptionPane.showInputDialog("Digite o nome");
            idade[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade da pessoa:"));
        }
        
        for (int i = 0; i < 5; i++) {
            
            JOptionPane.showMessageDialog(null, nome[i] + " Idade: "+idade[i]);
        }
        
        
        
        
    }
}
