package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de diárias"));
		double valor = Double.parseDouble (JOptionPane.showInputDialog("Digite o valor da diária"));
		
		if (diarias>10) {
			System.out.println("Valor total:" + diarias*valor*1.05);
					}
		else if(diarias>=5 && diarias<=10) {
			System.out.println("Valor total:" + diarias*valor*1.08);
		}
		else {
			System.out.println("Valor total:" + diarias*valor*1.1);
		}
	}

}
