/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Exec02;

import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class Exec02 {

    public static String nome;
    public static double nota1,nota2,nota3,media;
    
    
    public static void main(String[] args) {
        
        nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 1: "));
        
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 2: "));
                
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 3: "));
               
        media = (nota1+nota2+nota3)/3;
        
        JOptionPane.showMessageDialog(null, media);
        
        if (media >= 7){
            
            JOptionPane.showMessageDialog(null, "Aluno Passou");
            
        }else if(media>=5){
            
            JOptionPane.showMessageDialog(null, "Aluno EM Recuperação");
        }
        else{
            JOptionPane.showMessageDialog(null, "Aluno Reprovou");
        
        }
        

        
        
    }
}
