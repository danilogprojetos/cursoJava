package polimorfismo;

public class Gerente extends Funcionario{

	String senha;
	int numeroDeFuncionarios;
	
	
	public double getBonificacao(){
		return salario * 0.15;
	}
}
