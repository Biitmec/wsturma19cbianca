package br.com.rubinhocar.modelo;

public class Veiculo {

	private String modelo;
	private double valor;
	private int velocidadeAtual;
	private boolean status;
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo do param) (nome do param),...){
	//private o metodo é liberado para a mesma classe


	public String retornarModelo() {
		return modelo;
	}
	public void preencherModelo (String param) {
		// public saiu o + do projeto
		//void saiu do tipo do dado void no projeto
		//preencher modelo do nome do atributo
		// string do tipo do param
		if(param.length()<10) {
			modelo = param.toUpperCase();
		}
	}
	public void preencherValor(double param) {
		if(param>0) {
		valor = param;
	}
	}
	public double retornarValor() {
		return valor;
	}
	public String ligar () {
		status = true;
		return "Ligado";
	}
	public String desligar() {
		velocidadeAtual = 0;
		status = false;
		return "Desligado";
	}
	public void acelerar(int param) {
		if (status==true);
		velocidadeAtual+=param;
	}

	public void desacelerar(int param) {
		if(status==true | velocidadeAtual>=param);//não tinha especificação de vel>param, mas é boa pratica
		velocidadeAtual-=param;
	}
	public void desacelerar() {
		velocidadeAtual=0;
	}
	public String retornarTudo() {
		String xpto = "NÃO";
		if (status == true){
			xpto = "SIM";
		}
		return 
				("Modelo...: " + modelo + "\n"+
				"Valor.....: " + valor + "\n" +
				"Ligado....: " + xpto + "\n" +
				"Velocidade: " + velocidadeAtual);
				
	}
}
