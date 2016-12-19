package revisao_ultima_aula;
//Implementa registravel porque funcionario bate ponto 
public class Funcionario implements Registravel {

	String nome;
	String cpf;
	double salario;
	
	public String getNome (){
		return nome;
	}
	
	//Trabalho com o metodo da Classe Funcionario
	public void setNome(String nome){
		this.nome = nome;
	}
}
