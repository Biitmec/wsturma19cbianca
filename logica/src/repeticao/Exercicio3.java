package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	
	public static void main(String[] args) {
		
		String cargo = "";
		float salario=0;
		float total=0;
		int qtdeCargos=0;
		float maiorSalario=0;
		String maiorCargo="";	
		
		do {
			cargo=JOptionPane.showInputDialog("Cargo");
			salario= Float.parseFloat(JOptionPane.showInputDialog("Salario"));
			total+=salario; //total= total + salario
			qtdeCargos++; //qtdeCargos = qtdeCargos+1
			if(salario>maiorSalario) {
				maiorSalario=salario;
				maiorCargo=cargo;
			}
			
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Titulo", JOptionPane.YES_NO_OPTION)==0);
		System.out.println("Total de salarios: "+ total);
		System.out.println("Media: "+ (total/qtdeCargos));
		System.out.println("O cargo" + maiorCargo + "possui o maior salario com o valor de " + maiorSalario);
	}
}


/*Exercicio 3
* Solicite ao usu�rio (enquanto ele quiser), o cargo e o salario do cargo.
* No final exiba:
* - total de todos os salarios
* - m�dia
* - o maior valor entre todos os sal�rios que foram digitados, com o cargo.
* 
*/