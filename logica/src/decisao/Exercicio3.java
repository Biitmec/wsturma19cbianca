package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio"));
		byte faltas = Byte.parseByte(JOptionPane.showInputDialog("Faltas"));
		if (faltas==0)
		{
		salarioBruto = salarioBruto* (float)1.02;
		}
		float inss = 0;
		if (salarioBruto<1095) {
			inss = salarioBruto * (float) 0.075;
		}
		else if (salarioBruto>=1095 && salarioBruto<=3000) {
			inss = salarioBruto * (float) 0.12;
		}
		else {
			inss = salarioBruto * (float)0.14;
		}
		System.out.println(nome + ", seu sal�rio bruto �:" + salarioBruto);
		System.out.println(nome + ", seu sal�rio l�quido �.....:" + (salarioBruto-inss-(salarioBruto*0.08)));
				
	}
}