package repeticao;

import javax.swing.JOptionPane;

public class DesafioDoVariacao {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int chute= 0;
		do {
			chute =Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o numero"));
			if(chute>numero) {
				JOptionPane.showMessageDialog(null, "Chutando alto");

			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chutando baixo");
			}
		}
		while(chute != numero);
		JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");


	}


}

