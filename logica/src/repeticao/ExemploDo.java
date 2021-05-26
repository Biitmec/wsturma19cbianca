package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		
		do {
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float peso= Float.parseFloat(JOptionPane.showInputDialog("Peso"));
		float altura= Float.parseFloat(JOptionPane.showInputDialog("Altura"));
		float imc= peso / (altura*altura);
		System.out.printf("%s seu IMC �: %.2f\n", nome, imc);
		}
		while(JOptionPane.showConfirmDialog(null, "Continuar?", "Titulo", JOptionPane.YES_NO_OPTION)==0);
	}
}

//null � pra sair centralizado
//continuar � a mensagem q eu pergunta
//titulo � o titulo da caixinha
//yes_no_cancel sairia yes no e cancelar
// ==0 � para sim (primeiro), continuar e ele volta a aplica��o, se clica no n�o ele para
//n�o da pra colocar no_yes_option
//\n � quebra de linha