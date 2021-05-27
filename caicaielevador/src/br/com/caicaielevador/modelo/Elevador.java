package br.com.caicaielevador.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdPessoas;
	private int andarAtual;

	public String retornarNome() {
		return nome;
	}
	public void preencherNome (String param) {
		nome = param;

	}

	public void inicializar (int pAndarMax, int pAndarMin, int pCapPessoas) {
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapPessoas;
	}
	public String retornarResumo() {
		return "Nome...: " + nome + "\n" +
				"Andar.: " + andarAtual + "\n" +
				"Nº pessoas: " + qtdPessoas;
	}

	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual+=1;
			return "Subindo";
		}
		else {
			return "Já está no ultimo andar";}

	}


	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual-=1;
			return "Descendo";
		}
		else {
			return "Já está no andar minimo";}

		}

	public void sair() {
		
		if (qtdPessoas>0) {
			qtdPessoas-=1;}
		
	}
	public void entrar(int qtde) {
		int resultado = qtdPessoas + qtde;
		if(resultado<=capacidadePessoas) {
			qtdPessoas+=qtde;
		}
		
	}
	public void sair (int qtde) {
		int resultado = qtdPessoas = qtde;
		if(resultado>=0) {
			qtdPessoas-=qtde;
		}
	}
	
	


}



