
import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void main(String[] args) {
	       int a;
		   a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
           if((a % 2) == 0){
		       JOptionPane.showMessageDialog(null,"Sim, � m�ltiplo de 2 ! ");
           }else{
               JOptionPane.showMessageDialog(null,"N�o, n�o � m�ltiplo de 2 ! ");
           }
    }

}
