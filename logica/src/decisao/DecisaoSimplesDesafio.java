package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	
	/*
	 * Capture o nome de uma pessoa e a idade
	 * De acordo com as leis eleitorais apresente uma
	 * mensagens abaixo:
	 * - "Seu voto � obrigat�rio"
	 * - "Seu voto � facultativo"
	 * - "Voc� n�o pode votar"
	 * 
	 */

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog ("Nome");
		short idade = Short.parseShort (JOptionPane.showInputDialog("Idade"));
		
		if(idade>=18 && idade<=70)
		{
			System.out.println(nome + ": Seu voto � obrigat�rio!");
			
		}
			if (idade<16) {
				System.out.println(nome + ": Voc� n�o pode votar!");
			}
			if(idade==16 | idade==17 | idade>70) {
				System.out.println(nome + ": Seu voto � facultativo");
			}
	}
	
}