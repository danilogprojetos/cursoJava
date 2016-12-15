package revisao_geral.heranca;

public class Funcionario {

	private String nome;
	private String cpf;
	public double salario;
	
	//Contrutor
	//public Funcionario(String nome){
		
//	}
	// Metodo - diferença entre o construtor e o metodo, é que no meu metodo eu posso ter um retorno
	public double getBonificacao(){
		//Retornando o salario vezes 10%
		return salario* 0.10;
	}
	
}
