
import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {
	       int a,b;
		   a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
		   b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b:"));

           if(a > b){
		       JOptionPane.showMessageDialog(null,"O número maior é: " + a);
           }else{
               if(a == b){
                   JOptionPane.showMessageDialog(null,"Os números são iguais ");
               }else{
                   JOptionPane.showMessageDialog(null,"O número maior é: " + b);
               }
           }
    }

}
