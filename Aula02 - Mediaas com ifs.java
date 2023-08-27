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
        double media = 0;
        
        for (int i = 1; i <= 4; i++) {
            
            if (i == 1){
                aluno1 = JOptionPane.showInputDialog("Digite o nome do aluno "+ i);
               
                for (int j = 1; j <=3; j++) {
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota "+j));
                    media = media + nota;
                }
                
            } else if (i == 2){
                aluno2 = JOptionPane.showInputDialog("Digite o nome do aluno "+ i);
                 
                for (int j = 1; j <=3; j++) {
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota "+j));
                    media = media + nota;
                }
            } else if (i == 3){
                aluno3 = JOptionPane.showInputDialog("Digite o nome do aluno "+ i);
                 
                for (int j = 1; j <=3; j++) {
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota "+j));
                    media = media + nota;
                }
            }else if (i == 4){
                aluno4 = JOptionPane.showInputDialog("Digite o nome do aluno "+ i);
                
                for (int j = 1; j <=3; j++) {
                    nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota "+j));
                    media = media + nota;
                }
            }
            
            media = media /3;
            
            if ((media) >= 7) {
                
                if(i==1){
                    aluno1 += " Tem media: " + media + " e esta Aprovado";
                }
                else if(i==2){
                    aluno2 += " Tem media: " + media + " e esta Aprovado";
                }
                else if(i==3){
                    aluno3 += " Tem media: " + media + " e esta Aprovado";
                }
                else if(i==4){
                    aluno4 += " Tem media: " + media + " e esta Aprovado";
                }
            }
            
            else if ((media) > 4) {
                
                if(i==1){
                    aluno1 += " Tem media: " + media + " e esta Recuperação";
                }
                else if(i==2){
                    aluno2 += " Tem media: " + media + " e esta Recuperação";
                }
                else if(i==3){
                    aluno3 += " Tem media: " + media + " e esta Recuperação";
                }
                else if(i==4){
                    aluno4 += " Tem media: " + media + " e esta Recuperação";
                }
            } else if ((media) < 4) {
                
                if(i==1){
                    aluno1 += " Tem media: " + media + " e esta Reprovado";
                }
                else if(i==2){
                    aluno2 += " Tem media: " + media + " e esta Reprovado";
                }
                else if(i==3){
                    aluno3 += " Tem media: " + media + " e esta Reprovado";
                }
                else if(i==4){
                    aluno4 += " Tem media: " + media + " e esta Reprovado";
                }
            }
            
            media = 0;
           
        }
        
        JOptionPane.showMessageDialog(null, aluno1 + " \n" + aluno2 + " \n" + aluno3 +" \n" + aluno4);
    }
}
