package exemplo9.classe_abstrata_2;

public class Gerente extends Funcionarios {

	String senha;
	int numeroDeFuncionarios;
	@Override
	public double getbonificacao() {
		// TODO Auto-generated method stub
		return salario * 0.15;
	}
	
	
}
