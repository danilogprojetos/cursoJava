package exemplo1.classe_objeto.exercicio;

public class Livro {

	String titulo;
	String subTitle;
	int numeroPagina;
	int custo;	
	int total;
	
	public Livro (String titulo){
		this.titulo = titulo;
		
	}
	
	public void numeroPagina(){
		numeroPagina ++;
	}
	
	public void custo(){
		custo = numeroPagina *3;
		total *= custo;
	}
	
	public void imprimir(){
		System.out.println("Titulo " + titulo + " \nSubtitulo " + subTitle + "\nCusto: " + custo + "\nNumeroPagina: " + numeroPagina);
	}
	
}