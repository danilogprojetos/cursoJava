package revisao_geral;

public class TestaLivro {

	public static void main(String[] args) {
		// Nome (Livro) vem da classe principal classe Principal  
		// Construtor sem nenhum parametro vindo da classe m�e
		//livroJava � um objetos do meu construtor da classe m�e que n�o contem nenhum parametro
		Livro livroJava = new Livro();
		
		//ingles � um objeto do construtor da classe mae que contem os dois parametros nome e subTitle
		Livro ingles = new Livro("Lingas","ingles&portugues");
	   //UseACabeca � um objetos do construtor da classe mae que contem tres paramentros, sumario, pagina e aberto
		Livro UseACabeca = new Livro("teste",124,true);
		
	}

}
