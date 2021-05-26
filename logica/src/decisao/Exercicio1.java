package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
	float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Valor 1:"));
	float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Valor 2:"));
	char operador = JOptionPane.showInputDialog("Digite um Operador").charAt(0);
	double divisao = valor1 / valor2;
	double soma = valor1 + valor2;
	double subtracao = valor1 - valor2;
	double multiplicacao = valor1 * valor2;
	
	
	if(operador=='/') {
		System.out.println("Resultado:" + divisao);
	}	else if (operador== '+') {
		System.out.println("Resultado:" + soma);
	}	else if (operador== '*') {
		System.out.println ("Resultado:" + multiplicacao);
	}	else if (operador=='-') {
		System.out.println("Resultado:" + subtracao);
	}	else {
		System.out.println("Operador inválido");
	}
	}

}
