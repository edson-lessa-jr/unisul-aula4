/*

Implemente uma calculadora,
primeiro pe�a 2 n�meros ao usu�rio (um de cada vez)
e apresente as seguintes op��es:

1 - adi��o
2 - subtra��o
3 - multiplica��o
4 - divis�o

Mostre o resultado ap�s a opera��o.



*/
import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void main(String[] args) {
 	       int controle;
 	       double resultado,resultadodiv;
	       double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
	       double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
	       controle = Integer.parseInt(JOptionPane.showInputDialog("Qual opera��o voc� quer executar ?"
                                                                 + " \n 1 - adi��o \n 2 - subtra��o \n 3 - multiplica��o \n 4 - divis�o"));
           switch(controle){
              case 1:
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null,"O resultado �: " + resultado);
			  break;

              case 2:
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null,"O resultado �: " + resultado);
              break;
              
              case 3:
                resultado = numero1 * numero2;
                JOptionPane.showMessageDialog(null,"O resultado �: " + resultado);
              break;
              
              case 4:
                resultadodiv = numero1 / numero2;
                JOptionPane.showMessageDialog(null,"O resultado �: " + resultadodiv);
              break;

              default:
                JOptionPane.showMessageDialog(null,"Op��o inv�lida! ");
              break;
            }
           
    }

}
