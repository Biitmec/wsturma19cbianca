package br.com.caicaielevador.implementacao;

import br.com.caicaielevador.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		
		elevador.preencherNome ("TorreA");//poderia colocar JOptionPane pra pedir o nome
		elevador.inicializar(20, 0, 10);
		
		System.out.println(elevador.retornarResumo());
		elevador.subir();
		elevador.subir();
		System.out.println(elevador.retornarResumo());
		elevador.subir();
		elevador.entrar(5);
		System.out.println(elevador.retornarResumo());
		elevador.descer();
		elevador.sair();
		System.out.println(elevador.retornarResumo());
		
	}
	
}
