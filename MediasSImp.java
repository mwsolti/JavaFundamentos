package Medias;
import javax.swing.JOptionPane;

public class MediasSImp {
    
    public static void main(String[] args) {
       String[] aluno = new String[4];
       double[] media = new double[4];
       String txt = " Reprovado" , resultado = "";
       
        for (int i = 0; i < aluno.length; i++) {
            aluno[i] = JOptionPane.showInputDialog("Digite o nome do Aluno "+(i+1));
            for (int j = 0; j < 3; j++) {
               media[i]+= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+ (j+1)));
            }
            if((media[i]/3) >=7){
                txt = " Aprovado";
            } else if ((media[i]/3) >=5){
                txt = " Recuperação";
            }
       resultado += aluno[i] + " Tem Media: " +(media[i]/3) + txt + "\n";
    }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
