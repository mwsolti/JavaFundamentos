/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class Aula02 {

    
    public static void main(String[] args) {
        
        String aluno1 = "", aluno2 = "", aluno3 = "", aluno4 = "";
        double nota = 0;
        double media1 = 0,media2 = 0,media3 = 0,media4 = 0;
        
        for (int i = 1; i <= 4; i++) {
            
            if (i == 1){
                aluno1 = JOptionPane.showInputDialog("Digite o nome do aluno");
                media1 = 0;
                for (int j = 1; j <=3; j++) {
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota "+j));
                    media1 = media1 + nota;
                }
                
            } else if (i == 2){
                aluno2 = JOptionPane.showInputDialog("Digite o nome do aluno");
                 media2 = 0;
                for (int j = 1; j <=3; j++) {
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota "+j));
                    media2 = media2 + nota;
                }
            } else if (i == 3){
                aluno3 = JOptionPane.showInputDialog("Digite o nome do aluno");
                 media3 = 0;
                for (int j = 1; j <=3; j++) {
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota "+j));
                    media3 = media3 + nota;
                }
            }else if (i == 4){
                aluno4 = JOptionPane.showInputDialog("Digite o nome do aluno");
                 media4 = 0;
                for (int j = 1; j <=3; j++) {
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota "+j));
                    media4 = media4 + nota;
                }
            }
            
           
        }
        
         JOptionPane.showMessageDialog(null, "Media do aluno "+ aluno1 
                    + ": " + media1/3);
            
            JOptionPane.showMessageDialog(null, "Media do aluno "+ aluno2 
                    + ": " + media2/3);
                        
            JOptionPane.showMessageDialog(null, "Media do aluno "+ aluno3 
                    + ": " + media3/3);
            
            JOptionPane.showMessageDialog(null, "Media do aluno "+ aluno4 
                    + ": " + media4/3);
        
    }
}
