package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {

	/*
	 * Tipos primitivos (Todos aqueles que começam com letra minuscula)
	 * boolean --> Lógico (True/False)
	 * char	--> um caracter entre os apostrofos 'a'
	 * 
	 * byte --> -128/+127 - armazenar até essa quantidade
	 * short --> -32mil/+32mil
	 * int --> -2tri/+2tri
	 * long --> -9 a +9 quintilhoes
	 * 
	 * float --> ate 5 casas decimais
	 * double --> acima de 5 casas decimais, mta precisão
	 * se sempre usar double ocupa mais espaço
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Capturem:
		 * -nome do produto
		 * -qtde do produto
		 * - valor unitário
		 * exibir no final:
		 * - nome do produto
		 * -valor total
		 * - valor do imposto (17% sobre o valor total)
		 */
		
		String produto = JOptionPane.showInputDialog("Digite o produto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog ("Digite o valor"));
		float imposto = Float.parseFloat(JOptionPane.showInputDialog("Imposto"));
		float total = valor * quantidade + valor*quantidade* imposto;
		
		//quando coloca o valor: total *0.17 - tem que indicar que o número é float (float) 0.17 -> casting
		
		System.out.println ("Nome do produto:" + produto);
		System.out.println ("Imposto........:" + ((valor*quantidade)*imposto));
		System.out.println ("Valor total....:" + total);
		
		//sysout crtl espaço - atalho para o system out
		//Você pode calcular direto no sysout ou colocar antes como variavel, opção mais escalave
		
	}
}
