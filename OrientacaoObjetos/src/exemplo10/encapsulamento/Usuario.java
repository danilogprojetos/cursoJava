package exemplo10.encapsulamento;

public class Usuario {

	private String nome;
	private String senha;
	private boolean logado;

	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		// ! funciona para ver se o nome não esta vazio
		if (!nome.isEmpty())
		this.nome = nome;
	}
	public boolean isLogado() {
		return logado;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
		
	
}
