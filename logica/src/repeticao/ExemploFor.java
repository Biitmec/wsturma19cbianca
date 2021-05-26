package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	
	/*
	 * sintaxe do for
	 * 1 variavel que vai contar
	 * 2º condição
	 * 3º como ele vai contar?
	 */
	
	public static void main(String[] args) {
		int tabuada =Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for (int contador=0; contador<11; contador+=1) {
			System.out.println(tabuada + "x" + contador + " = "+ (tabuada*contador));
			
			
		}
	}

}
