/*

Implemente uma calculadora,
primeiro peça 2 números ao usuário (um de cada vez)
e apresente as seguintes opções:

1 - adição
2 - subtração
3 - multiplicação
4 - divisão

Mostre o resultado após a operação.



*/
import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void main(String[] args) {
 	       int controle;
 	       double resultado,resultadodiv;
	       double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
	       double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
	       controle = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer executar ?"
                                                                 + " \n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisão"));
           switch(controle){
              case 1:
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
			  break;

              case 2:
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
              break;
              
              case 3:
                resultado = numero1 * numero2;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
              break;
              
              case 4:
                resultadodiv = numero1 / numero2;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultadodiv);
              break;

              default:
                JOptionPane.showMessageDialog(null,"Opção inválida! ");
              break;
            }
           
    }

}
