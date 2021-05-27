package br.com.rubinhocar.implementacao;

import javax.swing.JOptionPane;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	
	public static void main(String[] args) {
		
		//1º instanciar o objeto
		Veiculo objeto = new Veiculo(); //instancia um objeto
		
		//2º preenhcer os atirbutos do objeto
		objeto.preencherModelo("camaro");
		objeto.preencherValor(200000);
		
		//3ª exibir os resultados
		System.out.println("Modelo: "+ objeto.retornarModelo());
		System.out.println(objeto.retornarTudo());
		System.out.println(objeto.ligar());
		objeto.acelerar(20);
		objeto.acelerar(10);
		objeto.desacelerar(15);
		System.out.println("Depois de ligar: \n"+ objeto.retornarTudo());
		System.out.println(objeto.desligar());
		System.out.println(objeto.ligar());
		objeto.acelerar(10);
		objeto.desacelerar(10);
		
	}
}
