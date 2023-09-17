/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Forca;

import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class Forca {

    public static void main(String[] args) {
       
        String palavra = "", letra = "", strLetraPalavra = "", letrasDigitadas = "";
        String ltrMemoria;
        char letraPalavra;
        int acerto =0, erro = 0 , verificarErro = 1, verificaLetras = 1;
        boolean jogo = true;
        
        palavra = JOptionPane.showInputDialog("Digite a Palavra: ");
        
        while (jogo) {
            
        letra = JOptionPane.showInputDialog("Digite uma Letra: ");  
        for (int i = 0; i < letrasDigitadas.length(); i++) {
            
             ltrMemoria = Character.toString(palavra.charAt(i));
             
              if (ltrMemoria.equalsIgnoreCase(letra)) {
                  erro += 1;
                  JOptionPane.showMessageDialog(null, "Letra ja Digitada" +erro);
                  verificaLetras = 0;
             }
        }
        

        letrasDigitadas += letra;
        
        if (verificaLetras == 1){       
            for (int i = 0; i < palavra.length(); i++) {

                letraPalavra = palavra.charAt(i);
                strLetraPalavra = Character.toString(letraPalavra);

                if (strLetraPalavra.equalsIgnoreCase(letra)) {
                    acerto += 1;
                    JOptionPane.showMessageDialog(null, "Letra correta " + acerto);
                    verificarErro = 0;

                }
                       
        }
        
        if(verificarErro == 1){
                erro += 1;
                JOptionPane.showMessageDialog(null, "Letra incorreta "+ erro);
        }
        
        }
        
        if(acerto == palavra.length()) {            
            JOptionPane.showMessageDialog(null, "Você Ganhou!");
            jogo = false;
        } else if(erro >= 6){
            JOptionPane.showMessageDialog(null, "Você Perdeu!");
            jogo = false;
        }
        verificarErro = 1;
        
        }

    }
}
