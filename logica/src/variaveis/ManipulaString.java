package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		String email = "biaNca.gbarrOs@hotmail.cOm";
		System.out.println("Original:" + email);
		System.out.println("Minuscula:" + email.toLowerCase());
		System.out.println("Maiusculo:" + email.toUpperCase());
		System.out.println("Tem arroba?:" + email.contains("@"));
		System.out.println("Posição do @:" + email.indexOf("@"));
		System.out.println ("Qtdd Caracteres:" + email.length());
		System.out.println("Do 2º até o quinto caracter:" + email.substring(1,5));
		System.out.println("Primeira metade:" + email.substring(0, email.length()/2));
		System.out.println("Usuário:" + email.substring(0, email.indexOf("@")));
		System.out.println("Servidor:" + email.substring(email.indexOf("@")+1,email.length()));
		//não precisa ter a coordenada final
		System.out.println("Primeiro caracter: "+ email.charAt(5));
		
		
		//boas praticas para nomenclatura
		
		/*
		 * Identificadores (nomes dos elementos que criamos: variaveis, classes
		 * pacotes etc
		 * - Regras:
		 * 1º - Não começar com número. exemplo: 1berto
		 * 2º - Não utilizar palavras reservadas. Ex: int, double, class
		 * 3º - Não utilizar caracteres especiais (espaço e acento tb). Exemplo: n@me, espaço, tr#s
		 * - Padrões:
		 * 1) CamelCase: da segunda palavra em diante (em uma composição)
		 * deve começar com letra maiuscula
		 * certo -> dataNascimento
		 * errado -> datanascimento
		 * certo -> data_nascimento
		 * errado -> data_Nascimento
		 * 
		 * 2) UML: é responsavel por padronizar elementos da Orientação a objetos
		 * - Toda classe deve começar com letra Maiuscula
		 * - Toda variavel/pacote deve começar com letra minuscula
		 * - Todo método deve começar com letra minuscula e deve ser seguido de parenteses
		 * 
		 * xpto -> é uma variavel
		 * XPto -> é uma classe
		 * xpto()-> é uma função
		 * Xpto.xpto() -> é um método
		 * 
		 */
	
				
	}

}
