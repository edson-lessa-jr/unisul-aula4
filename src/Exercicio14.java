
import javax.swing.JOptionPane;

public class Exercicio14 {

    public static void main(String[] args) {
	        int an,aa, resultado;
		      an = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento: "));
		      aa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

           if(an >= aa){
		           JOptionPane.showMessageDialog(null,"Ano de nascimento inválido! ");
           }else{
               resultado = aa - an;
               JOptionPane.showMessageDialog(null,"Sua idade é: " + resultado);
           }
    }

}
