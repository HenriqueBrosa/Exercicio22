import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de vezes:"));
        String frase = JOptionPane.showInputDialog("Digite a Frase:");
        
        for (int i = 0; i < n; i++){
            JOptionPane.showMessageDialog(null, "frase: " + frase);
        }
    }
}
