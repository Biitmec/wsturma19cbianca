package decisao;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero"));
		
		if(numero1!=numero2 && numero2!=numero3 && numero3!=numero1){
					}
		
		if (numero1>numero2 && numero1>numero3 && numero3>numero2) {
			System.out.println(numero2);
			System.out.println(numero3);
			System.out.println(numero1);
		}
		else if (numero1>numero2 && numero1>numero3 && numero2>numero3) {
			System.out.println(numero3);
			System.out.println(numero2);
			System.out.println(numero1);
		}
		else if (numero2>numero1 && numero2>numero3 && numero1>numero3) {
			System.out.println(numero3);
			System.out.println(numero1);
			System.out.println(numero2);
		}
		else if (numero2>numero1 && numero2>numero3 && numero3>numero1) {
			System.out.println(numero1);
			System.out.println(numero3);
			System.out.println(numero2);
	}
		else if (numero3>numero1 && numero3>numero2 && numero2>numero1) {
			System.out.println(numero1);
			System.out.println(numero2);
			System.out.println(numero3);
	}
		else if (numero3>numero1 && numero3>numero2 && numero1>numero2) {
			System.out.println(numero2);
			System.out.println(numero1);
			System.out.println(numero3);
	}
		else {
			System.out.println("Inclua n�meros diferentes");
		}
		
		/*
		 *Resolu��o professor:
		 * if (valor1<valor2 && valor1<valor3) {
				System.out.println(valor1);
				if (valor2<valor3) {
					System.out.println(valor2);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor2);					
				}
			}else if (valor2<valor1 && valor2<valor3) {
				System.out.println(valor2);
				if (valor1<valor3) {
					System.out.println(valor1);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor1);					
				}
			}else {
				System.out.println(valor3);
				if (valor1<valor2) {
					System.out.println(valor1);
					System.out.println(valor2);
				}else {
					System.out.println(valor2);
					System.out.println(valor1);
				}
			}
		}else {
			System.out.println("Existem valores iguais");
		}
		 */
}
}
