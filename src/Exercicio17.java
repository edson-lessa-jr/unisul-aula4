/*

Implemente um algoritmo em JAVA que escreva a seguinte mensagem
na tela:

"Tibúrcio é <profissão do Tibúrcio>"

Solicite ao usuário que informe a profissão do Tibúrcio, apresente
as seguintes opções:

e - engenheiro
p - programador
m - médico
a - advogado
d - designer

Se informada opção diferente das apresentadas a profissão é
DESEMPREGADO.



*/
import javax.swing.JOptionPane;

public class Exercicio17 {

    public static void main(String[] args) {
	       String controle;
	       controle = JOptionPane.showInputDialog("Informe a profissão de Tibúrcio: \n "
           + "e - engenheiro \n"
           + "p - programador \n"
           + "m - médico \n"
           + "a - advogado \n"
           + "d - designer");
           
	       char controleCHAR = controle.charAt(0);
           switch(controleCHAR){
              case 'e':
                JOptionPane.showMessageDialog(null,"Tibúrcio é engenheiro");
              break;

              case 'p':
                JOptionPane.showMessageDialog(null,"Tibúrcio é programador");
              break;
              
              case 'm':
                JOptionPane.showMessageDialog(null,"Tibúrcio é médico");
              break;
              
              case 'a':
                JOptionPane.showMessageDialog(null,"Tibúrcio é advogado");
              break;
              
              case 'd':
                JOptionPane.showMessageDialog(null,"Tibúrcio é designer");
              break;

              default:
                JOptionPane.showMessageDialog(null,"Tibúrcio está DESEMPREGADO! ");
              break;
           }
           
    }

}
