package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		String email = "biaNca.gbarrOs@hotmail.cOm";
		System.out.println("Original:" + email);
		System.out.println("Minuscula:" + email.toLowerCase());
		System.out.println("Maiusculo:" + email.toUpperCase());
		System.out.println("Tem arroba?:" + email.contains("@"));
		System.out.println("Posi��o do @:" + email.indexOf("@"));
		System.out.println ("Qtdd Caracteres:" + email.length());
		System.out.println("Do 2� at� o quinto caracter:" + email.substring(1,5));
		System.out.println("Primeira metade:" + email.substring(0, email.length()/2));
		System.out.println("Usu�rio:" + email.substring(0, email.indexOf("@")));
		System.out.println("Servidor:" + email.substring(email.indexOf("@")+1,email.length()));
		//n�o precisa ter a coordenada final
		System.out.println("Primeiro caracter: "+ email.charAt(5));
		
		
		//boas praticas para nomenclatura
		
		/*
		 * Identificadores (nomes dos elementos que criamos: variaveis, classes
		 * pacotes etc
		 * - Regras:
		 * 1� - N�o come�ar com n�mero. exemplo: 1berto
		 * 2� - N�o utilizar palavras reservadas. Ex: int, double, class
		 * 3� - N�o utilizar caracteres especiais (espa�o e acento tb). Exemplo: n@me, espa�o, tr#s
		 * - Padr�es:
		 * 1) CamelCase: da segunda palavra em diante (em uma composi��o)
		 * deve come�ar com letra maiuscula
		 * certo -> dataNascimento
		 * errado -> datanascimento
		 * certo -> data_nascimento
		 * errado -> data_Nascimento
		 * 
		 * 2) UML: � responsavel por padronizar elementos da Orienta��o a objetos
		 * - Toda classe deve come�ar com letra Maiuscula
		 * - Toda variavel/pacote deve come�ar com letra minuscula
		 * - Todo m�todo deve come�ar com letra minuscula e deve ser seguido de parenteses
		 * 
		 * xpto -> � uma variavel
		 * XPto -> � uma classe
		 * xpto()-> � uma fun��o
		 * Xpto.xpto() -> � um m�todo
		 * 
		 */
	
				
	}

}
