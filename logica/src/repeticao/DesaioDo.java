package repeticao;

import javax.swing.JOptionPane;

public class DesaioDo {

	public static void main(String[] args) {

		/*miss�o 1
		 * o jogador um digita um numero inteiro
		 * a partir dai o jogador 2 deve adivinhar o numero
		 * somente quando ele acertar devera aparecer a mensagem
		 * parabens, voc� acertou
		 * 
		 * miss�o 2
		 * acrescente dicas para o jogador 2
		 * informando se o numero que ele tem
		 * que adivinhar � maior ou menor que o numero que ele
		 * est� digitando
		 * 
		 * miss�o 3
		 * acrescente um contador de tentaivas que sera exibido quando
		 * o joggador 2 acertar a mensagem devera ser:
		 * Parabens, voc� acertou com x tentativas
		 * dica: tera� que criar uma variavel pra contar
		 * 
		 * 
		 * Para criar a variivael faz ela = 0 e tem que ser fora do DO
		 * 
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int chute= 0;
		int contador=0;
		do {
			chute =Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o numero"));
			contador= contador+1;
			//contador++
			//contador+=1
			if(chute>numero) {
				System.out.println("Chutando alto");

			}else if (chute<numero) {
				System.out.println("Chutando baixo");
			}
		}
		while(chute != numero);
		System.out.println("Parab�ns, voc� acertou com " + contador + " tentativa(s)!!");


	}
}
