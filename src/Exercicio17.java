/*

Implemente um algoritmo em JAVA que escreva a seguinte mensagem
na tela:

"Tib�rcio � <profiss�o do Tib�rcio>"

Solicite ao usu�rio que informe a profiss�o do Tib�rcio, apresente
as seguintes op��es:

e - engenheiro
p - programador
m - m�dico
a - advogado
d - designer

Se informada op��o diferente das apresentadas a profiss�o �
DESEMPREGADO.



*/
import javax.swing.JOptionPane;

public class Exercicio17 {

    public static void main(String[] args) {
	       String controle;
	       controle = JOptionPane.showInputDialog("Informe a profiss�o de Tib�rcio: \n "
           + "e - engenheiro \n"
           + "p - programador \n"
           + "m - m�dico \n"
           + "a - advogado \n"
           + "d - designer");
           
	       char controleCHAR = controle.charAt(0);
           switch(controleCHAR){
              case 'e':
                JOptionPane.showMessageDialog(null,"Tib�rcio � engenheiro");
              break;

              case 'p':
                JOptionPane.showMessageDialog(null,"Tib�rcio � programador");
              break;
              
              case 'm':
                JOptionPane.showMessageDialog(null,"Tib�rcio � m�dico");
              break;
              
              case 'a':
                JOptionPane.showMessageDialog(null,"Tib�rcio � advogado");
              break;
              
              case 'd':
                JOptionPane.showMessageDialog(null,"Tib�rcio � designer");
              break;

              default:
                JOptionPane.showMessageDialog(null,"Tib�rcio est� DESEMPREGADO! ");
              break;
           }
           
    }

}
