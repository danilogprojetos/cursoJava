package exemplo9.classe_abstrata;

public abstract class Veiculo {

	private String nome;
	
	public Veiculo(String nome){
		this.nome = nome;
	}
	//É possivel ter métodos concretos
	public abstract void mover();
	public abstract String getPosicao();
}
