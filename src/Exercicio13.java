/*
A prefeitura de Florian�polis abriu uma linha de cr�dito para os funcion�rios estatut�rios.
O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto.
Fa�a um algoritmo que permita entrar com o sal�rio bruto e o valor da presta��o e
informar se o empr�stimo pode ou n�o ser concedido.

*/


import javax.swing.JOptionPane;

public class Exercicio13 {

    public static void main(String[] args) {
	       double sb,vp;
		       sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o Sal�rio Bruto: "));
           vp = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da presta��o: "));

           if(vp <= (0.3 * sb)){
		           JOptionPane.showMessageDialog(null,"Empr�stimo Concedido! ");
           }else{
               JOptionPane.showMessageDialog(null,"Empr�stimo NEGADO! ");
           }
    }

}
