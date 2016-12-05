package exemplo9.classe_abstrata;

public abstract class Veiculo {

	private String nome;
	
	public Veiculo(String nome){
		this.nome = nome;
	}
	//� possivel ter m�todos concretos
	public abstract void mover();
	public abstract String getPosicao();
}
