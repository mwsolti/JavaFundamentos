/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package MediaComListas;

import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class MediaComListas {

    public static void main(String[] args) {
        
        String[] aluno = new String[4];
        double[] notas = new double[3];
        double[] medias = new double[4];
        String resultado = "";
        
        for (int i = 0; i < 4; i++) {
            
            aluno[i] = JOptionPane.showInputDialog("Digite o nome do aluno "+ (i+1));
            
            for (int j = 0; j < 3; j++) {
                notas[j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+ (j+1)));           
            }
            medias[i] = (notas[0]+notas[1]+notas[2])/3;
            
            if(medias[i]>=7){
                resultado += aluno[i] +" tem media: "+ medias[i] + " e esta: Aprovado \n";
                
            }else if(medias[i] >5){
                resultado += aluno[i] +" tem media: "+ medias[i] + " e esta: Recuperação \n";
          
            }else{
                resultado += aluno[i] +" tem media: "+ medias[i] + " e esta: Reprovado \n";  
            }
            
            
            
        }
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}
