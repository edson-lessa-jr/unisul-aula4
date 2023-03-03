/*

Uma loja dará um desconto em seus produtos de acordo com a categoria de cada produto. 
As categorias e os descontos são mostrados abaixo:

Categoria Desconto 
A             10% 
B             15% 
C             20% 
D             25% 
E             50%

Faça um algoritmo para ler o nome do cliente, o preço e a categoria do produto que o cliente está comprando. 
Após a leitura mostrar na tela o preço final que o cliente deverá pagar após ter sido dado o desconto no preço da mercadoria.




*/
import javax.swing.JOptionPane;

public class Exercicio18 {

    public static void main(String[] args) {
	     //leitura das informacoes digitadas pelo usuario
     String nome = JOptionPane.showInputDialog( "Digite o nome do cliente: ");
     double preco = Double.parseDouble(JOptionPane.showInputDialog( "Digite o preco: "));
     char categoria = JOptionPane.showInputDialog( "Digite a categoria: ").charAt(0);

     //determina o desconto (%) de acordo com a categoria
     double desconto = 0;
     switch(categoria){
     case 'A' :
        desconto = 10;
        break;

     case 'B' :
        desconto = 15;
        break;

     case 'C' :
        desconto = 20;
        break;

     case 'D' :
        desconto = 25;
        break;

     case 'E' :
        desconto = 50;
        break;
	 default:
        JOptionPane.showMessageDialog(null, "Opção inválida. ");
	 break;	
     }

     //calculo o preco final
     double precoFinal = preco - (preco * desconto / 100);

     //mostra na tela o valor a ser pago pelo cliente
     JOptionPane.showMessageDialog(null, "Valor a ser pago = " + precoFinal);
           
    }

}
