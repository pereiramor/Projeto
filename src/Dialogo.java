// importando classe do swing
import javax.swing.JOptionPane;

public class Dialogo {
    public static void main (String [] args) {
        String nome;
        //Este comando mostra um dialogo que solicita entrada de dados
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String mensagem = nome+" esta fazendo o curso Java Iniciante";
    // Este comando mostra um dialogo que apenas exibe a mensagem
         JOptionPane.showMessageDialog (null, mensagem);
        }
}
