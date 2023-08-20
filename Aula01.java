/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class Aula01 {
    
    public static int n1,n2,soma;
    public static String nome,sobrenome;
    

    public static void main(String[] args) {
//      n1= 1;
//      n2= 2;
      
      nome= JOptionPane.showInputDialog("DIgite seu nome");
      sobrenome= JOptionPane.showInputDialog("DIgite seu sobrenome");
      
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
      
      soma= n1+n2;
      
        System.out.println(soma);
        
       // System.out.println(n2-n1);
        
       // System.out.println(nome);
        
       
       
        JOptionPane.showMessageDialog(null, "Seu nome "+nome+" "+sobrenome);
        //JOptionPane.showMessageDialog(null, sobrenome);
        JOptionPane.showMessageDialog(null, soma);
      
      
    }
    
    public void teste(){
        System.out.println("Hello World!");
    }
}
