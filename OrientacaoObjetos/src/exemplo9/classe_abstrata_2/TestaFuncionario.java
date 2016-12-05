package exemplo9.classe_abstrata_2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionarios a = new Gerente();
		a.nome = "Antonio";
		a.cpf = "09805631940";
		a.salario = 1289.45;
	
		
		Gerente b = new Gerente();
		b.nome ="Marcos";
		b.cpf = "0102102120";
		b.salario = 250000;
		
			
	}

			
}
